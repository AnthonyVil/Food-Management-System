package gr.hua.dit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "University")
@Entity
@Table(name = "UNIVERSITY")
public class University {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "max_students")
	private int max_students;

	@Column(name = "campus_location")
	private String campus_location;
	
	public int getMax_students() {
		return max_students;
	}
	
	public void setMax_students(int max_students) {
		this.max_students = max_students;
	}

	public String getCampus_location() {
		return campus_location;
	}

	public void setCampus_location(String campus_location) {
		this.campus_location = campus_location;
	}
	
}
