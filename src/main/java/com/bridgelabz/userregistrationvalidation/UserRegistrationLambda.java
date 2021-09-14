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
}
