$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automationpractice.feature");
formatter.feature({
  "line": 2,
  "name": "Automation Practice End to End Test automation scenario",
  "description": "This feature file includes Login, Search the product, adding to cart, adding the address, selecting the \r\npayment method and placing the order.",
  "id": "automation-practice-end-to-end-test-automation-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@APendtoend"
    }
  ]
});
formatter.before({
  "duration": 290600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify user validate the automation practice home page",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-validate-the-automation-practice-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Homepage"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User hit the Automation practice website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User verifes the site logo",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User verifies the page title",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Signin Button in Header",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_hit_the_Automation_practice_website()"
});
formatter.result({
  "duration": 9022929100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifes_the_site_logo()"
});
formatter.result({
  "duration": 161179400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_page_title()"
});
formatter.result({
  "duration": 29886700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_Signin_Button_in_Header()"
});
formatter.result({
  "duration": 5217217200,
  "status": "passed"
});
formatter.after({
  "duration": 445800,
  "status": "passed"
});
formatter.before({
  "duration": 193800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify user login the application with valid credentials",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-login-the-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Loginpage"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User enter the email id \u0027venkat@gmail.com\u0027 in the login page",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enter the password \u0027123456789\u0027 in the login page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on Login Button in the Login Page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "venkat@gmail.com",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_email_id_in_the_login_page(String)"
});
formatter.result({
  "duration": 461458700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_password_in_the_login_page(String)"
});
formatter.result({
  "duration": 392306900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_Login_Button_in_the_Login_Page()"
});
formatter.result({
  "duration": 2504574300,
  "status": "passed"
});
formatter.after({
  "duration": 45400,
  "status": "passed"
});
formatter.before({
  "duration": 66600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Verify user search the product in the product page",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-search-the-product-in-the-product-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Productsearch"
    },
    {
      "line": 19,
      "name": "@demo"
    },
    {
      "line": 19,
      "name": "@zero"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User enters the product type in search field",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enters_the_product_type_in_search_field()"
});
formatter.result({
  "duration": 253634800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_search_button()"
});
formatter.result({
  "duration": 3300020100,
  "status": "passed"
});
formatter.after({
  "duration": 85000,
  "status": "passed"
});
formatter.before({
  "duration": 150700,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Verify user whether the product is added to cart",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-whether-the-product-is-added-to-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@Addingtocart"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "User verifies the top sellers title is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User click on the product",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on proceed to checkout button in product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_top_sellers_is_displayed()"
});
formatter.result({
  "duration": 92968600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_product()"
});
formatter.result({
  "duration": 3686880700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 232442200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_proceed_to_checkout_button_in_product_page()"
});
formatter.result({
  "duration": 4053681900,
  "status": "passed"
});
formatter.after({
  "duration": 318500,
  "status": "passed"
});
formatter.before({
  "duration": 246400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify user whether the order details is displayed in Summary",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-user-whether-the-order-details-is-displayed-in-summary",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Summarypage"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "User click on proceed to checkout button in Summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_proceed_to_checkout_button_in_Summary_page()"
});
formatter.result({
  "duration": 2266177300,
  "status": "passed"
});
formatter.after({
  "duration": 146800,
  "status": "passed"
});
formatter.before({
  "duration": 185500,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Verify whether the delivery address is added",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-whether-the-delivery-address-is-added",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@Addresspage"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User click on proceed to checkout button in Address page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_proceed_to_checkout_button_in_Address_page()"
});
formatter.result({
  "duration": 1909057200,
  "status": "passed"
});
formatter.after({
  "duration": 236000,
  "status": "passed"
});
formatter.before({
  "duration": 183300,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify whether the shipping option is selected",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-whether-the-shipping-option-is-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@Shippingpage"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "User click on terms and condition checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User click on proceed to checkout button in shipping option page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_terms_and_condition_checkbox()"
});
formatter.result({
  "duration": 365206100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_proceed_to_checkout_button_in_shipping_option_page()"
});
formatter.result({
  "duration": 1746910400,
  "status": "passed"
});
formatter.after({
  "duration": 135800,
  "status": "passed"
});
formatter.before({
  "duration": 124400,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Verify whether the payment method is selected",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-whether-the-payment-method-is-selected",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@Paymentpage"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "User verifies whether payment option title \u0027PLEASE CHOOSE YOUR PAYMENT METHOD\u0027 is displayed",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "PLEASE CHOOSE YOUR PAYMENT METHOD",
      "offset": 44
    }
  ],
  "location": "StepDefinition.user_verifies_whether_payment_option_title_is_displayed(String)"
});
formatter.result({
  "duration": 77099200,
  "status": "passed"
});
formatter.after({
  "duration": 72200,
  "status": "passed"
});
formatter.before({
  "duration": 108500,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Verify whether the order summary is displayed",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-whether-the-order-summary-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@Ordersummary"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "User click on Pay by bank wire option for the payment",
  "keyword": "Then "
});
formatter.step({
  "line": 51,
  "name": "User verifies the payment method with total amount is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "User click on confirm my order button in Order summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_Pay_by_bank_wire_option_for_the_payment()"
});
formatter.result({
  "duration": 1562964200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_payment_method_with_total_amount_is_displayed()"
});
formatter.result({
  "duration": 95893000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_confirm_my_order_button_in_Order_summary_page()"
});
formatter.result({
  "duration": 200103100,
  "status": "passed"
});
formatter.after({
  "duration": 232900,
  "status": "passed"
});
formatter.before({
  "duration": 71500,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "Verify whether the order is confirmed",
  "description": "",
  "id": "automation-practice-end-to-end-test-automation-scenario;verify-whether-the-order-is-confirmed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 54,
      "name": "@Orderconfirmation"
    }
  ]
});
formatter.step({
  "line": 56,
  "name": "User click on sign out button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_click_on_sign_out_button()"
});
formatter.result({
  "duration": 2374511400,
  "status": "passed"
});
formatter.after({
  "duration": 145500,
  "status": "passed"
});
});