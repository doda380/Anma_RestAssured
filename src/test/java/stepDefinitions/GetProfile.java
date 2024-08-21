package stepDefinitions;
import Pojo.GetUserProfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetProfile {

    GetUserProfile x= new GetUserProfile();
    @Given("The user send a GET request with the credentials")
    public void theUserSendAGETRequestWithTheCredentials() {
        x.UserProfile();
    }

    @Then("The user will be able to see the profile data")
    public void theUserWillBeAbleToSeeTheProfileData() {
        x.DisplayRespone();
    }
}
