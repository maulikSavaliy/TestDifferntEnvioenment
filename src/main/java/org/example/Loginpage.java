package org.example;

import org.openqa.selenium.By;

public class Loginpage extends Utils
{
    public void userShouldBeLoginSuccessfully()
    {
        //click on login button
        clickOnElement(By.cssSelector("a.ico-login"));
        //enter a valur of email
        EnterValueInElement(By.cssSelector("input#Email"),"rakesh20230024080027@gmail.com");
        //enter value of password
        EnterValueInElement(By.cssSelector("input.password"),password);
        //click on log in button
        clickOnElement(By.xpath("//button[text()='Log in']"));
    }
}
