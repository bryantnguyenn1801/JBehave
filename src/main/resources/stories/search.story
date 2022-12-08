Sample Test

Scenario: Searching JBehave on Google
!--
Given I open the browser
When I enter https://google.com and hit enter key
And Google is displayed
And I input keyword JBehave in field
Then Google responses the results, and I wanna verify <string> that the search correct or not
Examples:
    |JBehave|