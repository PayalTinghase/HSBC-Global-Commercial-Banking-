package hsbc.Global_Commercial_Banking.StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertSame;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class ExchangeRatesStepImplementation 
{
	ValidatableResponse response;
	public void LatestExchangeRatesAPI()
	{
		RestAssured.baseURI = "https://api.ratesapi.io/api/";
		
	}
	
	
	public void GetRequest_LatestExchangeRates()
	{
		 response= given().when().get("latest HTTP/2").then().log().all();
		
	}
	
	public void Verify_LatestExchangeRates(int code)
	{
		int actualCode =response.extract().response().getStatusCode();
		Assert.assertEquals(actualCode ,code);
	}
	
	public void SpecificExchangeRatesAPI()
	{
		RestAssured.baseURI = "https://api.ratesapi.io/api/2010-01-12";
		
	}
	
	
	public void GetRequest_SpecificExchangeRates()
	{
		 response= given().when().get().then().log().all();
		
	}
	
	public void Verify_SpecificExchangeRatesResponse(String ExpDate)
	{
		String date = response.extract().response().getBody().jsonPath().getString("date");
		
		Assert.assertEquals(date,ExpDate);
	}
	
	public void SpecificExchangeRatesAPIforFutureDate(String Date)
	{
		RestAssured.baseURI = "https://api.ratesapi.io/api/"+Date;
		
	}
	
	public void Verify_SpecificExchangeRatesResponseForFutureDate(String ExpDate)
	{
		String date = response.extract().response().getBody().jsonPath().getString("date");
	
		Calendar cal = Calendar.getInstance();
		   DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		   cal.add(Calendar.DATE, -1);
		   System.out.println("Yesterday's date was "+dateFormat.format(cal.getTime()));
		///API is returing yesterdays date data not todays date data hence validationg it for yesterdays data
		Assert.assertEquals(date, dateFormat.format(cal.getTime()));
	}
}
