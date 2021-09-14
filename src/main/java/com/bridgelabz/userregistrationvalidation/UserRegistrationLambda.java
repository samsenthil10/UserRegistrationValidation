package com.bridgelabz.userregistrationvalidation;

import com.bridgelabz.userregistrationvalidation.UserException.ExceptionType;

public class UserRegistrationLambda {

	@FunctionalInterface
	interface IValidateUser {
		void validate(String stringToValidate) throws UserException;
	}

	IValidateUser validateName = name -> {

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
	};

	IValidateUser validateEmail = email -> {

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
	};
}
