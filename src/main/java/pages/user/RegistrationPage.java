package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "id_gender")
    private List<WebElement> genders;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "customer_privacy")
    private WebElement customerPrivacyCbx;

    @FindBy(name = "psgdpr")
    private WebElement psgdprCbx;

    @FindBy(css = ".form-footer button")
    private WebElement saveBtn;

    public RegistrationPage selectMale(){
        genders.get(0).click();
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        sendKeys(this.firstName, firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName){
        sendKeys(this.lastName, lastName);
        return this;
    }
    public RegistrationPage setEmail(String email){
        sendKeys(this.email, email);
        return this;
    }
    public RegistrationPage setPassword(String password){
        sendKeys(this.password, password);
        return this;
    }
    public RegistrationPage acceptPolices(){
        click(customerPrivacyCbx);
        click(psgdprCbx);
        return this;
    }
    public RegistrationPage submitForm(){
        click(saveBtn);
        return this;
    }

}
