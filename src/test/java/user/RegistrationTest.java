package user;

import base.TestBase;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.commons.TopMenuPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

public class RegistrationTest extends TestBase {

    @Test
    public void shouldFillForWithSuccess(){
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        LoginPage loginPage = new LoginPage(driver);


        topMenuPage.goToSignIn();
        loginPage.goToRegistration();

        new RegistrationPage(driver)
                .selectMale()
                .setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail("luk@luk.pl")
                .setPassword("pass")
                .acceptPolices()
                .submitForm();

    }


}
