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

public class HomePageTest extends BaseTest {

	HomePage homepage; // Page object Model//
	RegisterPage registerPage;
	LoginPage loginPage;
	ShopingListPage shopingCartPage;
	WishListPage wishlistpage;

	

	public HomePageTest() {

		super(); // instentiation of the base class// super keyword
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		homepage = new HomePage();
		registerPage = new RegisterPage();
		loginPage = new LoginPage();
		wishlistpage = new WishListPage();
		shopingCartPage= new ShopingListPage();
	}

	@Test(priority = 1)
	public void verifyPageTitleTest() {

		String title = homepage.verifypageTitle();
		Assert.assertEquals(title, "nopCommerce demo store");
	}

	@Test(priority = 2)
	public void verifyNopcommerceLogo() {

		boolean status = homepage.verifyLogo();
		Assert.assertTrue(status);
	}

	@Test(priority = 3)
	public void goToRegisterPageTest() {
		homepage.clickonregister();
		String registerPageTitle = registerPage.verifyRegisterPageTitle();
		Assert.assertEquals(registerPageTitle, "Register");
	}

	@Test(priority = 4)
	public void loginPageTitleTest() {
		homepage.gotoLoginPage();
		String loginPageTitle = loginPage.capturePageTitle();
		Assert.assertEquals(loginPageTitle, "Welcome, Please Sign In!");

	}

	@Test(priority = 5)
	public void gotoShopingPageTest() {
		homepage.gotoShopinCartPage();
	//	String shoplist`= shopingCartPage

	}

//	@Test(priority = 5)
//	public void gotowishListTest() {
//		homepage.gotoWishList();
//		String wishListTitle = WishListPage.class 
//		}
	@Test(priority = 6)
	public void goToWishListPageTest() { // failed
		Object logger;
		// logger.info("wish list page test started");
		homepage.gotoWishList();
		String wishListPageTitle = wishlistpage.verifyWishListTitle();
		Assert.assertEquals(wishListPageTitle, "Wishlist");
		// logger.info("wish list page test completed");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
