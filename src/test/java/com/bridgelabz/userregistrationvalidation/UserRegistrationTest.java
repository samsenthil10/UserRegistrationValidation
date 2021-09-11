package com.bridgelabz.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {

		boolean isValid= UserRegistration.validateName("Test");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {

		boolean isValid= UserRegistration.validateName("Te");
		Assert.assertFalse(isValid);
	}	
	
	@Test
	public void givenFirstName_WhenNotStartingWithBlock_ShouldReturnFalse() {

		boolean isValid= UserRegistration.validateName("test");
		Assert.assertFalse(isValid);
	}	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {

		boolean isValid= UserRegistration.validateName("Over");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {

		boolean isValid= UserRegistration.validateName("Ov");
		Assert.assertFalse(isValid);
	}	
	
	@Test
	public void givenLastName_WhenNotStartingWithBlock_ShouldReturnFalse() {

		boolean isValid= UserRegistration.validateName("over");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validateEmail("abc.xyz@bridgelabz.com");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		
		boolean isValid = UserRegistration.validateEmail("abc.xyz@bridgelabz");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validatePhoneNumber("90 9999999999");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper1_ShouldReturnFalse() {
		
		boolean isValid = UserRegistration.validatePhoneNumber("919999999999");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenNotProper2_ShouldReturnFalse() {
		
		boolean isValid = UserRegistration.validatePhoneNumber("91 999999999");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenNotProper3_ShouldReturnFalse() {
		
		boolean isValid = UserRegistration.validatePhoneNumber("9999999999");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validatePassword("testoVer@123");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenNotProper1_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validatePassword("t@estoVer@123");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenNotProper2_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validatePassword("testoVer@");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenNotProper3_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validatePassword("testover@1");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_WhenNotProper4_ShouldReturnTrue() {
		
		boolean isValid = UserRegistration.validatePassword("testOver1");
		Assert.assertFalse(isValid);
	}
}
