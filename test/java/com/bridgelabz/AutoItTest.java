package com.bridgelabz;

import com.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoItTest extends Base{
    @Test
    public void loginTest() throws InterruptedException, IOException {
Login login = new Login(driver);
String actualTitle = login.login_with_valid();
String expectedTitle = "LinkedIn: Log In or Sign Up";
Assert.assertEquals(actualTitle,expectedTitle);
System.out.println("Your file is uploaded successfully");
    }
}
