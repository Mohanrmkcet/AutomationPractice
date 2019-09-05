package com.selenium.helper;

import org.openqa.selenium.WebDriver;

import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;
import com.selenium.pom.OrderPage;

public class PageObjectManagerSDP {

	public WebDriver driver;

	public PageObjectManagerSDP(WebDriver pomdriver) {
		this.driver = pomdriver;

	}
	


	private HomePage hp;
	private LoginPage lp;
	private OrderPage op;

	public HomePage getHp() {
		if (hp == null) {
			hp = new HomePage(driver);
		}
		return hp;
	}

	public LoginPage getLp() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}

	public OrderPage getOp() {
		if (op == null) {
			op = new OrderPage(driver);

		}
		return op;
	}

}
