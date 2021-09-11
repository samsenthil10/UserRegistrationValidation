package com.bridgelabz.userregistrationvalidation;

public class UserRegistration {
	
	public static boolean checkName(String name) {

		String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
		return name.matches(regularExpression);
	}
	
	public static boolean checkEmail(String email) {

		String finalRegularExpressionToCheckEmail = "((((abc)[a-zA-Z0-9]*)||(abc[_\\+\\-\\.][a-zA-Z0-9]*))+(?<!\\.)@([0-9a-zA-Z]{1,}))\\.(([a-zA-Z]{2,}\\.[a-zA-Z]{2})||([a-zA-Z\\,]{2,}))+(?<!\\.)$";
		return email.matches(finalRegularExpressionToCheckEmail);
	}
}
