@smoke
Feature: Beneficiary Registration

  Scenario Outline: Verify that the Beneficiary Registration is successful
    Given User adds valid "<MobileNumber>", "<PhoneKeyId>", "<UserClassificationId>", "<Email>", "<UserName>", "<Password>", "<FirstNameAr>", "<MiddleNameAr>", "<LastNameAr>", "<FirstNameEn>", "<MiddleNameEn>", "<LastNameEn>", "<NationalID>", "<Gender>", "<ResidenceCountryId>", "<CityId>", "<District>", "<EducationLevelId>", "<Street>", "<BuildingNo>", and "<Occupation>"
    When The user sends a POST request with the credential
    Then I should receive a 200 status code

    Examples:
      | MobileNumber  | PhoneKeyId | UserClassificationId | Email                | UserName | Password   | FirstNameAr | MiddleNameAr | LastNameAr | FirstNameEn | MiddleNameEn | LastNameEn | NationalID | Gender | ResidenceCountryId | CityId | District | EducationLevelId | Street    | BuildingNo | Occupation |
      | 056610561     |   1        | 1                    | klm02@grr.la         | Keklm54   | Ahmed50#  | تست         | تست          | تست        | Gwendolyn    | Madonna     | Castaneda  | 75005560577 | Male   | 1                 |   2    | Nozha    | 7                | 6         | 4          | test test 05 |

