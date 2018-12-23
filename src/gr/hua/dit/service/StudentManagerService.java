package gr.hua.dit.service;

import java.util.List;

import gr.hua.dit.entity.Student;

public interface StudentManagerService {

	public void AddStudent(String username,String password,String homeTown,String documents,int studentIncome,int familyIncome,String motherJob,String fatherJob,String siblings);
	public void DeleteStudent(String username);
	public void UpdateStudent(String column, String newValue, String existStudent);
	public String CheckStudent(String username);
	public List<Student> GetStudentTable();
	public String SubmitForm(String username, String subForm);
}
