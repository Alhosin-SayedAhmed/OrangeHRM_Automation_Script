package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.OrangeHrmDashboard;

public class DeleteUserTest extends BaseTest {

    @Test
    public void testDeleteUser() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        OrangeHrmDashboard dashboard = loginPage.clickLoginButton();
        AdminPage adminPage = dashboard.clickAdminButton();

        int beforeCount = adminPage.getRecordsCount();
        System.out.println("Number of new records after add new employee =" + beforeCount);
        adminPage.deleteUser();
        int afterCount = adminPage.getRecordsCount();
        System.out.println("Number of new records after add new employee =" + afterCount);


        Assert.assertEquals(afterCount, beforeCount - 1, "User was not deleted correctly");
    }
}
