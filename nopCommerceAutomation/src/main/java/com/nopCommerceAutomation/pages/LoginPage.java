package com.nopCommerceAutomation.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerceAutomation.base.BaseTest;


public class LoginPage extends BaseTest {

	@FindBy(xpath = "//h1[contains(.,'Welcome, Please Sign In!')]")
	WebElement WelcomeMessage;
	
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//span[contains(@id,'Email-error')]")
	WebElement emailError;
	
	@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
	WebElement loginErrorMessage;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='Password']")
	WebElement password;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}
	public String getLoginPageWelcomeMessage() {
		return WelcomeMessage.getText();
	}
	public void clickonLoginButton() {
		LoginButton.click();
		
	}
	public String captureEmailErrorMessage() {
		return emailError.getText();
	}
	public String getLoginErrorMessage() {
		return loginErrorMessage.getText();
	}
	public void enterUserName(String username) {
		email.sendKeys(username);               // email and password coming from properties file // 
	}
	public void enterPassword(String userpassword) {
		password.sendKeys(userpassword);
	}

}
