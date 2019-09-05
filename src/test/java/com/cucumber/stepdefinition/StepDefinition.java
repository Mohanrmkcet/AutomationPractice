package com.cucumber.stepdefinition;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.cucumber.runner.TestRunner;
import com.selenium.baseclass.Baseclass;
import com.selenium.helper.FileDataManager;
import com.selenium.helper.PageObjectManagerSDP;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass {
	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManagerSDP pm = new PageObjectManagerSDP(driver);

	@Given("^User hit the Automation practice website$")
	public void user_hit_the_Automation_practice_website() throws Throwable {
		String url = FileDataManager.fdm.getConfigReader().getUrl();
		getUrl(url);
		System.out.println("Moved to site");
	}

	@Then("^User verifes the site logo$")
	public void user_verifes_the_site_logo() throws Throwable {
		elementIsDisplayed(pm.getHp().getLogo());
		highlightWebelement(pm.getHp().getLogo());
		System.out.println("Logo is displayed");
	}

	@Then("^User verifies the page title$")
	public void user_verifies_the_page_title() throws Throwable {
		getTitleofwindow();
		String s = "My Store";
		Assert.assertEquals(getTitleofwindow(), s);
		System.out.println("Page title is displayed");
	}

	@Then("^User click on Signin Button in Header$")
	public void user_click_on_Signin_Button_in_Header() throws Throwable {
		clickoperation(pm.getHp().getSiginbtn());
		System.out.println("Sign in button clicked");
		File screenshot = screenshot("user_click_on_Signin_Button_in_Header");
		Reporter.addScreenCaptureFromPath(screenshot.getAbsolutePath());
	}

	@When("^User enter the email id '(.*)' in the login page$")
	public void user_enter_the_email_id_in_the_login_page(String username) throws Throwable {
		sendkeys(pm.getLp().getEmailid(), username);
		System.out.println("Email id is entered");
	}

	@When("^User enter the password '(.*)' in the login page$")
	public void user_enter_the_password_in_the_login_page(String password) throws Throwable {
		sendkeys(pm.getLp().getPassword(), password);
		System.out.println("Psssword is entered");
	}

	@When("^User click on Login Button in the Login Page$")
	public void user_click_on_Login_Button_in_the_Login_Page() throws Throwable {
		clickoperation(pm.getLp().getSigninbtn());
		System.out.println("Login button is clicked");
	}

	@When("^User enters the product type in search field$")
	public void user_enters_the_product_type_in_search_field() throws Throwable {
		sendkeys(pm.getOp().getSearchfield(), "Dresses");
		System.out.println("Product is searched");
	}

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		clickoperation(pm.getOp().getSearchbtn());
		System.out.println("Search button is clicked");
	}

	@Then("^User verifies the top sellers title is displayed$")
	public void user_verifies_the_top_sellers_is_displayed() throws Throwable {
		String actual = pm.getOp().getTopsellers().getText();
		Assert.assertTrue(actual.contains("TOP"));
		highlightWebelement(pm.getOp().getTopsellers());
		System.out.println("Top Sellers title is verified");
	}

	@When("^User click on the product$")
	public void user_click_on_the_product() throws Throwable {
		clickoperation(pm.getOp().getProduct());
		System.out.println("Product is selected");
		File screenshot = screenshot("user_click_on_the_product");
		Reporter.addScreenCaptureFromPath(screenshot.getAbsolutePath());

	}

	@Then("^User click on add to cart button$")
	public void user_click_on_add_to_cart_button() throws Throwable {
		clickoperation(pm.getOp().getAddtocartbtn());
		System.out.println("Product is added to cart");
	}

	@Then("^User click on proceed to checkout button in product page$")
	public void user_click_on_proceed_to_checkout_button_in_product_page() throws Throwable {
		clickoperation(pm.getOp().getProceedtocheckout());
		System.out.println("Checked out in Product page");
	}

	@Then("^User click on proceed to checkout button in Summary page$")
	public void user_click_on_proceed_to_checkout_button_in_Summary_page() throws Throwable {
		clickoperation(pm.getOp().getProceedtocheckout1());
		System.out.println("Checked out in Summary page");
	}

	@Then("^User click on proceed to checkout button in Address page$")
	public void user_click_on_proceed_to_checkout_button_in_Address_page() throws Throwable {
		clickoperation(pm.getOp().getProceedtocheckout2());
		System.out.println("Checked out in Address page");
	}

	@Then("^User click on terms and condition checkbox$")
	public void user_click_on_terms_and_condition_checkbox() throws Throwable {
		clickoperation(pm.getOp().getTermsagree());
		System.out.println("Terms and conditions checkbox is clicked");
	}

	@Then("^User click on proceed to checkout button in shipping option page$")
	public void user_click_on_proceed_to_checkout_button_in_shipping_option_page() throws Throwable {
		clickoperation(pm.getOp().getProceedtocheckout3());
		System.out.println("Checked out in Shipping page");
	}

	@When("^User verifies whether payment option title '(.*)' is displayed$")
	public void user_verifies_whether_payment_option_title_is_displayed(String paymenttitle) throws Throwable {
		String actual = pm.getOp().getPaymenttitle().getText();
		Assert.assertEquals(paymenttitle, actual);
		highlightWebelement(pm.getOp().getPaymenttitle());
		System.out.println("Payment option title is displayed");
	}

	@Then("^User click on Pay by bank wire option for the payment$")
	public void user_click_on_Pay_by_bank_wire_option_for_the_payment() throws Throwable {
		clickoperation(pm.getOp().getPayment());
		System.out.println("Payment option is selected");
	}

	@When("^User verifies the payment method with total amount is displayed$")
	public void user_verifies_the_payment_method_with_total_amount_is_displayed() throws Throwable {
		String actual = pm.getOp().getOrdersummary().getText();
		highlightWebelement(pm.getOp().getOrdersummary());
		Assert.assertTrue(actual.contains("order comes to: $30.98"));
		System.out.println("Total amount is checked");
	}

	@Then("^User click on confirm my order button in Order summary page$")
	public void user_click_on_confirm_my_order_button_in_Order_summary_page() throws Throwable {
		clickoperation(pm.getOp().getOrdersummary());
		System.out.println("Order is confirmed");
	}

	@Then("^User click on sign out button$")
	public void user_click_on_sign_out_button() throws Throwable {
		clickoperation(pm.getOp().getSignout());
		System.out.println("Account has been signed out");
	}

}