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
	@Test
	public void givenLastName_WhenNull_ShouldReturnNull() {

		try {
			UserRegistrationCustom.validateName(null);
		}
		catch(UserException e) {
			Assert.assertEquals(ExceptionType.NAME_NULL,e.type);
		}
	}
	@Test
	public void givenLastName_WhenInvalid_ShouldReturnInvalid() {

		try {
			UserRegistrationCustom.validateName("Ov");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_INVALID,e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnEmpty() {

		try {
			UserRegistrationCustom.validateName("");
		} catch (UserException e) {
			Assert.assertEquals(ExceptionType.NAME_EMPTY,e.type);
		}
	}
	@Test
	public void givenEmail_WhenNull_ShouldReturnNull() {

		try {
			UserRegistrationCustom.validateEmail(null);
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.EMAIL_NULL,e.type);
		}
	}
	@Test
	public void givenEmail_WhenInvalid_ShouldReturnInvalid() {

		try {
			UserRegistrationCustom.validateEmail("abc.com");
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.EMAIL_INVALID,e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldReturnEmpty() {

		try {
			UserRegistrationCustom.validateEmail(null);
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.EMAIL_EMPTY,e.type);
		}
	}
	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnNull() {

		try {
			UserRegistrationCustom.validatePhoneNumber(null);
		} catch (UserException e) {

			Assert.assertEquals(ExceptionType.PHONE_NULL ,e.type);
		}
	}	
}