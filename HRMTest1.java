package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRMTest1 {
	
static{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

WebDriver driver;

@BeforeMethod
public void openBrowser()
{
	driver = new FirefoxDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
}

/*  @Test (priority = 1)
  
  public void test1() throws InterruptedException {
	//  openBrowser();
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  String aTitle = driver.getTitle();
	  Reporter.log("Title is : " + aTitle, true);
	  String eTitle = "OrangeHRM";
	  Assert.assertEquals(eTitle, aTitle);
	  Thread.sleep(2000);
	  }
  
  @Test (priority = 2, enabled = true) 
  public void test2() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  String currentURL = driver.getCurrentUrl();
	  Reporter.log("Current URL is : " +currentURL, true);
	  Thread.sleep(5000);
	  }
  
  @Test (priority = 3, enabled = true)
  public void test3() throws InterruptedException {
	  Reporter.log("I am here", true);
	  driver.get("http://alchemy.hguy.co/orangehrm");
//	  Thread.sleep(5000);
	  uname.sendKeys("orange");
	  password.sendKeys("orangepassword123");
	  login.click();
	  Thread.sleep(3000);
	  
	  boolean d = dashboard.isDisplayed();
	  Assert.assertTrue(d);
	  
//	  driver.close();
  } */
  
  @AfterMethod
  
  public void teardown() {
	  Reporter.log("teardown method", true);
	  driver.close();
  }
}
