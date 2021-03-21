package Steps;

import Pages.PortalPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;
import Base.Base;

public class SignUpStep extends Base {

    private Base basePage;
    PortalPage portalPage;

    public SignUpStep(Base base){

        this.basePage = base;
        portalPage = new PortalPage(basePage.driver);
    }

    @When("^User sign up in portal with ([^\"]*) and ([^\"]*)$")
    public void signUpInPortal(String username, String password) {
        portalPage.SingUpUser(username,password);
    }

    @Then("^User is signed in portal$")
    public void userIsSignedInPortal() {
        assertTrue(portalPage.GetAlertMessage().equals("Sign up successful.") || portalPage.GetAlertMessage().equals("This user already exist."));
    }

}
