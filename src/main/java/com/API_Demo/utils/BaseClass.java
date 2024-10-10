package com.API_Demo.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClass {
	
	//method to send GET Request
	public Response sendGetRequest(String endpoint) {
		return RestAssured.get(endpoint);
	}
	// method to send POST Request
	public Response sendPostRequest(String endpoint,String body) {
		return RestAssured.given()
				.header("Content-Type","application/json")
				.body(body)
				.post(endpoint);
	}
	//method to send PUT Request
	public Response sendPutRequest(String endpoint, String body) {
		return RestAssured.given()
				.header("Content-Type","application/json")
				.body(body)
				.put(endpoint);
	}
	//method to send DELETE Request
	public Response sendDeleteRequest(String endpoint) {
		return RestAssured.delete(endpoint);
	}
}
