package gr.hua.dit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.service.DocumentManagerService;

//each method calls a jsp that may return user given parameters
@Controller
@RequestMapping("/documentmanager")
public class DocumentManagerController {

	@Autowired
	private DocumentManagerService DocumentManagerService;
	
	@RequestMapping("/DocumentManagerMenu")
	public String DocumentManagerMenu() {
		return "DocumentManager/DocumentManagerMenu";
	}
	
	@GetMapping("/CheckDocuments")
	public String CheckDocuments() {
		return "DocumentManager/CheckDocuments";
	}
	
	@PostMapping("/CheckedDocuments")
	public String CheckedDocuments(HttpServletRequest request, HttpServletResponse res, Model model) throws ServletException, IOException {
		String username = request.getParameter("username");
		String approved_documents = request.getParameter("appdoc");
		
		String exist = DocumentManagerService.CheckDocuments(username, approved_documents);
		model.addAttribute("exist", exist);
		return "redirect:/documentmanager/CheckDocuments";
	}
	
	@GetMapping("/UpdateRating")
	public String UpdateRating() {
		return "DocumentManager/UpdateRating";
	}
	
	@PostMapping("/UpdatedRating")
	public String UpdatedRating(HttpServletRequest request, HttpServletResponse res, Model model) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		String exist = DocumentManagerService.UpdateRating(username);
		model.addAttribute("exist", exist);
		return "redirect:/documentmanager/UpdateRating";
	}
}