Feature: Specific date Foreign Exchange rates
Description: Its a testing of Specific date Foreign Exchange rates

Scenario: Verify success code for Specific date Foreign Exchange rates
Given Rates API for Specific date Foreign Exchange rates
When Specific date Foreign Exchange rates API is available
Then verify the user received the 200 response code

Scenario Outline: Verify response for Specific date Foreign Exchange rates
Given Rates API for Specific date Foreign Exchange rates
When Specific date Foreign Exchange rates API is available
Then verify the user received the valid response for "<Date>"

Examples:

|Date|
|2010-01-12|


Scenario Outline: Verify response for Specific date Foreign Exchange rates for future Date
Given Rates API for Specific date Foreign Exchange rates for future "<Date>"
When Specific date Foreign Exchange rates API is available
Then verify the user received the valid response for future "<Date>"

Examples:

|Date|
|2022-01-12|