package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

//Using PicoContainer to share state between steps in a scenario is easy and non-intrusive. All you need is a constructor that requires an object that PicoContainer can create and inject. PicoContainer is invisible. Add a dependency to cucumber-picocontainer and make sure that the constructors for the step classes require an instance of the same class.
public class HomePageSteps {

    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        homePage.navigateTo_HomePage();
    }

    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product)  {
        homePage.perform_Search(product);
    }

}