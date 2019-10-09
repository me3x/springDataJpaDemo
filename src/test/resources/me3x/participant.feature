@participant
Feature: find participant

  Scenario: search for participant
    Given participant exists
    When search for participant
    Then participant found