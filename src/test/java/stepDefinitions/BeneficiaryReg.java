package stepDefinitions;

import Pojo.UserBeneficiaryRegs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BeneficiaryReg {


    RequestSpecification res = new RequestSpecBuilder().setBaseUri("https://qcapi.anma.edu.sa/Api").build();
    Response resp;
    String BodyResponse;
    UserBeneficiaryRegs userProfile = new UserBeneficiaryRegs();

    @Given("User adds valid {string}, {string}, {string}, {string}, {string}, {string}, " +
            "{string}, {string}, {string}, {string}, {string}, " +
            "{string}, {string}, {string}, {string}, " +
            "{string}, {string}, {string}, {string}, " +
            "{string}, and {string}")
    public void theUserAddAValidAnd(String MobileNumber, String PhoneKeyId, String ClassificationId,
                                    String Email, String UserName, String Password, String FirstNameAr, String MiddleNameAr,
                                    String LastNameAr, String FirstNameEn, String MiddleNameEn, String LastNameEn,
                                    String NationalID, String Gender, String ResidenceCountryId, String CityId,
                                    String setDistrict, String EducationLevelId, String Street, String BuildingNo, String Occupation) {

        userProfile.setMobileNumber(MobileNumber);                 // change the mobile No.
        userProfile.setPhoneKeyId(PhoneKeyId);
        userProfile.setUserClassificationId(ClassificationId);
        userProfile.setEmail(Email);                      // change the Email
        userProfile.setUserName(UserName);                        // change the username
        userProfile.setPassword(Password);
        userProfile.setFirstNameAr(FirstNameAr);
        userProfile.setMiddleNameAr(MiddleNameAr);
        userProfile.setLastNameAr(LastNameAr);
        userProfile.setFirstNameEn(FirstNameEn);
        userProfile.setMiddleNameEn(MiddleNameEn);
        userProfile.setLastNameEn(LastNameEn);
        userProfile.setNationalID(NationalID);                  // change the National ID
        userProfile.setGender(Gender);
        userProfile.setResidenceCountryId(ResidenceCountryId);
        userProfile.setCityId(CityId);
        userProfile.setDistrict(setDistrict);
        userProfile.setEducationLevelId(EducationLevelId);
        userProfile.setStreet(Street);
        userProfile.setBuildingNo(BuildingNo);
        userProfile.setOccupation(Occupation);
    }
    @When("The user sends a POST request with the credential")
    public void theUserSendsAPOSTRequestWithTheCredential() {
        resp = given().header("Content-Type", "Application/json").spec(res).body(userProfile)
                .when().post("/WebUserAuth/BeneficiarySignup")
                .then().extract().response();
        BodyResponse =resp.asPrettyString();
        System.out.println(BodyResponse);
    }

    @Then("I should receive a {int} status code")
    public void iShouldReceiveAStatusCode(int SC) {
        resp.then().assertThat().statusCode(SC);
    }


}
