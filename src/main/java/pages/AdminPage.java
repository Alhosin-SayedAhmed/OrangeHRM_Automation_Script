package pages;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage {

    private final By roleDropdown = By.xpath("(//div[@class='oxd-select-wrapper'])[1]");
    private final By statusDropdown = By.xpath("(//div[@class='oxd-select-wrapper'])[2]");
    private final By numberOfRecords = By.xpath("//div[@class='oxd-table-body']/div");
    private final By addButton = By.xpath("(//button[contains(@class,'oxd-button--secondary')])[2]");
    private final By userNameSearch = By.xpath("//label[text()='Username']/../following-sibling::div//input");
    private final By employeeNameSearch = By.xpath("//input[@placeholder='Type for hints...']");
    private final By searchButton = By.xpath("//button[normalize-space()='Search']");
    private final By deleteButton = By.xpath("(//i[@class='oxd-icon bi-trash'])[1]");
    private final By confirmDeleteButton = By.xpath("//button[normalize-space()='Yes, Delete']");
    private final By resetButton = By.xpath("//button[normalize-space()='Reset']");
    private final By firstRecord = By.xpath("//div[@class='oxd-table-body']/div[1]");

    public AdminPage(WebDriver driver) {
        super(driver);
    }

    public int getRecordsCount() {
        wait.until(d -> d.findElement(firstRecord).isDisplayed());
        return driver.findElements(numberOfRecords).size();
    }

    public AddUserPage clickAdd() {
        click(addButton);
        return new AddUserPage(driver);
    }

    public void searchUser(String username, String role, String employee, String status) {
        type(userNameSearch, username);
        selectFromDropdown(roleDropdown, role);
        type(employeeNameSearch, employee);
        selectFromDropdown(employeeNameSearch, employee);
        selectFromDropdown(statusDropdown, status);
        click(searchButton);
    }

    public void deleteUser() {
        click(deleteButton);
        click(confirmDeleteButton);
        click(resetButton);
    }
}
