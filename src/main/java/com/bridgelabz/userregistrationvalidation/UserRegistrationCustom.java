package com.bridgelabz.userregistrationvalidation;

import com.bridgelabz.userregistrationvalidation.UserException.ExceptionType;

public class UserRegistrationCustom {

	public static void validateName(String name) throws UserException {

		try {
			String regularExpression = "[A-Z]+[a-zA-Z\\ ]{2,}";
			if (name.length()==0)
				throw new UserException("Invalid Name", ExceptionType.NAME_EMPTY);
			boolean result = name.matches(regularExpression);
			if(result == false)
				throw new UserException("Invalid Name", ExceptionType.NAME_INVALID);
		}
		catch(NullPointerException e) {
			throw new UserException("Invalid Name", ExceptionType.NAME_NULL);
		}
	}
	public static void validateEmail(String email) throws UserException {

		try {
			String finalRegularExpressionTovalidateEmail = "((((abc)[a-zA-Z0-9]*)||(abc[_\\+\\-\\.][a-zA-Z0-9]*))+(?<!\\.)@([0-9a-zA-Z]{1,}))\\.(([a-zA-Z]{2,}\\.[a-zA-Z]{2})||([a-zA-Z\\,]{2,}))+(?<!\\.)$";
			if (email.length()==0)
				throw new UserException("Invalid Email", ExceptionType.EMAIL_EMPTY);
			boolean result = email.matches(finalRegularExpressionTovalidateEmail);
			if(result == false)
				throw new UserException("Invalid Email", ExceptionType.EMAIL_INVALID);
		}
		catch(NullPointerException e) {
			throw new UserException("Invalid Email", ExceptionType.EMAIL_NULL);
		}
	}
	public static void validatePhoneNumber(String phoneNumber) throws UserException {

		try {
			String regularExpression = "[0-9]*\\ [1-9][0-9]{9}";
			if (phoneNumber.length()==0)
				throw new UserException("Invalid Phone Number", ExceptionType.PHONE_EMPTY);
			boolean result = phoneNumber.matches(regularExpression);
			if(result == false)
				throw new UserException("Invalid Phone Number", ExceptionType.PHONE_INVALID);
		}
		catch(NullPointerException e) {
			throw new UserException("Invalid Phone Number", ExceptionType.PHONE_NULL);
		}
	}
	public static void validatePassword(String password) throws UserException {

		try {
			String regularExpression = "^(?=.*[0-9])(?=.*[A-Z])(?=.{8,}$)[0-9a-zA-Z]*[@#$%_][0-9a-zA-Z]*$";
			if (password.length()==0)
				throw new UserException("Invalid Password", ExceptionType.PASSWORD_EMPTY);
			boolean result = password.matches(regularExpression);
			if(result == false)
				throw new UserException("Invalid Password", ExceptionType.PASSWORD_INVALID);
		}
		catch(NullPointerException e) {
			throw new UserException("Invalid Password", ExceptionType.PASSWORD_NULL);
		}
	}
}