package TestNGMultipleClassRunPractice;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ThirdWeekSelenium.Utility;

public class PracticeDay1 extends Utility {
  @Test(dataProvider="signin")
  public void f(String e, String p) throws InterruptedException {
	  
	  driver.findElement(By.name("email")).sendKeys(e);
	  Thread.sleep(6000);
	  driver.findElement(By.name("pass")).sendKeys(p);
	  Thread.sleep(6000);
	  driver.findElement(By.name("email")).clear();
	  driver.findElement(By.name("pass")).clear();
	  Thread.sleep(6000);
  }
  @BeforeTest
  public void prerequiste() {
	 
	System.out.println(" Before test uses for clean the caches ");  
  }
  @DataProvider
  public Object[][]signin(){
	return new Object[][] {
		new Object[] {" joga@gmail.com","123"},
		new Object[] {" moga@gmail.com","4567"}
		
	};
	  
  }
  
}

