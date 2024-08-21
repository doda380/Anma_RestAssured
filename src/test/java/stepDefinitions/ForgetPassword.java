package stepDefinitions;
import Pojo.UserForgetPassword;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;



public class ForgetPassword extends UserForgetPassword {

    RequestSpecification res = new RequestSpecBuilder().setBaseUri("https://qcapi.anma.edu.sa/Api").build();
    Response  resp;
    String BodyResponse;

    UserForgetPassword f = new UserForgetPassword();


    @Given("User Add his {string}")
    public void userAddAValid(String Email) {
        f.setEmail(Email);
    }


    @When("The user send a POST request with the credentials")
    public void TheUserSendsPOST() {
        resp = given().header("Content-Type", "Application/json").spec(res).body(f)
                .when().post("WebUserAuth/ForgetPassword")
                .then().extract().response();
        BodyResponse =resp.asPrettyString();
        System.out.println(BodyResponse);
    }


    @Then("The response status should be {int}")
    public void theResponseStatusShouldBe(int SC) {
        resp.then().assertThat().statusCode(SC);
    }
}
