package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManager
{
    @BeforeMethod
   public void startBrowser()
   {
       openBrowser();
   }
//   @AfterMethod
//   public void endBrowser()
//   {
//       closeBrowser();
//   }
}
