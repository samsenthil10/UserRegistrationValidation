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
}
