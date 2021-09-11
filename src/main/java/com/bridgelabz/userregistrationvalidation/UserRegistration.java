package com.bridgelabz.userregistrationvalidation;

public class UserRegistration {
	
	public static boolean checkFirstName(String firstName) {

		String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
		return firstName.matches(regularExpression);
	} 
}
