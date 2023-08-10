package com.examination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table
@Setter
@ToString
@Data
@Getter

public class Exam {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	//@Length(min=3,max=40,message="product name must be between 3-40 characters")
	private String userName;
	private String password;
	private String confirmpassword;
	private String firstName;
	private String lastName;
	//@Email(message="email address not valid!!")
	private String email;
	private Long phone;
	
	@Override
	public String toString() {
		return "Exam [id=" + id + ", userName=" + userName + ", password=" + password + ", confirmpassword="
				+ confirmpassword + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
