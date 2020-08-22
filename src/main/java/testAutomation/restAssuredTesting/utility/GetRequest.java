package testAutomation.restAssuredTesting.utility;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {
	
	public static Response getRequest(String baseUri, String requestUrl){
		
		RestAssured.baseURI=baseUri;
		
		Response response=RestAssured.given().when().get(requestUrl);
		
		return response;
	}

}
