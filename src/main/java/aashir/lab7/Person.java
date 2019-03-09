package aashir.lab7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "per")
public class Person {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "fatherName")
	private String father_name;
	@Column(name = "Organization")
	private String organization;
	@Column(name="Mobile")
	private String mobile;
	
	public Person() {}
	
	void setId(int id) {
		this.id = id;
	}
	int getId() {
		return id;
	}
	
	void setname(String fname) {
		name = fname;
	}
	String getname() {
		return name;
	}
	
	void setFather_name(String lname) {
		father_name = lname;
	}
	String getFather_name() {
		return father_name;
	}
	
	void setOrganization(String org) {
		organization = org;
	}
	String getOrganization() {
		return organization;
	}
	
	void setMobile(String mob) {
		mobile = mob;
	}
	String getMobile() {
		return mobile;
	}

}

