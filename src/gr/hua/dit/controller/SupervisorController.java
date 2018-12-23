package gr.hua.dit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.service.SupervisorService;

@Controller
@RequestMapping("/supervisor")
public class SupervisorController {
	
	@Autowired
	private SupervisorService SupervisorService ;

	@RequestMapping("/SupervisorMenu")
	public String AdminMenu() {
		return "Supervisor/SupervisorMenu";
	}
	
	@GetMapping("/UpdateMaxStudents")
	public String UpdateMaxStudents() {
		return "Supervisor/UpdateMaxStudents";
	}
	
	@PostMapping("UpdatedMaxStudents")
	public String UpdatedMaxStudents(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		String numberofStudents = request.getParameter("numberofStudents");
		SupervisorService.UpdateMaxStudents(numberofStudents);
		return "redirect:/supervisor/UpdateMaxStudents";
	}
}
