package com.nopCommerceAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerceAutomation.base.BaseTest;

public class RegisterPage extends BaseTest {

	@FindBy(xpath = "//h1[contains(text(),'Register')]")
	WebElement registerPageTitle;
	@FindBy(xpath = "//input[contains(@id,'FirstName')]")
	WebElement firstName;
	@FindBy(xpath = "//input[contains(@id,'LastName')]")
	WebElement lastName;

	public RegisterPage() {

		PageFactory.initElements(driver, this);
	}

	public String verifyRegisterPageTitle() {
		return registerPageTitle.getText();

	}

	public String writeFirstNameLastName(String first, String Last) {
		firstName.sendKeys("firstname");
		lastName.sendKeys("lastname");
		return Last;

	}

}