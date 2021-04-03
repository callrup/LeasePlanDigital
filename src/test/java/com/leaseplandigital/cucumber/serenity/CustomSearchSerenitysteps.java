package com.leaseplandigital.cucumber.serenity;

import cucumber.api.java.en.Given;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.http.HttpStatus;
import org.apache.commons.io.output.WriterOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.net.URL;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.hamcrest.Matchers.*;


import com.leaseplandigital.cucumber.steps.TestRunner;
import com.leaseplandigital.utils.ReuseableSpecifications;
import java.util.Map.Entry;

public class CustomSearchSerenitysteps {

	static RequestSpecification requestSpecs;
	static ResponseBody body;
	static Response res;
	static String token;
	public static Properties prop = new Properties();
	public static FileInputStream fis;
	public static Properties propResource = new Properties ();
	public static FileInputStream fisResource;
	long currentTimeStamp = System.currentTimeMillis();
	static String environmentName;
	public static String resourceURL;
	//public static Logger Log = LogManager.getLogger(CustomSearchSerenitysteps.class.getName());
	public static StringWriter requestWriter;
	public static PrintStream requestCapture;
	
	public static StringWriter responseWriter;
	public static PrintStream responseCapture;
	
	public static StringWriter errorWriter;
	public static PrintStream errorCapture;
	
	URL envPropertyPath = getClass().getClassLoader().getResource("env.properties");
	URL resourcePropertyPath = getClass().getClassLoader().getResource("resource.properties");
	
	
	@Before
	
	public void beforeEveryScenario() throws IOException
	{
		System.out.println("------------sceanrio start----------");
		fis = new FileInputStream(envPropertyPath.getFile());
		prop.load(fis);
		
		fisResource =new FileInputStream(resourcePropertyPath.getFile());
		propResource.load(fisResource);
		
		environmentName =prop.getProperty("env");
	}
	
	// Get Base url
	
	@Given ("^Testing environment$")
	
	public void getBaseURI() throws Throwable
	{
		SerenityRest.rest().baseUri(environmentName);
	RestAssured.useRelaxedHTTPSValidation();
	}
	
	 //Set Headers
	
	@When("^I pass headers$")
	public void setHeaders(Map<String,String> headers) throws Throwable
	{
		
	}
	
	
	
	
	
}
