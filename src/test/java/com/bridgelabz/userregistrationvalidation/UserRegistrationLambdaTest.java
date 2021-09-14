package com.bridgelabz.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.userregistrationvalidation.UserException.ExceptionType;

public class UserRegistrationLambdaTest {

	@Test
	public void givenFirstName_WhenNull_ShouldReturnNull() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateName.validate(null);
		}
		catch(UserException e) {
			Assert.assertEquals(ExceptionType.NAME_NULL,e.type);
		}
	}
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnInvalid() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateName.validate("Te");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_INVALID,e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnEmpty() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateName.validate("");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_EMPTY,e.type);
		}
	}
}
