package testAutomation.restAssuredTesting;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import testAutomation.restAssuredTesting.pojo.AppConfiguration;
import testAutomation.restAssuredTesting.pojo.Root;
import testAutomation.restAssuredTesting.utility.GetRequest;
import testAutomation.restAssuredTesting.utility.*;

public class GetRequestTest {
	
	String baseURI;
	String requestUrl;	
	
	@BeforeTest
	public void setup() throws IOException{
		PropertiesConfig pc=new PropertiesConfig();
		Properties p=pc.getProerty();
		baseURI=p.getProperty("baseURI");
		requestUrl=p.getProperty("requestURL");
	}
	
	@Test
	public void getRequest() throws JsonParseException, JsonMappingException{
		
		Reporter.log("Sending Get Request...");
		Response response=GetRequest.getRequest(baseURI, requestUrl);
		if(response.getStatusCode()==200){
			System.out.println("Response code is: "+response.getStatusCode());
			Reporter.log("Response code is: "+String.valueOf(response.getStatusCode()));
			System.out.println("Response Body: "+response.asString());
			Reporter.log("Response Body: "+response.asString());
			ObjectMapper om = new ObjectMapper();
			Root root = null;
			try {
				root = om.readValue(response.asString(), Root.class);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(root.toString());
			AppConfiguration app=root.getData().getAppConfiguration();
			
			List<String> actualSearchTypes=app.getSearchTypes();
		
			Assert.assertTrue(actualSearchTypes.contains("series"));
			
			System.out.println(actualSearchTypes +" List contains series word");
			Reporter.log(actualSearchTypes +" List contains series word");
		}else{
			System.out.println("Request is not successful");
			Reporter.log("Request is not successful");
		}
				
	}

}
