package testNG.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    GlobalVariable globalVariable = new GlobalVariable();
//    WebDriver driver;

    //locators
    @FindBy(css = "#password")
    private WebElement password;

    @FindBy (css = "[data-testid='loginSubmit']")
    private WebElement submitBtn;

    @FindBy (css = ".ui.error.message")
    private WebElement errorMessage;

    @FindBy (how = How.ID,using = "email")
    private WebElement emailText;


    //Methods
    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void enterLogin(String email){

        emailText.sendKeys(email);
    }

    public void submit(){

        this.submitBtn.click();
    }

    public boolean errorMessageAppeared() {

        return errorMessage.isDisplayed();
    }

//    open url
    public void openPage() {
        globalVariable.driver.get("https://deens-master.now.sh/login");
    }

//constructor for browser
    public LoginPage(WebDriver driver) {
        this.globalVariable.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
