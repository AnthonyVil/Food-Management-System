package gr.hua.dit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERMISSIONS")
public class Permissions {

	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "services")
	private String services;

	@Column(name = "supervisor")
	private String supervisor;

	@Column(name = "student_manager")
	private String student_manager;

	@Column(name ="document_manager")
	private String document_manager;
	
	@Column(name = "administrator")
	private String administrator;

	//Constructors
	public Permissions() {

	}

	public Permissions(String services, String supervisor, String student_manager, String document_manager, String administrator) {
		super();
		this.services = services;
		this.supervisor = supervisor;
		this.student_manager = student_manager;
		this.document_manager = document_manager;
		this.administrator = administrator;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getStudent_manager() {
		return student_manager;
	}

	public void setStudent_manager(String student_manager) {
		this.student_manager = student_manager;
	}

	public String getDocument_manager() {
		return document_manager;
	}

	public void setDocument_manager(String document_manager) {
		this.document_manager = document_manager;
	}

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	@Override
	public String toString() {
		return "Permissions [id=" + id + ", services=" + services + ", secretary=" + supervisor + ", engineer="
				+ student_manager + ", administrator=" + administrator + "]";
	}

}
