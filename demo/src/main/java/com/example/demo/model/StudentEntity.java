package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class StudentEntity {
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String degree;

	public StudentEntity() {
	}

	public StudentEntity(long id, String firstName,String lastName,String emailId,String degree) {
	this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.emailId = emailId;
    this.degree = degree;
	}
@Id
@GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY )
	public long getId() {
		return id;
		}
	public void setId(long id) {
	this.id = id;
		}
@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
		}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		}
@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
@Column(name = "degree", nullable = false)
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	
@Override
	public String toString() {
		//Coverted object as a string - override the toString() of the Object class
		return "Student [id=" + id + ", firstName=" + firstName +", lastName=" + lastName +" ,emailId=" + emailId +" degree=" + degree + "]";
		}

}
