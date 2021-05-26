Feature: Delete Request Management


Background:

Given   Load URL 'https://dev103117.service-now.com'
And     Switch Frame Main
And     Type username as 'admin'
And     Type password as 'India@123'
And     Click Login Button
Then    Verify Login is successful

 
Scenario Outline: Delete Request

When    Filter input nav as <navpage> 
And     Click on ServiceDesk
And     Switch Main Frame
And     Click on Search for Field <searchinput>
And     Click on Search Result link for Delete
And     Click on Delete
And     Click OK
Then    Verify Delete




Examples:
|navpage|searchinput|
|My Work|REQ0010247|

