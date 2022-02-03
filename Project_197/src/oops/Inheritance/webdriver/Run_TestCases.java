package oops.Inheritance.webdriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;

public class Run_TestCases extends Testcases
{
  @Test
  public void Tc01_VerifyLogin_valid() 
  {
	  userlogin();
	  Assert.assertTrue(verify_titlePresented("FB Page"));
  }
  
 
  @BeforeClass
  public void beforeClass() 
  {
	  setupbrowser();
  }

  @AfterClass
  public void afterClass()
  {
	  endbrowser();
  }

}
