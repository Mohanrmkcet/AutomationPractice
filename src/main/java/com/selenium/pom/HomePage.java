package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

///////////////////////////////////// LOGO & SIGN IN//////////////////////////////////////

public class HomePage {

	public HomePage(WebDriver driverfirst) {
		this.driver = driverfirst;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"header_logo\"]/a/img")
	private WebElement logo;
	
	@FindBy(className = "login")
	private WebElement siginbtn;

	public WebElement getSiginbtn() {
		return siginbtn;
	}
	
	public WebElement getLogo() {
		return logo;
	}
}
