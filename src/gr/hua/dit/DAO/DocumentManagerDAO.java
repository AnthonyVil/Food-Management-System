package gr.hua.dit.DAO;

public interface DocumentManagerDAO {

	public String CheckDocuments(String username, String approved_documents);
	public String UpdateRating(String username);
}
