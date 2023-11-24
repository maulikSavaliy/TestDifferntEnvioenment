package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverinOnElement extends Utils
{
    public void userShouldBeSelectClothing()
    {
        // create varirable of element locater
        WebElement _apparel= driver.findElement(By.xpath("//div[@class=\"header-menu\"]/ul[@class=\"top-menu notmobile\"]/li[3]"));
        // create a object of actions class
        Actions builder =new Actions(driver);
        //give action of mouse on move to element
        Action mouseHoveraAndClick=builder.moveToElement(_apparel).build();
        //perform command to perform action
        mouseHoveraAndClick.perform();
        //click on clothin function
        clickOnElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/ul/li[2]"));
        //click on item
        clickOnElement(By.xpath("//h2[@class=\"product-title\"]/a[text()='Custom T-Shirt']"));
    }
}
