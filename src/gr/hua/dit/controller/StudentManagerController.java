package gr.hua.dit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.entity.Student;
import gr.hua.dit.entity.User;
import gr.hua.dit.service.StudentManagerService;

//each method calls a jsp that may return user given parameters
@Controller
@RequestMapping("/studentmanager")
public class StudentManagerController {

	// inject the User DAO
	@Autowired
	private StudentManagerService StudentManagerService;
		
	@RequestMapping("/StudentManagerMenu")
	public String AdminMenu() {
		return "StudentManager/StudentManagerMenu";
	}
	
	@GetMapping("/AddStudent")
	public String AddStudent() {
		return "StudentManager/AddStudent";
	}
	
	@PostMapping("/SaveStudent")
	public String SaveUser(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String homeTown = request.getParameter("homeTown");
		String documents = request.getParameter("documents");
		int studentIncome = Integer.parseInt(request.getParameter("studentIncome"));
		int familyIncome = Integer.parseInt(request.getParameter("familyIncome"));
		String motherJob = request.getParameter("motherJob");
		String fatherJob = request.getParameter("fatherJob");
		String siblings = request.getParameter("siblings");
		StudentManagerService.AddStudent(username, password, homeTown,documents,studentIncome,familyIncome,motherJob,fatherJob,siblings);
		return "redirect:/studentmanager/AddStudent";
	}
	
	@GetMapping("/DeleteStudent")
	public String DeleteStudent() {
		return "StudentManager/DeleteStudent";
	}
	
	@PostMapping("/RemoveStudent")
	public String DeleteStudent(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		String username = request.getParameter("username");
		if (!username.equals("null")) {
			StudentManagerService.DeleteStudent(username);
		}
		return "redirect:/studentmanager/DeleteStudent";
	}
	
	@GetMapping("/UpdateStudent")
	public String UpdateStudent() {
		return "StudentManager/UpdateStudent";
	}
	
	@PostMapping("/ModifiedStudent")
	public String ModifiedUser(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		String column = request.getParameter("column");
		String newValue = request.getParameter("value");
		String existStudent = request.getParameter("existUsername");
		StudentManagerService.UpdateStudent(column, newValue, existStudent);
		return "redirect:/studentmanager/UpdateStudent";
	}
	
	@GetMapping("/CheckStudent")
	public String CheckStudent() {
		return "StudentManager/CheckStudent";
	}
	
	@PostMapping("/CheckedStudent")
	public String CheckedStudent(HttpServletRequest request, HttpServletResponse res, Model model)
			throws ServletException, IOException {
		// get Users from DAO
		String username = request.getParameter("username");
		String exist = StudentManagerService.CheckStudent(username);
		model.addAttribute("exist", exist);
		return "redirect:/studentmanager/CheckStudent";
	}
	
	@RequestMapping("/GetStudentTable")
	public String GetStudentTable(Model model) {
		// get Users from DAO
		List<Student> student = StudentManagerService.GetStudentTable();

		// add the Users to the model
		model.addAttribute("student", student);

		return "StudentManager/GetStudentTable";
	}
	
	@GetMapping("/SubmitForm")
	public String SubmitForm() {
		return "StudentManager/SubmitForm";
	}
	
	@PostMapping("/SubmittedForm")
	public String SubmittedForm(HttpServletRequest request, HttpServletResponse res, Model model) throws ServletException, IOException {
		String username = request.getParameter("username");
		String subForm = request.getParameter("subForm");
		String exist = StudentManagerService.SubmitForm(username, subForm);
		
		model.addAttribute("exist", exist);
		return "redirect:/studentmanager/SubmitForm";
	}
}
