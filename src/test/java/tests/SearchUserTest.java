package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.OrangeHrmDashboard;

public class SearchUserTest extends BaseTest {

    @Test
    public void testSearchUser() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        OrangeHrmDashboard dashboard = loginPage.clickLoginButton();
        AdminPage adminPage = dashboard.clickAdminButton();

        adminPage.searchUser("Alhussain123", "ESS", "A8DCo 4Ys 010Z", "Enabled");
    }
}
