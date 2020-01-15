package com.nopCommerceAutomation.pages;

import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerceAutomation.base.BaseTest;

public class HomePage extends BaseTest {
	// This are the xpaths of the element on the Homepage only //

	@FindBy(xpath = "//div[@class='header-logo']//a//img")
	WebElement pageLogoonHomePage;

	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement registerlink;

	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginbutton;

	@FindBy(xpath = "//a[@class='ico-wishlist']")
	WebElement wishlist;
	@FindBy(xpath = "//span[contains(@class,'cart-label')]")
	WebElement shopingLink;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String verifypageTitle() {

		return driver.getTitle();
	}

	public boolean verifyLogo() {
		return pageLogoonHomePage.isDisplayed();
	}

	public RegisterPage clickonregister() {
		registerlink.click();
		return new RegisterPage();
	}

	public LoginPage gotoLoginPage() {
		loginbutton.click();
		return new LoginPage();
	}

	public WishListPage gotoWishList() {
		wishlist.click();
		return new WishListPage();
	}
	public ShopingListPage gotoShopinCartPage() {
		shopingLink.click();
		return new ShopingListPage();
	}

}
