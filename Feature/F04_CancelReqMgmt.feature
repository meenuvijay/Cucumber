Feature: Cancel Request Management


Background:

Given   Load URL 'https://dev103117.service-now.com'
And     Switch Frame Main
And     Type username as 'admin'
And     Type password as 'India@123'
And     Click Login Button
Then    Verify Login is successful

 
Scenario Outline: Cancel Request

When    Filter input nav as <navpage> 
And     Click on ServiceDesk
And     Switch Main Frame
And     Click on Search for Field <searchinput>
And     Click on Search Result link for Cancel
And     Click on Cancel Request
Then    Verify Cancel Request

Examples:
|navpage|searchinput|
|My Work|REQ0010257|

