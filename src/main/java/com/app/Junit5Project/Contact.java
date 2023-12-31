package com.app.Junit5Project;

public class Contact {

	private String firstName;
	private String lastName;
	private String phoneNumber;

	public Contact(String firstName, String lastName, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public  void validateFirstName() {
		if(this.firstName.isBlank()) {
			throw new RuntimeException("first name can not be empty or null");
		}
		
	}
	public  void validateLastName() {
		if(this.lastName.isBlank()) {
			throw new RuntimeException("lastName  can  not be empty or null");
		}
		
	}
	public  void validatePhoneNumber() {
		if(this.phoneNumber.isBlank()) {
			throw new RuntimeException("phoneNumber is   can  not be empty or null");
		}
		if(this.phoneNumber.length()!=10) {
			throw new RuntimeException("Phone Number Should be 10 Digits Long");
		}
		if(!this.phoneNumber.matches("\\d+")) {
			throw new RuntimeException("Phone Number Contain only digits");
		}
		if(!this.phoneNumber.startsWith("0")) {
			throw new RuntimeException("Phone Number Should Start with 0");
		}
		
	}
	
	

}
