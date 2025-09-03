package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.OrangeHrmDashboard;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        OrangeHrmDashboard dashboard = loginPage.clickLoginButton();
        Assert.assertNotNull(dashboard, "Login failed, dashboard not loaded!");
    }
}
