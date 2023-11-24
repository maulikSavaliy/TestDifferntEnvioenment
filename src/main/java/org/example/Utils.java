package org.example;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;

public class Utils extends Basepage
{
    public String password="rakesh123";
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    public void EnterValueInElement(By by,String value)
    {
        driver.findElement(by).sendKeys(value);
    }
    public String timeStamp()
    {
       String timeStamp=new SimpleDateFormat("yyyymmddhhmmss").format(new java.util.Date());
       return timeStamp;
    }

}
