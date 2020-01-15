package com.nopCommerceAutomation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerceAutomation.base.BaseTest;
import com.nopCommerceAutomation.pages.RegisterPage;

public class RegisterPageTest extends BaseTest {

	RegisterPage registerPage;

	public RegisterPageTest() {

		super();

	}

	@BeforeMethod
	public void setUp() {
		initilization();
		registerPage = new RegisterPage();
	}

	@Test(priority = 1)
	public void 
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
