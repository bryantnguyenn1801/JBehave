Narrative:
In order to log in into Gmail
As a user
I want to make sure that log in page works as expected

Scenario: Negative test log in page.
Given I open the browser and proceed to google page https://google.com
When I input keyword JBehave in field and click enter
Then Google responses the results, and I wanna verify JBehave that the search correct or not
Examples:
    | keyword | text |
    | JBehave | JBehave |

