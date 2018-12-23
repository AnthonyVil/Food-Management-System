package gr.hua.dit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Student")
@Entity
@Table(name = "STUDENT")
public class Student {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4310661683443846471L;

	/**
	 * 
	 */
	
	@Id
	@Column(name = "student_register_number")
	private int student_register_number;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;

	@Column(name = "home_town")
	private String home_town;

	@Column(name = "documents")
	private String documents;
	
	@Column(name = "student_income")
	private int student_income;
	
	@Column(name = "family_income")
	private int family_income;
	
	@Column(name = "mother_job")
	private String mother_job;

	@Column(name = "father_job")
	private String father_job;

	@Column(name = "siblings")
	private String siblings;

	@Column(name = "document_isValidated")
	private String document_isValidated;

	@Column(name = "student_rating")
	private int student_rating;
	
	@Column(name = "has_submitted_form")
	private String has_submitted_form;

	public Student() {
		
	}
	public Student(int student_register_number, String username, String password, String home_town, String documents, int student_income,
			int family_income, String mother_job, String father_job, String siblings) {
		super();
		this.student_register_number = student_register_number;
		this.username = username;
		this.password = password;
		this.home_town = home_town;
		this.documents = documents;
		this.student_income = student_income;
		this.family_income = family_income;
		this.mother_job = mother_job;
		this.father_job = father_job;
		this.siblings = siblings;
	}
	
	public String getDocument_isValidated() {
		return document_isValidated;
	}

	public void setDocument_isValidated(String document_isValidated) {
		this.document_isValidated = document_isValidated;
	}

	public int getStudent_rating() {
		return student_rating;
	}

	public void setStudent_rating(int student_rating) {
		this.student_rating = student_rating;
	}

	
	public int getStudent_register_number() {
		return student_register_number;
	}

	public void setStudent_register_number(int student_register_number) {
		this.student_register_number = student_register_number;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHome_town() {
		return home_town;
	}

	public void setHome_town(String home_town) {
		this.home_town = home_town;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public int getStudent_income() {
		return student_income;
	}

	public void setStudent_income(int student_income) {
		this.student_income = student_income;
	}

	public int getFamily_income() {
		return family_income;
	}

	public void setFamily_income(int family_income) {
		this.family_income = family_income;
	}

	public String getMother_job() {
		return mother_job;
	}

	public void setMother_job(String mother_job) {
		this.mother_job = mother_job;
	}

	public String getFather_job() {
		return father_job;
	}

	public void setFather_job(String father_job) {
		this.father_job = father_job;
	}

	public String getSiblings() {
		return siblings;
	}

	public void setSiblings(String siblings) {
		this.siblings = siblings;
	}
	public String getHas_submitted_form() {
		return has_submitted_form;
	}
	public void setHas_submitted_form(String has_submitted_form) {
		this.has_submitted_form = has_submitted_form;
	}

}
