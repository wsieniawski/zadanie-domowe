Feature: As User I want to fill all fields properly so I can go to the second page

  User fills correct data into fields

  Background:
    Given Browser is open
    And I am on first page of form

  Scenario Outline: Filling fields with correct data
    When I enter <Name> into name field
    And I enter <Surname> into surname field
    And I enter <Email> into email field
    And I enter <Phone> into phone field
    And I enter <PESEL> into PESEL field
    And I enter <Serial> into serial field
    And I enter <BirthDate> into birth date field
    And I click Next Page button
    Then I am on second page

    Examples:
      | Name     | Surname    | Email                   | Phone     | PESEL       | Serial    | BirthDate  |
      | Wojciech | Sieniawski | sieniawskidev@gmail.com | 514231360 | 14022369234 | AVD410203 | 2020-04-03 |

