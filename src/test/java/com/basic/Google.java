package com.basic;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

//import io.restassured.*;

public class Google
{

	
	public void GoogleTest()
	{
		
		
		
	Response res=RestAssured.given().get("https://www.google.com/");
		int stcode=res.getStatusCode();
		Assert.assertEquals(200, stcode);
	}
}
