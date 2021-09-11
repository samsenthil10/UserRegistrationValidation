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
}