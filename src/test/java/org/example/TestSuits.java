package org.example;

import org.testng.annotations.Test;

public class TestSuits extends BaseTest
  
{
  HomePage homePage=new HomePage();
  RegistationPage registationPage=new RegistationPage();
  Loginpage loginpage=new Loginpage();
  MouseHoverinOnElement mouseHoverinOnElement=new MouseHoverinOnElement();
  @Test
    public void userShouldRegistrationSuccessfully()
  {
//    homePage.userShouldBenevigateOnHoePage();
    registationPage.userShouldBesubmmetdetailSuccessfully();
  }
  @Test
  public void userShouldbeLoginSuccessfully()
  {
    homePage.userShouldBenevigateOnHoePage();
    loginpage.userShouldBeLoginSuccessfully();
  }
  @Test
  public void userShouldbrselectproduct()
  {
    homePage.userShouldBenevigateOnHoePage();
    mouseHoverinOnElement.userShouldBeSelectClothing();


  }


}
