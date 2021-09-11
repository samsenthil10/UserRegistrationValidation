package com.bridgelabz.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.userregistrationvalidation.UserException.ExceptionType;


public class UserRegistrationCustomTest {

	@Test
	public void givenFirstName_WhenNull_ShouldReturnNull() {

		try {
			UserRegistrationCustom.validateName(null);
		}
		catch(UserException e) {
			Assert.assertEquals(ExceptionType.NAME_NULL,e.type);
		}
	}
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnInvalid() {

		try {
			UserRegistrationCustom.validateName("Te");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_INVALID,e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnEmpty() {

		try {
			UserRegistrationCustom.validateName("");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_EMPTY,e.type);
		}
	}
}
