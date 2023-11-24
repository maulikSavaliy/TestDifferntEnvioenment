package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserManager extends Utils
{
    public void openBrowser()
    {
        String value="firefox";
        switch (value){
            case "chrome":
                System.setProperty("WebDriver.ChromeDriver.driver","src/test/Resources/driver/chromedriver.exe");
                driver= new ChromeDriver();
                break;
            case "edge":
                System.setProperty("WebDriver.msedge.driver","src/test/Resources/driver/msedgedriver.exe");
                driver= new EdgeDriver();
                break;
            case "firefox":
                System.setProperty("WebDriver.gecko.driver","src/test/Resources/driver/geckodriver.exe");
                driver= new FirefoxDriver();
                break;

        }
//        System.setProperty("WebDriver.ChromeDriver.driver","src/test/Resources/driver/chromedriver.exe");
//        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void closeBrowser()
    {
        driver.close();
    }
}
