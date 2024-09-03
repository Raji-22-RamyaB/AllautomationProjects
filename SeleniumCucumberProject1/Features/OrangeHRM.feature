Feature: OrangeHRM Login

 Scenario: Logo presence on OrangeHRM home page
  Given I launch chrome browser
  When I open orange hrm homepage
  Then I verify that th logo present on pgae
  And close browser
  
  
