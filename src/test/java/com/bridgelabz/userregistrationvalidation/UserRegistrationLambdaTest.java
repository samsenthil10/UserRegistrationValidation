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
	@Test
	public void givenLastName_WhenNull_ShouldReturnNull() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateName.validate(null);
		}
		catch(UserException e) {
			Assert.assertEquals(ExceptionType.NAME_NULL,e.type);
		}
	}
	@Test
	public void givenLastName_WhenInvalid_ShouldReturnInvalid() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateName.validate("Ov");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_INVALID,e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnEmpty() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateName.validate("");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_EMPTY,e.type);
		}
	}
	@Test
	public void givenEmail_WhenNull_ShouldReturnNull() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateEmail.validate(null);
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.EMAIL_NULL,e.type);
		}
	}
	@Test
	public void givenEmail_WhenInvalid_ShouldReturnInvalid() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateEmail.validate("abc.com");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.EMAIL_INVALID,e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldReturnEmpty() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validateEmail.validate("");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.EMAIL_EMPTY,e.type);
		}
	}

	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnNull() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration .validatePhoneNumber.validate(null);
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PHONE_NULL ,e.type);
		}
	}	
	@Test
	public void givenPhoneNumber_WhenInvalid_ShouldReturnInvalid() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration .validatePhoneNumber.validate("9099999999");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PHONE_INVALID ,e.type);
		}
	}
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnEmpty() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration .validatePhoneNumber.validate("");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PHONE_EMPTY ,e.type);
		}
	}
	@Test
	public void givenPassword_WhenNull_ShouldReturnNull() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validatePassword.validate(null);
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PASSWORD_NULL,e.type);
		}
	}
	@Test
	public void givenPassword_WhenInvalid_ShouldReturnInvalid() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validatePassword.validate("Testover@@123");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PASSWORD_INVALID,e.type);
		}
	}
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnEmpty() {
		UserRegistrationLambda userRegistration = new UserRegistrationLambda();
		try {
			userRegistration.validatePassword.validate("");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PASSWORD_EMPTY,e.type);
		}
	}
}
