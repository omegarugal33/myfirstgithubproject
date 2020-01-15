package com.nopCommerceAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerceAutomation.base.BaseTest;



public class WishListPage extends BaseTest {

	@FindBy(xpath = "//h1[contains(.,'Wishlist')]")      // its the xpath of the title inside of the wishlist // not the one on the homepage//
	WebElement wishListTitle;
	
	
	public WishListPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyWishListTitle() {
		return wishListTitle.getText();
	
	}
}
