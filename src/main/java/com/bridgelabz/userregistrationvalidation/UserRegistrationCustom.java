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
}