package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BrowserManager extends Utils
{
    LoadProap loadProap=new LoadProap();
//    String browserName="chrome";
    String browserName=System.getProperty("browser");
    URL url = null;
    public void openBrowser()
    {
     boolean sauce= Boolean.parseBoolean(System.getProperty("sauce"));

     if(sauce)
     {
         System.out.println("running in souce");
         if (browserName.equalsIgnoreCase("chrome"))
         {
             ChromeOptions browserOptions = new ChromeOptions();
             browserOptions.setPlatformName("Windows 10");
             browserOptions.setBrowserVersion("latest");
             Map<String, Object> sauceOptions = new HashMap<>();
             sauceOptions.put("username",loadProap.getProperty("souceusername") );
             sauceOptions.put("accessKey", loadProap.getProperty("key"));
             sauceOptions.put("build", "<your build id>");
             sauceOptions.put("name", "<your test name>");
             browserOptions.setCapability("sauce:options", sauceOptions);

             try {
                 url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
             } catch (MalformedURLException e) {
                 throw new RuntimeException(e);
             }
             driver = new RemoteWebDriver(url, browserOptions);
         } else if (browserName.equalsIgnoreCase("edge"))
         {
             EdgeOptions browserOptions = new EdgeOptions();
             browserOptions.setPlatformName("Windows 10");
             browserOptions.setBrowserVersion("latest");
             Map<String, Object> sauceOptions = new HashMap<>();
             sauceOptions.put("username", loadProap.getProperty("souceusername"));
             sauceOptions.put("accessKey", loadProap.getProperty("key"));
             sauceOptions.put("build", "<your build id>");
             sauceOptions.put("name", "<your test name>");
             browserOptions.setCapability("sauce:options", sauceOptions);

             try {
                 url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
             } catch (MalformedURLException e) {
                 throw new RuntimeException(e);
             }
              driver = new RemoteWebDriver(url, browserOptions);   
         } else if (browserName.equalsIgnoreCase("firefox"))
         {
             FirefoxOptions browserOptions = new FirefoxOptions();
             browserOptions.setPlatformName("Windows 10");
             browserOptions.setBrowserVersion("latest");
             Map<String, Object> sauceOptions = new HashMap<>();
             sauceOptions.put("username", loadProap.getProperty("souceusername"));
             sauceOptions.put("accessKey", loadProap.getProperty("key"));
             sauceOptions.put("build", "<your build id>");
             sauceOptions.put("name", "<your test name>");
             browserOptions.setCapability("sauce:options", sauceOptions);

             try {
                 url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
             } catch (MalformedURLException e) {
                 throw new RuntimeException(e);
             }
              driver = new RemoteWebDriver(url, browserOptions);
             
         }

     }
     else
     {
         if (browserName.equalsIgnoreCase("chrome"))
         {
             System.setProperty("WebDriver.ChromeDriver.driver","src/test/Resources/driver/chromedriver.exe");
             driver= new ChromeDriver();   
         } else if (browserName.equalsIgnoreCase("edge")) 
         {
             System.setProperty("WebDriver.msedge.driver","src/test/Resources/driver/msedgedriver.exe");
             driver= new EdgeDriver();   
         } else if (browserName.equalsIgnoreCase("firefox"))
         {
             System.setProperty("WebDriver.gecko.driver","src/test/Resources/driver/geckodriver.exe");
             driver= new FirefoxDriver();
         }
     }

//        System.setProperty("WebDriver.ChromeDriver.driver","src/test/Resources/driver/chromedriver.exe");
//        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");

    }
    public void closeBrowser()
    {
        driver.quit();
    }
}
//switch (value){
//        case "chrome":
//        System.setProperty("WebDriver.ChromeDriver.driver","src/test/Resources/driver/chromedriver.exe");
//        driver= new ChromeDriver();
//        break;
//        case "edge":
//        System.setProperty("WebDriver.msedge.driver","src/test/Resources/driver/msedgedriver.exe");
//        driver= new EdgeDriver();
//        break;
//        case "firefox":
//        System.setProperty("WebDriver.gecko.driver","src/test/Resources/driver/geckodriver.exe");
//        driver= new FirefoxDriver();
//        break;
//
//        }