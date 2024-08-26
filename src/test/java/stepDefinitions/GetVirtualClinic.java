package stepDefinitions;

import Pojo.Virtual_Clinic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetVirtualClinic {

    Virtual_Clinic vc = new Virtual_Clinic();
    @Given("The user send a GET request to the virtual clinc")
    public void theUserSendAGETRequestToTheVirtualClinc() {
        vc.VirtualClinic();
    }

    @Then("The user will be able to see all the doctors")
    public void theUserWillBeAbleToSeeAllTheDoctors() {
        vc.DisplayRespone();
    }
}
