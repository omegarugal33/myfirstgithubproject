package com.nopCommerceAutomation.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopCommerceAutomation.base.BaseTest;
import com.nopCommerceAutomation.pages.HomePage;
import com.nopCommerceAutomation.pages.LoginPage;
import com.nopCommerceAutomation.pages.RegisterPage;
import com.nopCommerceAutomation.pages.ShopingListPage;
import com.nopCommerceAutomation.pages.WishListPage;

public class LoginPageTest extends BaseTest {

	HomePage homepage; // Page object Model//
	RegisterPage registerPage;
	LoginPage loginPage;
	ShopingListPage shopingCartPage;
	WishListPage wishlistpage;

	public LoginPageTest() {

		super(); // instentiation of the base class// super keyword
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		homepage = new HomePage();
		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		wishlistpage = new WishListPage();
		shopingCartPage = new ShopingListPage();
	}

	@Test(priority = 1)
	public void usergotoLoginPage() throws InterruptedException { // bu methodda user oncelikle homepage e gidecek ordan
																	// da logine tiklayacak //
		homepage.gotoLoginPage();
		Thread.sleep(2000);
		loginPage.clickonLoginButton();

		loginPage.captureEmailErrorMessage(); 
		String emailError = loginPage.captureEmailErrorMessage();
		Assert.assertEquals(emailError, "Please enter your email");
		//System.out.println(emailError);
	}
	@Test(priority = 2)
	public void verifyLoginErrorMessage() throws InterruptedException {              // we know that this test is going to fail cause not enoguh credential has been provided //
		homepage.gotoLoginPage();
		Thread.sleep(2000);
		loginPage.enterUserName(prop.getProperty("email"));
		loginPage.clickonLoginButton();
		String loginErrorMessage = loginPage.getLoginErrorMessage();
		Assert.assertTrue(loginErrorMessage.contains("Login was unsuccessful"));
		
	}
	@Test(priority = 3)
	public void validUserLoginTest() throws InterruptedException {
		homepage.gotoLoginPage();
		Thread.sleep(2000);
		loginPage.enterUserName(prop.getProperty("email"));
		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickonLoginButton();
	}
@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
