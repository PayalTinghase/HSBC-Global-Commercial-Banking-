package hsbc.Global_Commercial_Banking.StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ExchangeRatesStepDefinations 
{
	
	public ExchangeRatesStepImplementation ExchangeRates = new ExchangeRatesStepImplementation();
	
	@Given("Rates API for Latest Foreign Exchange rates")
	public void rates_API_for_Latest_Foreign_Exchange_rates() 
	{
		ExchangeRates.LatestExchangeRatesAPI();
	    
	}

	@When("Latest Foreign Exchange rates API is available")
	public void the_API_is_available()
	{
		ExchangeRates.GetRequest_LatestExchangeRates();
	}

	@Then("verify the user received the {int} response code")
	public void verify_the_user_received_the_response_code(int code)
	{
		ExchangeRates.Verify_LatestExchangeRates(code);
	}
	
	@Given("Rates API for Specific date Foreign Exchange rates")
	public void rates_API_for_Specific_date_Foreign_Exchange_rates() 
	{
		ExchangeRates.SpecificExchangeRatesAPI();
	}

	@When("Specific date Foreign Exchange rates API is available")
	public void specific_date_Foreign_Exchange_rates_API_is_available() 
	{
	   ExchangeRates.GetRequest_SpecificExchangeRates();
	}
	
	@Then("verify the user received the valid response for {string}")
	public void verify_the_user_received_the_valid_response_for(String string)
	{
	    ExchangeRates.Verify_SpecificExchangeRatesResponse(string);
	}
	
	
	@Then("verify the user received the valid response for future {string}")
	public void verify_the_user_received_the_valid_response_for_Future(String string)
	{
	    ExchangeRates.Verify_SpecificExchangeRatesResponseForFutureDate(string);
	}
	
	@Given("Rates API for Specific date Foreign Exchange rates for future {string}")
	public void rates_API_for_Specific_date_Foreign_Exchange_rates_for_future(String Date) 
	{
		ExchangeRates.SpecificExchangeRatesAPIforFutureDate(Date);
	}
}
