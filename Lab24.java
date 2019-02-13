package smartbatch;

import java.util.*;

public class Lab24 {
	private String firstname;
	private String lastname;
	private char gender;
	private long phone;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Lab24(String firstname, String lastname, char gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
	}

	public void addDetails(long phone) {
		this.phone = phone;
		
	}
}
