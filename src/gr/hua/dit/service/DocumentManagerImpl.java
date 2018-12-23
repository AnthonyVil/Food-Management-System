package gr.hua.dit.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gr.hua.dit.DAO.DocumentManagerDAO;

@Service
public class DocumentManagerImpl implements DocumentManagerService {
	
	// inject the CustomerDAO
		@Autowired
		private DocumentManagerDAO DocumentManagerDAO;

	@Override
	@Transactional
	public String CheckDocuments(String username, String approved_documents) {
		return DocumentManagerDAO.CheckDocuments(username, approved_documents);
	}

	@Override
	@Transactional
	public String UpdateRating(String username) {
		return DocumentManagerDAO.UpdateRating(username);
	}

}
