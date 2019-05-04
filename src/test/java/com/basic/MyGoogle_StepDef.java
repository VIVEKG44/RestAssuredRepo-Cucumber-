package com.basic;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class MyGoogle_StepDef

{
	Response res;

@Given("^I want to open googel$")
public void i_want_to_open_googel() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hitting google.com");
	res=RestAssured.given().get("https://www.google.com/");
    throw new PendingException();
}



@Then("^I want to check status code$")
public void i_want_to_check_status_code() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Vaildating status code");
	int stcode=res.getStatusCode();
	String sstcode=Integer.toString(stcode);
	Assert.assertEquals(200, stcode);
    throw new PendingException();
}
}
