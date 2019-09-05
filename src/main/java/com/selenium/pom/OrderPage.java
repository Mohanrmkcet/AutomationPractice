package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

///////////////////////////////////// SEARCH TO ORDER PLACEMENT //////////////////////////

public class OrderPage {

	public WebDriver driver;

	public OrderPage(WebDriver driverfourth) {
		this.driver = driverfourth;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@title='View my customer account']//span")
	private WebElement usernamedisplay;

	@FindBy(id = "search_query_top")
	private WebElement searchfield;

	@FindBy(xpath = "(//button[@type=\"submit\"])[1]")
	private WebElement searchbtn;

	@FindBy(xpath = "//a[text()='Top sellers']")
	private WebElement topsellers;

	@FindBy(xpath = "(//div[@class=\"product-image-container\"])[1]")
	private WebElement product;

	@FindBy(xpath = "//h1[text()='Printed Summer Dress']")
	private WebElement productname;

	@FindBy(id = "add_to_cart")
	private WebElement addtocartbtn;

	@FindBy(xpath = "//span[@class=\"ajax_cart_product_txt \"]")
	private WebElement productaddedtocartmsg;

	@FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]")
	private WebElement proceedtocheckout;

	@FindBy(xpath = "(//input[@value=\"1\"])[1]")
	private WebElement quantityadded;

	@FindBy(xpath = "//span[@id=\"total_price\"]")
	private WebElement price;

	@FindBy(xpath = "//a[@href=\"http://automationpractice.com/index.php?controller=order\"]")
	private WebElement addtocartclick;

	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedtocheckout1;

	@FindBy(xpath = "//h3[text()='Your delivery address']")
	private WebElement deliveryaddresstitle;

	@FindBy(id = "address_delivery")
	private WebElement deliveryaddress;

	@FindBy(xpath = "(//a[@class=\"button button-small btn btn-default\"])[2]")
	private WebElement updatebtn;

	@FindBy(id = "phone_mobile")
	private WebElement mobilenumber;

	@FindBy(xpath = "//button[@class=\"btn btn-default button button-medium\"]")
	private WebElement savebtn;

	@FindBy(xpath = "(//li[@class=\"address_phone_mobile\"])[1]")
	private WebElement updatedmobilenumber;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement proceedtocheckout2;

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceedtocheckout3;

	@FindBy(xpath = "//a[@title=\"Close\"]")
	private WebElement close;

	@FindBy(xpath = "//label[text()='I agree to the terms of service and will adhere to them unconditionally.']")
	private WebElement termsagree;

	@FindBy(xpath = "//h1[text()='Please choose your payment method']")
	private WebElement paymenttitle;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;

	@FindBy(xpath = "//div[@class=\"box cheque-box\"]")
	private WebElement ordersummary;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement orderconfirm;

	@FindBy(xpath = "//strong[text()='Your order on My Store is complete.']")
	private WebElement ordercompletionmsg;

	@FindBy(xpath = "//a[@class='logout']")
	private WebElement signout;

	public WebElement getUsernamedisplay() {
		return usernamedisplay;
	}

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getTopsellers() {
		return topsellers;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getProductaddedtocartmsg() {
		return productaddedtocartmsg;
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

	public WebElement getQuantityadded() {
		return quantityadded;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getAddtocartclick() {
		return addtocartclick;
	}

	public WebElement getProceedtocheckout1() {
		return proceedtocheckout1;
	}

	public WebElement getDeliveryaddresstitle() {
		return deliveryaddresstitle;
	}

	public WebElement getDeliveryaddress() {
		return deliveryaddress;
	}

	public WebElement getUpdatebtn() {
		return updatebtn;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getUpdatedmobilenumber() {
		return updatedmobilenumber;
	}

	public WebElement getProceedtocheckout2() {
		return proceedtocheckout2;
	}

	public WebElement getProceedtocheckout3() {
		return proceedtocheckout3;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getTermsagree() {
		return termsagree;
	}

	public WebElement getPaymenttitle() {
		return paymenttitle;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getOrdersummary() {
		return ordersummary;
	}

	public WebElement getOrderconfirm() {
		return orderconfirm;
	}

	public WebElement getOrdercompletionmsg() {
		return ordercompletionmsg;
	}

	public WebElement getSignout() {
		return signout;
	}

}
