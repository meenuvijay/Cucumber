Feature: Login ServiceNow

Scenario: Login ServiceNow

Given   Load URL 'https://dev103117.service-now.com'
And     Switch Frame Main
And     Type username as 'admin'
And     Type password as 'India@123'
And     Click Login Button
Then    Verify Login is successful















