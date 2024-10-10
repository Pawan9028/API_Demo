package com.API_Demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.API_Demo.utils.BaseClass;

import io.restassured.response.Response;

public class APIDemo_Test extends BaseClass{
	
	//test GET Request
	@Test
	public void testGetAPI() {
		String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
		Response response = sendGetRequest(endpoint);
		
		// Assert the status code
		Assert.assertEquals(response.getStatusCode(), 200);
		
		//Assert the response body contains specific data
		//Assert.assertTrue(response.getBody().asString().contains("userID"));
	}
	 // Test POST Request
    @Test
    public void testPostAPI() {
        String endpoint = "https://jsonplaceholder.typicode.com/posts";
        String requestBody = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";
        
        Response response = sendPostRequest(endpoint, requestBody);
        
        // Assert status code
        Assert.assertEquals(response.getStatusCode(), 201);
        
        // Assert the response contains the data sent
        Assert.assertTrue(response.getBody().asString().contains("foo"));
    }

	

}
