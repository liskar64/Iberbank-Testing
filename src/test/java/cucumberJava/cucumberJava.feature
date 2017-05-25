Feature: CucumberJava

    Scenario:Login functionality no exists 1

    Given I open the app

    When I enter Usuario as "trytryte" and Contrasena as "trytryte"

    Then login should be unsuccessful

    Scenario:Login functionality no exists 2

        Given I open the app

        When I enter Usuario as "" and Contrasena as ""

        Then login should be unsuccessful

    Scenario:Login functionality no exists 3

        Given I open the app

        When I enter Usuario as "pepepotamo" and Contrasena as ""

        Then login should be unsuccessful

    Scenario:Login functionality no exists 4

        Given I open the app

        When I enter Usuario as "" and Contrasena as "pepe"

        Then login should be unsuccessful

    Scenario:Login functionality exists

    Given I open the app

    When I enter Usuario as "iber4" and Contrasena as "iber4"

    Then login should be successful