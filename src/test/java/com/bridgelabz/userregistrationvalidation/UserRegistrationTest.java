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
}
