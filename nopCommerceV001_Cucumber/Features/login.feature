 Feature: Login

Scenario: Successful Login with Valid Credentials
  Given User Launch Chrome browser
  When User opens URL "http://admin-demo.nopcommerce.com/login"
  And User enters Email as "admin@yourstore.com" and Password as "admin"
  And click on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When User click on Log out link
  Then Page Title should be "Your store. Login"
  And close browser
  
  Scenario Outline: Login Data driven
  Given User Launch Chrome browser
  When User opens URL "http://admin-demo.nopcommerce.com/login"
  And User enters Email as "<email>" and Password as "<password>"
  And click on Login
  Then Page Title should be "Dashboard / nopCommerce administration"
  When User click on Log out link
  Then Page Title should be "Your store. Login"
  And close browser
  
  Examples:
   | email | password |
   | admin@yourstore.com | admin |
   | admin@yourstore.com | admin123 |
   