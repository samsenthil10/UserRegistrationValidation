package com.bridgelabz.userregistrationvalidation;

public class UserRegistration {

	public static boolean validateName(String name) {

		String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
		return name.matches(regularExpression);
	}

	public static boolean validateEmail(String email) {

		String finalRegularExpressionTovalidateEmail = "((((abc)[a-zA-Z0-9]*)||(abc[_\\+\\-\\.][a-zA-Z0-9]*))+(?<!\\.)@([0-9a-zA-Z]{1,}))\\.(([a-zA-Z]{2,}\\.[a-zA-Z]{2})||([a-zA-Z\\,]{2,}))+(?<!\\.)$";
		return email.matches(finalRegularExpressionTovalidateEmail);
	}

	public static boolean validatePhoneNumber(String phoneNumber) {

		String regularExpression = "[0-9]*\\ [1-9][0-9]{9}";
		return phoneNumber.matches(regularExpression);
	}

	public static boolean validatePassword(String password) {

		String regularExpression = "^(?=.*[0-9])(?=.*[A-Z])(?=.{8,}$)[0-9a-zA-Z]*[@#$%_][0-9a-zA-Z]*$";
		return password.matches(regularExpression);
	}
}
