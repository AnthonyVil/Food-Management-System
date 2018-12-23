package gr.hua.dit.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.DAO.SupervisorDAO;

@Service
public class SupervisorServiceImpl implements SupervisorService {
	
	// inject the CustomerDAO
	@Autowired
	private SupervisorDAO SupervisorDAO;

	@Override
	@Transactional
	public void UpdateMaxStudents(String numberofStudents) {
		SupervisorDAO.UpdateMaxStudents(numberofStudents);
	}

}
