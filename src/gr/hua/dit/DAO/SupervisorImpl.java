package gr.hua.dit.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SupervisorImpl implements SupervisorDAO {
	
	//Inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void UpdateMaxStudents(String numberofStudents) {
		//Create a new session
		int number = Integer.parseInt(numberofStudents);
		Session currentSession = sessionFactory.getCurrentSession();
//		University university = new University(1,number,"Kallithea");
//		currentSession.save(university);
		String q = "update University set max_students = ? where id = ?";
		currentSession.createQuery(q).setParameter(0, number).setParameter(1, 1).executeUpdate();
	}

}
