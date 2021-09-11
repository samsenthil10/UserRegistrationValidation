package com.bridgelabz.userregistrationvalidation;

@SuppressWarnings("serial")
public class UserException extends RuntimeException {
	
enum ExceptionType {
		
		NAME_INVALID,
		NAME_NULL,
		NAME_EMPTY,
		PHONE_INVALID,
		PHONE_NULL,
		PHONE_EMPTY,
		EMAIL_INVALID,
		EMAIL_NULL,
		EMAIL_EMPTY,
		PASSWORD_INVALID,
		PASSWORD_NULL,
		PASSWORD_EMPTY
	}

	ExceptionType type;

	public UserException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}

}
