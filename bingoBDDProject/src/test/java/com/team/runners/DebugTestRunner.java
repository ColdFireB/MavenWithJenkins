package com.team.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = true, 
		features = "classpath:features", 
		glue = { "" }, 
		plugin = {}
		)

public class DebugTestRunner {

}
