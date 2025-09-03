# OrangeHRM Automation Script

This project is an **automation testing framework** built for the [OrangeHRM demo application](https://opensource-demo.orangehrmlive.com/).  
It automates **Login → Add User → Search User → Delete User** using **Selenium WebDriver** and **TestNG**, applying the **Page Object Model (POM)** design pattern.

---
 * Author: Alhussain Sayed Ahmed
 * Role: QA Automation Engineer
 * Email: alhussainsayedahmed.work@gmail.com
 * Phone: +201272149450
---

## 🚀 Features
- Automates the full **End-to-End (E2E) user management flow**.
- Implements **Page Object Model (POM)** for better maintainability.
- Uses **BaseTest** for setup/teardown and **DriverFactory** for WebDriver configuration.
- Includes reusable **BasePage** methods (click, type, wait, etc.).
- Supports **scalable test structure** with TestNG.

---

## 🛠️ Tools & Technologies
- **Java 17+**
- **Selenium WebDriver 4.x**
- **TestNG 7.x**
- **WebDriverManager 5.x**
- **Maven** (build & dependency management)
- **IntelliJ IDEA **

---
## ▶️ Steps to Automate (E2E Scenario)

1. Navigate to the [OrangeHRM demo website](https://opensource-demo.orangehrmlive.com/).  
2. Login using:  
   - Username: `Admin`  
   - Password: `admin123`  
3. Click on the **Admin** tab in the left-side menu.  
4. Capture the **number of records** found.  
5. Click on **Add** button and fill in required user data.  
6. Click on **Save**.  
7. Verify that the number of records **increased by 1**.  
8. Search by the **newly created username**.  
9. Delete the user.  
10. Verify that the number of records **decreased by 1**.  
---

OrangeHRM_Automation_Script
│── pom.xml
│── .gitignore
│
├── src
│   ├── main
│   │   └── java
│   │       ├── basepage
│   │       │   └── BasePage.java
│   │       │
│   │       └── pages
│   │           ├── LoginPage.java
│   │           ├── OrangeHrmDashboard.java
│   │           ├── AdminPage.java
│   │           └── AddUserPage.java
│   │
│   └── test
│       └── java
│           ├── base
│           │   ├── BaseTest.java
│           │   └── DriverFactory.java
│           │
│           └── tests
│               ├── AllTests.java        # Login → Add User → Search → Delete
│               ├── LoginTest.java
│               ├── AddUserTest.java
│               ├── SearchUserTest.java
│               └── DeleteUserTest.java



