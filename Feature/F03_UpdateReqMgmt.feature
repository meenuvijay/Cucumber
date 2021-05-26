Feature: Update Request Management


Background:

Given   Load URL 'https://dev103117.service-now.com'
And     Switch Frame Main
And     Type username as 'admin'
And     Type password as 'India@123'
And     Click Login Button
Then    Verify Login is successful

 
Scenario Outline: Update Request

When    Filter input nav as <navpage> 
And     Click on ServiceDesk
And     Switch Main Frame
And     Click on Search for Field <searchinput>
And     Click on First Search Result link
And     Click on look up
And     Click on location
And     Switch Main Frame
And     Click on Date Picker
And     Click Update
And     Verify Update




Examples:
|navpage|searchinput|
|My Work|REQ0010252|

