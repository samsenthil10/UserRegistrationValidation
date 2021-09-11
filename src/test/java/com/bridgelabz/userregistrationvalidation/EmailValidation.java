package com.bridgelabz.userregistrationvalidation;

import org.junit.Assert;
import org.junit.Test;


public class EmailValidation {

	@Test
	public void givenValidEmail_ShouldReturnValid() {

		String[] testCases = {
				"abc.xyz@bridgelabz.co.in",
				"abc@yahoo.com,",
				"abc-100@yahoo.com,",
				"abc.100@yahoo.com",
				"abc111@abc.com,",
				"abc-100@abc.net,",
				"abc.100@abc.com.au",
				"abc@1.com,",
				"abc+100@gmail.com",
		};

		for(int index = 0;index < testCases.length;index++) {
			String email = testCases[index];
			Assert.assertEquals(true, UserRegistration.validateEmail(email));
		}
	}

	@Test
	public void givenInvalidEmail_ShouldReturnInvalid() {

		String[] testCases = {
				"abc",
				"abc@gmail.com.com",
				"abc@.com.my",
				"abc123@gmail.a",
				"abc123@.com",
				"abc123@.com.com",
				".abc@abc.com",
				"abc()*@gmail.com",
				"abc@%*.com",
				"abc..2002@gmail.com",
				"abc.@gmail.com",
				"abc@abc@gmail.com",
				"abc@gmail.com.1a",
				"abc@gmail.com.aa.au"
		};

		for(int index = 0;index < testCases.length;index++) {
			String email = testCases[index];
			Assert.assertEquals(false, UserRegistration.validateEmail(email));
		}
	}
}