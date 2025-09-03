package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.AddUserPage;
import pages.OrangeHrmDashboard;

/**
 * Author: Alhussain Sayed Ahmed
 * Role: QA Automation Engineer
 * Email: alhussainsayedahmed.work@gmail.com
 * Phone: +201272149450

 * Project: OrangeHRM Automation Framework
 *   Key Features:
 *  1. Navigate to the website
 *  2. Login using: - Username: Admin - Password: admin123
 *  3. Click on the Admin tab in the left-side menu
 *  4. Capture the number of records found
 *  5. Click on Add button and fill in required user data
 *  6. Click on Save
 *  7. Verify that the number of records increased by 1
 *  8. Search by the newly created username
 *  9. Delete the user
 * 10. Verify that the number of records decreased by 1

 *   Technologies Used:
 *     - Java - Selenium WebDriver - TestNG - WebDriverManager - Google Chrome (browser) - IntelliJ IDEA (IDE)

 */

public class AllTests extends BaseTest {

    @Test
    public void testEndToEndScenario() {
        // Step 1: Login
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        OrangeHrmDashboard orangeHrmDashboard = loginPage.clickLoginButton();
        Assert.assertNotNull(orangeHrmDashboard, "Login failed, dashboard not loaded!");

        // Step 2:Capture the current record count, add a new user and then capture the updated record count after adding the user
        AdminPage adminPage = orangeHrmDashboard.clickAdminButton();
        int recordsfound = adminPage.getRecordsCount();
        System.out.println("Number of records found =" + recordsfound);

        AddUserPage addUserPage = adminPage.clickAdd();
        addUserPage.addNewEmployee("ESS", "Enabled", "Timothy Lewis Amiano",
        "Alhussain sayedahmed", "Pass1234!", "Pass1234!");
        adminPage = addUserPage.clickSave();

        int afterAddCount = adminPage.getRecordsCount();
        System.out.println("Number of new records after add new employee =" + afterAddCount);
        Assert.assertEquals(afterAddCount, recordsfound + 1, "User not added correctly!");

        // Step 3: Search
        adminPage.searchUser("Alhussain sayedahmed", "ESS", "Timothy Lewis Amiano", "Enabled");

        // Step 4: Delete user then capture new record
        adminPage.deleteUser();
        int afterDeleteCount = adminPage.getRecordsCount();
        System.out.println("Number of new records after add new employee =" + afterDeleteCount);
        Assert.assertEquals(afterDeleteCount, recordsfound, "User was not deleted correctly!");
    }
}
