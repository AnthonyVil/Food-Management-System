package gr.hua.dit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Student;

import java.util.List;
import java.util.Random;

@Repository
public class StudentManagerImpl implements StudentManagerDAO{

	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void AddStudent(String username, String password, String homeTown, String documents, int studentIncome,
			int familyIncome, String motherJob, String fatherJob, String siblings) {
		Random rand = new Random();
		int student_register_number = rand.nextInt(50000) + 1;
		// create a new session
		Session currentSession = sessionFactory.getCurrentSession();
		Student student = new Student(student_register_number,username, password, homeTown,documents,studentIncome,familyIncome,motherJob,fatherJob,siblings);
		currentSession.save(student);
	}

	@Override
	public void DeleteStudent(String username) {
		//create a new session
    	Session currentSession = sessionFactory.getCurrentSession();
    	
    	Query<Student> student = currentSession.createQuery("from Student c where c.username= ?", Student.class).setParameter(0,username);
		List<Student> result = student.getResultList();
		try {
			currentSession.delete(result.get(0));
		}catch (Exception e) {
            e.printStackTrace();
		}
		
	}

	@Override
	public void UpdateStudent(String column, String newValue, String existStudent) {
		Session currentSession = sessionFactory.getCurrentSession();
		String q = null;
		if (column.equals("username")) {
			q = "update Student set username = ? where username = ?";
		} else if (column.equals("password")) {
			q = "update Student set password = ? where username = ?";
		} else if (column.equals("home_town")) {
			q = "update Student set home_town = ? where username = ?";
		} else if (column.equals("documents")) {
			q = "update Student set documents = ? where username = ?";
		} else if (column.equals("student_income")) {
			q = "update Student set student_income = ? where username = ?";
		} else if (column.equals("family_income")) {
			q = "update Student set family_income = ? where username = ?";
		} else if (column.equals("mother_job")) {
			q = "update Student set mother_job = ? where username = ?";
		} else if (column.equals("father_job")) {
			q = "update Student set father_job = ? where username = ?";
		} else if (column.equals("siblings")) {
			q = "update Student set siblings = ? where username = ?";
		}
		currentSession.createQuery(q).setParameter(0, newValue).setParameter(1, existStudent).executeUpdate();
	}

	@Override
	public String CheckStudent(String username) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> q = currentSession.createQuery("from Student u where u.username = ?",Student.class).setParameter(0,username);
		List<Student> userList = q.getResultList();
		String exist;
		if(userList.isEmpty()) {
			exist = "Student does not exist";
		} else {
			exist = "Student exists";
		}
		return exist;
	}

	@Override
	public List<Student> GetStudentTable() {
		// create a new session
		Session currentSession = sessionFactory.getCurrentSession();

		Query<Student> query = currentSession.createQuery("from Student order by student_rating desc", Student.class);

		// get all users from the table and add them to a list
		List<Student> student = query.getResultList();

		// return the results
		return student;
	}

	@Override
	public String SubmitForm(String username, String subForm) {
		// create a new session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> student = currentSession.createQuery("from Student c where c.username= ?", Student.class).setParameter(0,username);
		List<Student> resultlist = student.getResultList();
		
		String exist,q;
		if(resultlist.isEmpty()) {
			exist = "User does not exist, so I cannot submit ant forms";
		}else {
			String documents = resultlist.get(0).getDocument_isValidated();
			if(documents.equals("Yes")) {
				exist = "Form Submitted successfully";
				q = "Update Student set has_submitted_form = ? where username = ?";
				currentSession.createQuery(q).setParameter(0, subForm).setParameter(1, username).executeUpdate();
			}else {
				exist = "Student's documents have not been approved or evaluated yet";
			}
		}
		return exist;
	}
}