
@tag
Feature: Title of your feature
  I want to use this template for my feature file

Background:

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    When I complete action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with precondition
    When I check for the <value> in step
    And  I complete action
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
