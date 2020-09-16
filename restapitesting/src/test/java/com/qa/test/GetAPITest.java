package com.qa.test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.cleint.RestClient;

public class GetAPITest extends TestBase{
	TestBase testBase;
	String servieUrl;
	String apiUrl ;
	String url;
	RestClient restClient;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException{
		testBase = new TestBase();
		servieUrl = prop.getProperty("URL");
		apiUrl = prop.getProperty("serviceURL");
		url = servieUrl + apiUrl;
		//Command
		
	}	
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException{
		restClient = new RestClient();
		restClient.get(url);
	}
	

}
