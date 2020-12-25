Feature: Latest Foreign Exchange rates
Description: Its a testing of latest Foreign Exchange rates

Scenario: Latest Foreign Exchange rates
Given Rates API for Latest Foreign Exchange rates 
When Latest Foreign Exchange rates API is available
Then verify the user received the 200 response code