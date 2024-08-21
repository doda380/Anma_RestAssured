package stepDefinitions;
import io.cucumber.java.en.And;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import Pojo.UserLogin;
import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class Login  {

    UserLogin lgn= new UserLogin() ;

    RequestSpecification res = new RequestSpecBuilder().setBaseUri("https://qcapi.anma.edu.sa/Api").build();
    Response  resp;
    String BodyResponse;


    @Given("User Add a valid {string} & {string}")
        public void userAddAValid(String US, String Pass) {

        lgn.setUsername(US);
        lgn.setPassword(Pass);

    }

    @When("The user sends a POST request with the credentials")
    public void TheUserSendsPOST() {

        resp = given().header("Content-Type", "Application/json").spec(res).body(lgn)
                .when().post("/WebUserAuth/AuthenticateWeb")
                .then().extract().response();
        BodyResponse =resp.asPrettyString();
        System.out.println(BodyResponse);

    }

    @Then("The Response body will return the token")
    public void thenTheStatusCode() {
        JsonPath js = new JsonPath(BodyResponse);
        lgn.setToken(js.get("Data.Token"));
    }


    @And("The Response body will return the HasOrderFree")
    public void theResponseBodyWillReturnTheHasOrderFree() {
        JsonPath js = new JsonPath(BodyResponse);
        lgn.setHasOrderFree(js.get("Data.HasOrderFree"));
    }

    @And("The Response body will return the UserType")
    public void theResponseBodyWillReturnTheUserType() {
        JsonPath js = new JsonPath(BodyResponse);
        lgn.setUserType(js.get("Data.UserType"));
    }

    @Then("the response status should be {int}")
    public void theResponseStatusShouldBe(int SC) {

        resp.then().assertThat().statusCode(SC);

    }


}






