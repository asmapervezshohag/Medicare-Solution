package com.peolentech.automationtrainingcourse;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ThirdWeekSelenium.Utility;

public class PropertyPractice extends Utility {
  @Test
 
	  public void f() throws IOException, InterruptedException {
			 
		  FileInputStream ds=new FileInputStream("C:\\Users\\asma_\\eclipse-workspace\\automation\\src\\main\\myparameter.properties");
		  Properties prop=new Properties();
		  prop.load(ds);
		  System.out.println(prop.getProperty("IDs"));
		  System.out.println(prop.getProperty("Password"));
		  Thread.sleep(6000);
		  driver.findElement(By.name("email")).sendKeys(prop.getProperty("IDs"));
		  driver.findElement(By.name("pass")).sendKeys(prop.getProperty("Password"));
		  Thread.sleep(6000);
		  driver.findElement(By.name("email")).clear();
		  driver.findElement(By.name("pass")).clear();
		  Thread.sleep(6000);
	  }
	

  }

