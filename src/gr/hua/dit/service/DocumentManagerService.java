package gr.hua.dit.service;

public interface DocumentManagerService {

	public String CheckDocuments(String username, String approved_documents);
	public String UpdateRating(String username);
}
