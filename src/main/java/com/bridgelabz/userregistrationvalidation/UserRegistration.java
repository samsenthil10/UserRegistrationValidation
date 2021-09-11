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
	
	public static boolean checkPhoneNumber(String phoneNumber) {

		String regularExpression = "[0-9]*\\ [1-9][0-9]{9}";
		return phoneNumber.matches(regularExpression);
	}
	
	public static boolean checkPassword(String password) {

		String regularExpression = ".{8,}";
		return password.matches(regularExpression);
	}
}
