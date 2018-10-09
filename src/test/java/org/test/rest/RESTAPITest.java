package org.test.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.test.mobile.AppiumTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

/**
 This is Rest API Testing Class
*/
public class RESTAPITest {
	
	private static Logger log = LogManager.getLogger(RESTAPITest.class.getName());
	
	@Test
	public void testJIRA() {
		log.info("info Test JIRA");
		System.out.println("Test JIRA");
		log.debug("debug Test JIRA");
	}
	
	@Test
	public void testTwitter() {
		log.info("Test Twitter");
		System.out.println("Test Twitter");
	}
	
	@Test
	public void testOpenRestAPI() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		Response response = RestAssured.given().
							when().
							get("/todos/1").
							then().extract().response();
		System.out.println(response.asString());
		
		System.out.println();
		JsonPath jsonPath = new JsonPath(response.asString());
		System.out.println("userId: "+jsonPath.get("userId").toString());
		System.out.println("Id: "+jsonPath.get("id").toString());
		System.out.println("title: "+jsonPath.get("title").toString());
		System.out.println("completed: "+jsonPath.get("completed").toString());
		System.out.println();
	}

}
