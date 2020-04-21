package Steps.UI;

//import testNGPractice.Pages.GlobalVariable;

import CucumberExample.CukeRunner.Page.LoginP;
import Steps.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;



public class LoginStepDefinitions {

    LoginP loginP = new LoginP();


    @Given("^launch the application$")
    public void launch_the_application() throws Throwable
    {
        System.out.println("This Step open the Firefox and launch the application.");
        String URL = ConfigurationReader.getProperty("amazonPage");
        Driver.getDriver().get(URL);

//        loginP.openUrl(URL);
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable
    {
        System.out.println("This step enter the Username and Password on the login page.");
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable
    {
        System.out.println("This step click on the Reset button.");
    }

    @When("As a user I want to search phone (.*)")
    public void asAUserIWantToSearchPhonePhoneModel(String value) throws Exception {

        loginP.searchItem(value);
        Driver.closeDriver();
    }
}
