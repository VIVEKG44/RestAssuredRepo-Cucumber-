package com.basic.postWithDataTableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src\\com\\basic\\resources\\postWithDataTableFF\\"},
			glue={"com\\basic\\postWithDataTableSD\\"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report3.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostWithDataTableTest {


}
