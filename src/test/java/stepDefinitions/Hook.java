package stepDefinitions;

import Pojo.UserLogin;
import io.cucumber.java.Before;
import org.testng.SkipException;

import java.util.Objects;

public class Hook {

    @Before("@ServiceProvider")
    public void skipIfNotServiceProvider() {
        UserLogin ut = new UserLogin();
        if (!Objects.equals(ut.getUserType(), "ServiceProviderUser")) {
            throw new SkipException("Skipping scenario: Not a Service Provider user");
        }
    }

    @Before("@Beneficiary")
    public void skipIfNotBeneficiaryUser() {
        UserLogin ut = new UserLogin();
        if (!Objects.equals(ut.getUserType(), "BeneficiaryUser")) {
            throw new SkipException("Skipping scenario: Not a Service Provider user");
        }
    }
}
