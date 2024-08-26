package stepDefinitions;
import Pojo.BeneficiaryUserProfile;
import Pojo.SP_Profile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetProfile {

    BeneficiaryUserProfile x= new BeneficiaryUserProfile();
    SP_Profile z = new SP_Profile();




    @Given("The user send a GET request")
    public void theUserSendAGETRequest() {
        z.SPUserProfile();
    }

    @Then("The user will be able to see his profile data")
    public void theUserWillBeAbleToSeeHisProfileData() {
        z.DisplayRespone();
    }

    @Given("The user send a GET request with the credentials")
    public void theUserSendAGETRequestWithTheCredentials() {
        x.UserProfile();
    }

    @Then("The user will be able to see the profile data")
    public void theUserWillBeAbleToSeeTheProfileData() {
        x.DisplayRespone();
    }
}
