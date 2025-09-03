package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private  By username = By.cssSelector("input[name='username']");
    private  By password = By.cssSelector("input[name='password']");
    private  By loginButton = By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String user) {
        type(username, user);
    }

    public void enterPassword(String pass) {
        type(password, pass);
    }

    public OrangeHrmDashboard clickLoginButton() {
        click(loginButton);
        return new OrangeHrmDashboard(driver);
    }
}
