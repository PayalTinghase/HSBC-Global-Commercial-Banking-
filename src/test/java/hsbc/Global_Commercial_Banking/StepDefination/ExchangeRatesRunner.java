package hsbc.Global_Commercial_Banking.StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/features/SpecificDateForeignExchangeRates.feature"
,glue="hsbc.Global_Commercial_Banking.StepDefination" )
public class ExchangeRatesRunner {

}
