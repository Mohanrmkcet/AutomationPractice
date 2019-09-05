package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

////////////////////////////////// EMAIL, PASSWORD & LOGIN BUTTON//////////////////////////

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driversecond) {
		this.driver = driversecond;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement emailid;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement Signinbtn;

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbtn() {
		return Signinbtn;
	}

}
