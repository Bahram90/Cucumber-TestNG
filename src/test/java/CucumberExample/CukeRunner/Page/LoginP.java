package CucumberExample.CukeRunner.Page;

import DynomicMethods.ReUsableMethods;
import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.sql.Driver;
import java.util.List;

public class LoginP extends AbstractPageBase {

    ReUsableMethods foxUI = new ReUsableMethods();

//    =========GOOGLE============

    //locators
    @FindBy (xpath = "//input[@name='q']")
    public WebElement googleSearch;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement amazonSearch;


    public void searchItem(String value) throws Exception {

//        amazonSearch.sendKeys(value);
        foxUI.enterText(amazonSearch,value+ Keys.ENTER);


    }

}
