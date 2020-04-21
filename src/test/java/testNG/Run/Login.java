package testNG.Run;

import testNG.Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class Login extends BaseTest {

    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void LoginEmptyEmailTest(){

        loginPage.openPage();
        loginPage.enterPassword("qwerty");
        loginPage.submit();

        Assert.assertTrue(loginPage.errorMessageAppeared());

    }

}
