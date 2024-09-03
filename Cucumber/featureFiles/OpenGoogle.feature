Feature: This is to google search
Scenario: Google search scenario
  Given User is entering google.co.in
  When user is searching the term "Agniprasath"
  And enter the returns key
  Then the user should see the search results
  
