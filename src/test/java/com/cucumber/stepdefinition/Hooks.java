package com.cucumber.stepdefinition;

import java.io.File;

import com.cucumber.listener.Reporter;
import com.selenium.baseclass.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Baseclass{

	@Before
	public void beforeHooks() throws Exception {
		
		System.out.println("Before Hooks");
	}

	@After
	public void afterHooks(Scenario testcase) throws Exception {

		System.out.println("After Hooks");
		
		testcase.getStatus();
		if (testcase.isFailed()) {
			File screenshot = screenshot(testcase.getName());
			Reporter.addScreenCaptureFromPath(screenshot.getAbsolutePath());
		}
	}

}
