package OrangeHRM;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class HRMTest2 extends HRMTest1{
	
	private HRMTest1 HRMObject;
	
	@Test (priority = 1, enabled = true)

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
	  Reporter.log("Test 3 Running : ", true);
	  driver.get("http://alchemy.hguy.co/orangehrm");
	  Thread.sleep(5000);
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
	  Thread.sleep(4000);
	  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  
	  boolean d = driver.findElement(By.id("menu_dashboard_index")).isDisplayed();
	  Assert.assertTrue(d);
	 }

@Test (priority = 4, enabled = true)
public void test4() throws InterruptedException {
	Reporter.log("Test 4 Running : ", true);
	driver.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(5000);
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	driver.findElement(By.id("firstName")).sendKeys("Sudharsan");
	driver.findElement(By.id("lastName")).sendKeys("Natarajan");
	driver.findElement(By.id("btnSave")).click();
	
	driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Sudharsan Natarajan");
	Thread.sleep(8000);
	driver.findElement(By.id("searchBtn")).click();
	Thread.sleep(8000);
	String s = driver.findElement(By.linkText("Sudharsan")).getText();
	Thread.sleep(8000);
	Assert.assertEquals(s, "Sudharsan");
	
}

@Test (priority = 5, enabled = true)
public void test5() throws InterruptedException{
	Reporter.log("Test 5 Running : ", true);
	driver.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(5000);
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("personal_txtEmpFirstName")).clear();
	driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Sudhar");
	driver.findElement(By.id("btnSave")).click();
	Thread.sleep(3000);
	
}

@Test (priority = 6, enabled = true)
public void test6() throws InterruptedException{
	Reporter.log("Test 5 Running : ", true);
	driver.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(2000);
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	
	WebElement d = driver.findElement(By.id("menu_directory_viewDirectory"));
	boolean b = d.isDisplayed();
	Assert.assertEquals(b, true);
	Reporter.log("Directory Menu is Displayed and Clickable", true);
	d.click();
	//WebElement w = driver.findElement(By.xpath("//div[3]/div[1]/a"));
	WebElement w = driver.findElement(By.tagName("h1"));
	String t = w.getAttribute("value");
	Reporter.log("Text in Search is : "+t, true);
	}

@Test (priority = 7, enabled = true)
public void test7() throws InterruptedException{
	Reporter.log("Test 7 Running : ", true);
	driver.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(2000);
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	driver.findElement(By.linkText("Qualifications")).click();
	driver.findElement(By.id("addWorkExperience"));
	driver.findElement(By.id("experience_employer")).sendKeys("IBM");
	driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Specialist");
	driver.findElement(By.id("experience_from_date")).sendKeys("2011-05-26");
	driver.findElement(By.id("experience_to_date")).sendKeys("2020-05-26");
	Thread.sleep(5000);
	driver.findElement(By.id("btnWorkExpSave")).click();
	Thread.sleep(5000);
}

@Test (priority = 8, enabled = true)
public void test8() throws InterruptedException{
	Reporter.log("Test 8 Running : ", true);
	driver.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(2000);
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("menu_dashboard_index")).click();
	driver.findElement(By.linkText("Apply Leave")).click();
	Select s = new Select(driver.findElement(By.className("valid")));
	s.selectByVisibleText("Paid Leave");
	driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2020-09-01");
	driver.findElement(By.id("applyBtn")).click();
	Thread.sleep(8000);
}

@Test (priority = 9, enabled = true)
public void test9() throws InterruptedException{
	Reporter.log("Test 8 Running : ", true);
	driver.get("http://alchemy.hguy.co/orangehrm");
	Thread.sleep(2000);
	driver.findElement(By.id("txtUsername")).sendKeys("orange");
	Thread.sleep(4000);
	driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	driver.findElement(By.linkText("Emergency Contacts")).click();
	driver.findElement(By.id("btnAddContact")).click();
	driver.findElement(By.id("emgcontacts_name")).sendKeys("Sathya");
	driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Spouse");
	driver.findElement(By.id("btnSaveEContact")).click();
}
}
