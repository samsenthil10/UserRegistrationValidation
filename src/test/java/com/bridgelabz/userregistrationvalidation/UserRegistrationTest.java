package com.bridgelabz.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {

		boolean isValid= UserRegistration.validateName("Test");
		Assert.assertTrue(isValid);
	}
}
