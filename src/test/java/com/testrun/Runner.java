package com.testrun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin={"json:target/cucumber.json"},
		features ={"src/test/resources/Login.feature"},
		glue={"com.cucumber.test"}

		)
public class Runner extends AbstractTestNGCucumberTests{
	
}
