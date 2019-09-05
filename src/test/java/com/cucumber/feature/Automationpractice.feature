@APendtoend
Feature: Automation Practice End to End Test automation scenario
This feature file includes Login, Search the product, adding to cart, adding the address, selecting the 
payment method and placing the order.

@Homepage
Scenario: Verify user validate the automation practice home page
Given User hit the Automation practice website
Then User verifes the site logo
And User verifies the page title
Then User click on Signin Button in Header

@Loginpage 
Scenario: Verify user login the application with valid credentials
When User enter the email id 'venkat@gmail.com' in the login page
And User enter the password '123456789' in the login page
And User click on Login Button in the Login Page

@Productsearch @demo @zero 
Scenario: Verify user search the product in the product page
When User enters the product type in search field
And User click on search button

@Addingtocart
Scenario: Verify user whether the product is added to cart
When User verifies the top sellers title is displayed
And User click on the product
And User click on add to cart button
Then User click on proceed to checkout button in product page

@Summarypage
Scenario: Verify user whether the order details is displayed in Summary
Then User click on proceed to checkout button in Summary page

@Addresspage
Scenario: Verify whether the delivery address is added
Then User click on proceed to checkout button in Address page

@Shippingpage
Scenario: Verify whether the shipping option is selected
And User click on terms and condition checkbox
Then User click on proceed to checkout button in shipping option page

@Paymentpage
Scenario: Verify whether the payment method is selected
When User verifies whether payment option title 'PLEASE CHOOSE YOUR PAYMENT METHOD' is displayed

@Ordersummary
Scenario: Verify whether the order summary is displayed
Then User click on Pay by bank wire option for the payment
When User verifies the payment method with total amount is displayed
Then User click on confirm my order button in Order summary page

@Orderconfirmation
Scenario: Verify whether the order is confirmed
Then User click on sign out button


  