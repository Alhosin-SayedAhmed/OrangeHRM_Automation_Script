package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmDashboard extends BasePage {

    private  By adminButton = By.cssSelector("li.oxd-main-menu-item-wrapper:first-child");

    public OrangeHrmDashboard(WebDriver driver) {
        super(driver);
    }

    public AdminPage clickAdminButton() {
        click(adminButton);
        return new AdminPage(driver);
    }
}
