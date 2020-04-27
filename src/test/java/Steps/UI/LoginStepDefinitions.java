package Steps.UI;

//import testNGPractice.Pages.GlobalVariable;

import CucumberExample.CukeRunner.Page.LoginP;
import Steps.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.lang.reflect.Method;


public class LoginStepDefinitions {

//    LoginP loginP = new LoginP();


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

    @When("As a user I want to search phone (.*) and methodName (.*)")
    public void asAUserIWantToSearchPhonePhoneModelAndMethodName (String value, String methodName) throws Exception {

//Java Reflection:
//        for more info https://www.geeksforgeeks.org/reflection-in-java/
/*t's all in the Javadoc. getMethods: "Returns an array containing Method objects reflecting all the public methods of the class or interface represented by this Class object, including those declared by the class or interface and those inherited from superclasses and superinterfaces." getDeclaredMethods: "Returns an array containing Method objects reflecting all the declared methods of the class or interface represented by this Class object, including public, protected, default (package) access, and private methods, but excluding inherited methods.*/
        LoginP loginP = new LoginP();
        Class<?> cls = loginP.getClass();
//        Method method = cls.getMethod(methodName, String.class);
        Method method = cls.getDeclaredMethod(methodName, String.class);
        method.invoke(loginP,value);
//        loginP.searchItem(value);
        Driver.closeDriver();
    }
}
