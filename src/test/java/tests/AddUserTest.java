package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.AddUserPage;
import pages.OrangeHrmDashboard;

public class AddUserTest extends BaseTest {

    @Test
    public void testAddUser() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        OrangeHrmDashboard dashboard = loginPage.clickLoginButton();
        AdminPage adminPage = dashboard.clickAdminButton();

        int beforeCount = adminPage.getRecordsCount();
        System.out.println("Number of records found =" + beforeCount);
        AddUserPage addUserPage = adminPage.clickAdd();

        addUserPage.addNewEmployee("ESS", "Enabled", "A8DCo 4Ys 010Z", "Alhussain123", "ALHussain123", "ALHussain123");
        adminPage = addUserPage.clickSave();

        int afterCount = adminPage.getRecordsCount();
        System.out.println("Number of new records after add new employee =" + afterCount);
        Assert.assertEquals(afterCount, beforeCount + 1, "User not added correctly");
    }
}
