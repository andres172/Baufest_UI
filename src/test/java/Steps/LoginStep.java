package Steps;

import cucumber.api.java.en.Given;
import Pages.PortalPage;
import Base.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep extends Base{

    PortalPage portalPage;
    private Base basePage;

    public LoginStep(Base base){
        this.basePage = base;
        portalPage = new PortalPage(basePage.driver);
    }

    @Given("^User log in portal with ([^\"]*) and ([^\"]*)$")
    public void logInPortal(String username, String password) {
        portalPage.LoginUser(username,password);
    }

    @When("^User log out portal$")
    public void logOutPortal() {
        portalPage.Logout();
    }

    @Then("^Portal is loaded without user$")
    public void verifyPortalIsLoadedWithoutUser() {
        Assert.assertTrue(portalPage.SinUpLinKIsLoaded());
    }
}
