package com.team.hooks;

import com.team.utils.DependencyUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

	DependencyUtil service;
	
	public Hook(DependencyUtil service) {
		this.service = service;
	}
	
	@Before
	public void beforeScenario(Scenario scenario) {
		service.scenario = scenario;
		System.out.println("Scenario starts here...."+ service.scenario.getName());
		service.scenario.write("Scenario starts here...");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("Scenario ends here..");
		service.scenario.write("Scenario ends here...");
	}
	
	/*
	public void takeScreenshot() {
		  final byte[] screenshot = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
		  AkitaScenario.getInstance().getScenario().embed(screenshot, "image/png");
		}*/
}
