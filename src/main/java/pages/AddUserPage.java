package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage extends BasePage {

    private final By roleDropdown = By.xpath("(//div[@class='oxd-select-wrapper']/div[1]/div[1])[1]");
    private final By statusDropdown = By.xpath("(//div[@class='oxd-select-wrapper']/div[1]/div[1])[2]");
    private final By employeeNameField = By.xpath("//input[@placeholder='Type for hints...']");
    private final By userNameField = By.xpath("//label[text()='Username']/../following-sibling::div//input");
    private final By passwordField = By.xpath("//label[text()='Password']/../following-sibling::div//input");
    private final By confirmPasswordField = By.xpath("//label[text()='Confirm Password']/../following-sibling::div//input");
    private final By saveButton = By.xpath("//button[normalize-space()='Save']");

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void addNewEmployee(String role, String status, String employeeName, String username, String password, String confirmPassword) {
        selectFromDropdown(roleDropdown, role);
        selectFromDropdown(statusDropdown, status);
        type(employeeNameField, employeeName);
        selectFromDropdown(employeeNameField, employeeName);
        type(userNameField, username);
        type(passwordField, password);
        type(confirmPasswordField, confirmPassword);
    }

    public AdminPage clickSave() {
        click(saveButton);
        return new AdminPage(driver);
    }
}
