package org.example;

import org.openqa.selenium.By;

public class RegistationPage extends Utils
{
    String email="rakesh"+timeStamp()+"@gmail.com";

    public void userShouldBesubmmetdetailSuccessfully()
    {
        //click on reister button
        clickOnElement(By.cssSelector("a.ico-register"));
        //enter firstname
        EnterValueInElement(By.cssSelector("input#FirstName"),"rakesh");
        //enter last name
        EnterValueInElement(By.cssSelector("input#LastName"),"sharma");
        //enter email
        EnterValueInElement(By.cssSelector("input#Email"),email);
        System.out.println(email);
        //enter a compeny name
        EnterValueInElement(By.cssSelector("input#Company"),"aaaa");
        //enter password
        EnterValueInElement(By.cssSelector("input#Password"),password);
        //enter confrim password
        EnterValueInElement(By.cssSelector("input#ConfirmPassword"),password);
        //click on register button
        clickOnElement(By.cssSelector("button#register-button"));
    }
}
