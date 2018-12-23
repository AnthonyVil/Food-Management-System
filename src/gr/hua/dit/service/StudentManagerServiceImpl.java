package gr.hua.dit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.DAO.StudentManagerDAO;
import gr.hua.dit.entity.Student;

@Service
public class StudentManagerServiceImpl implements StudentManagerService {

	// inject the CustomerDAO
	@Autowired
	private StudentManagerDAO StudentManagerDAO;

	@Override
	@Transactional
	public void AddStudent(String username, String password, String homeTown, String documents, int studentIncome,
			int familyIncome, String motherJob, String fatherJob, String siblings) {
		StudentManagerDAO.AddStudent(username, password, homeTown,documents,studentIncome,familyIncome,motherJob,fatherJob,siblings);
		
	}

	@Override
	@Transactional
	public void DeleteStudent(String username) {
		StudentManagerDAO.DeleteStudent(username);
		
	}

	@Override
	@Transactional
	public void UpdateStudent(String column, String newValue, String existStudent) {
		StudentManagerDAO.UpdateStudent(column, newValue, existStudent);
	}

	@Override
	@Transactional
	public String CheckStudent(String username) {
		return StudentManagerDAO.CheckStudent(username);
	}

	@Override
	@Transactional
	public List<Student> GetStudentTable() {
		return StudentManagerDAO.GetStudentTable();
	}

	@Override
	@Transactional
	public String SubmitForm(String username, String subForm) {
		return StudentManagerDAO.SubmitForm(username, subForm);
	}
}

