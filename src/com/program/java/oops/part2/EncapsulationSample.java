package com.program.java.oops.part2;

class UserDetails {

	// global variable
	private int id;
	private String username;
	private String emailId;
	private long phoneNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}


// this - > to access the current class global variable

public class EncapsulationSample {

	public static void main(String[] args) {
		
		UserDetails userDetails = new UserDetails();
		
		userDetails.setId(1);
		userDetails.setUsername("Raja");
		userDetails.setEmailId("raja@gmail.com");
		
		System.out.println(userDetails.getUsername());

	}

}

// It is the process of wrapping code & data into a single unit

// getter & setter methods