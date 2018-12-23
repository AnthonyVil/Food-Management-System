package gr.hua.dit.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.entity.Student;
import gr.hua.dit.entity.University;

@Repository
public class DocumentManagerServiceImpl implements DocumentManagerDAO {
	
	// inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String CheckDocuments(String username, String approved_documents) {
		// create a new session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> student = currentSession.createQuery("from Student c where c.username= ?", Student.class).setParameter(0,username);
		List<Student> resultlist = student.getResultList();
		
		String exist,q;
		if(resultlist.isEmpty()) {
			exist = "User does not exist, so I cannot check his documents";
		}else {
			String documents = resultlist.get(0).getDocuments();
			if(documents.equals("Yes")) {
				exist = "Documents checked";
				q = "Update Student set document_isValidated = ? where username = ?";
				currentSession.createQuery(q).setParameter(0, approved_documents).setParameter(1, username).executeUpdate();
			}else {
				exist = "Student does not have the appropriate number of documents";
			}
		}
		return exist;
	}

	@Override
	public String UpdateRating(String username) {
		// create a new session
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<University> university = currentSession.createQuery("from University");
		List<University> uniList = university.getResultList();
		
		Query<Student> student = currentSession.createQuery("from Student c where c.username= ?", Student.class).setParameter(0,username);
		List<Student> resultlist = student.getResultList();
		
		String exist=null;
		int rate = 0;
		if(resultlist.isEmpty()) {
			exist = "User does not exist, so I cannot rate him";
		}else {
			String documents = resultlist.get(0).getDocument_isValidated();
			String submittedForm = resultlist.get(0).getHas_submitted_form();
			if(submittedForm.equals("No")) {
				exist = ""+username+" has not submitted any form";
			}else {
				if(documents.equals("Yes")) {
					int student_income = resultlist.get(0).getStudent_income();
					String mother_job = resultlist.get(0).getMother_job();
					String father_job = resultlist.get(0).getFather_job();
					int family_income = resultlist.get(0).getFamily_income();
					String siblings = resultlist.get(0).getSiblings();
					String home_town = resultlist.get(0).getHome_town();
					String campus_location = uniList.get(0).getCampus_location();
					
					if(student_income == 0 && mother_job.equals("No") && father_job.equals("No")) {
						rate = 200;
					}
					if(family_income <10000) {
						rate+= 100;
					}else if(family_income>10000 && family_income<15000) {
						rate+= 30;
					}
					if(siblings.equals("Yes")) {
						rate+=20;
					}
					if(home_town != campus_location) {
						rate+=50;
					}
					resultlist.get(0).setStudent_rating(rate);
					exist = "Rate has been updated";
				}else {
					exist=""+username+"'s documents have not been approved or evaluated yet";
				}
			}
			
		}
		
		return exist;
	}

}
