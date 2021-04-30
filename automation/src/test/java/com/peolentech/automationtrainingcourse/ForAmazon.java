package com.peolentech.automationtrainingcourse;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ForAmazon {
  @Test
  public void f() {
	  System.out.println("This is for test run");
  }
  @Test
  public void my2ndtest() {
	  System.out.println(" This for my 2nd test annotation ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" This to run before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" This to run after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This to run before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This to run after class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" This run before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" This run after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" This to run before suite annotation");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" This to run after suite annotation");
  }

}
