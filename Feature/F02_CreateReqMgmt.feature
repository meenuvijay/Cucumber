Feature: Create New Request Management


Background:

Given   Load URL 'https://dev103117.service-now.com'
And     Switch Frame Main
And     Type username as 'admin'
And     Type password as 'India@123'
And     Click Login Button
Then    Verify Login is successful

 
Scenario Outline: Create New Request

When    Filter input nav as <navpage> 
And     Click on ServiceDesk
And     Switch Frame
And     Click on  New button
And     Click on Request
And     Get Request Entry No
And     Click Submit
And     Click on Search for Request no
And     Click on First Request no
Then    Verify the Request Status

Examples:
|navpage|
|My Work|

