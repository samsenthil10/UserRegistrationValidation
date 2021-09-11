package com.bridgelabz.userregistrationvalidation;

public class UserRegistration {
	
	public static boolean checkName(String name) {

		String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
		return name.matches(regularExpression);
	}
}
