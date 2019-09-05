package com.cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.selenium.baseclass.Baseclass;
import com.selenium.helper.FileDataManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\selenium\\reports\\ExtentReports\\extentreport.html",
"pretty", "json:src\\test\\resource\\com\\selenium\\reports\\CucumberReports\\report.json",
"junit:src\\test\\resource\\com\\selenium\\reports\\CucumberReports\\report.xml",
"html:src\\test\\resource\\com\\selenium\\reports\\CucumberReports\\" }, 
features = "src\\test\\java\\com\\cucumber\\feature",
glue = "com.cucumber.stepdefinition", 
tags = {"@APendtoend" }, dryRun = false, strict = true, monochrome = true)

public class TestRunner extends Baseclass {

	public static WebDriver driver;

	@BeforeClass
	public static void LaunchBrowser() throws Throwable {
		String browsername = FileDataManager.fdm.getConfigReader().getBrowsername();
		driver = getBrowser(browsername);
	}

	@AfterClass
	public static void CloseBrowser() throws Exception {
		driver.quit();
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")
				+ "\\src\\test\\resource\\com\\selenium\\properties\\extent-config.xml"));
	}
}
