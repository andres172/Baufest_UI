package Steps;

import Base.Base;
import Pages.CartPage;
import Pages.PortalPage;
import Pages.ProductPage;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class BuyProductStep extends Base {

    private Base basePage;
    PortalPage portalPage;
    ProductPage productPage;
    CartPage cartPage;

    public BuyProductStep(Base base){

        this.basePage = base;
        portalPage = new PortalPage(basePage.driver);
        productPage = new ProductPage(basePage.driver);
        cartPage = new CartPage(basePage.driver);
    }

    @Given("^User selects laptop category$")
    public void userSelectsLaptopategory() {
        portalPage.SelectLaptopCategory();
    }

    @Given("^User selects first laptop on the list$")
    public void userSelectsFisrtLaptopOnTheList() {
        portalPage.SelectFirstProductOnTheList();
    }
    @And("^User add product to car$")
    public void userAddProductToCar() {
        productPage.AddToChart();
    }

    @Then("^Product is added to car$")
    public void productIsAddedToCar() {
        Assert.assertEquals(cartPage.getTitleProduct() ,"Sony vaio i5");
        Assert.assertEquals(cartPage.getPriceProduct(),"790");
    }

    @When("^User close the alert message$")
    public void closeTheAlertMessage() {
        portalPage.CloseAlertMessage();
    }

    @And("^User goes to Car section$")
    public void userGoesToCarSection() {
        portalPage.GoToCarSection();
    }

}
