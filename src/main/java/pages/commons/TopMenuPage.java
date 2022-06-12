package pages.commons;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

public class TopMenuPage extends BasePage {
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".user-info a")
    private WebElement goToSignInBtn;

    @FindBy(css = ".account span")
    private WebElement userName;

    @FindBy(css = "[name='s']")
    private WebElement searchInput;

    @FindBy(css = "#search_widget .search")
    private WebElement searchBtn;


    public void goToSignIn(){
        click(goToSignInBtn);
    }
    public String getLoggedInUserName(){
        return userName.getText();
    }

    public void searchForProduct(String productToSearch) {
        sendKeys(searchInput, productToSearch);
        click(searchBtn);
    }


}
