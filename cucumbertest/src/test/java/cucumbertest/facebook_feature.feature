Feature: CucumberJava

  @facebook
  Scenario: Login functionality exists
    Given I have open the browser
    When I open "https://www.facebook.com/" website
    Then Login button should exits

  @blogspot
  Scenario: Launch siyaramvishwakarma.blogspot.com
    Given I have open the browser
    When I open "siyaramvishwakarma.blogspot.com" website
