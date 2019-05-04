package com.basic;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src/com/basic/resources/MyGoogle.feature"},
			glue={"com.basic"}
			

)


	public class GoogleRunner
{
	
}

