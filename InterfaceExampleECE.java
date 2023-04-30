package com.javaprograms;


//Calling mutliple interface in a class to support multiple inhteritance
public class InterfaceExampleECE implements InterfaceCollege,CollegeOfficeDetails {

	@Override
	public void studentDetails() {
	
		System.out.println("Print the ECE Sutdent details");
		
	}

	@Override
	public void StudentResults() {
		
		System.out.println("Print the ECE Student results");
		
	}

	@Override
	public void OfficeDEtails() {
		// TODO Auto-generated method stub
		
	}

}
