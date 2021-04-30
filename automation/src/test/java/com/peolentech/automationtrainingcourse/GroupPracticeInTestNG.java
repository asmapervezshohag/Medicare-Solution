package com.peolentech.automationtrainingcourse;

import org.testng.annotations.Test;

public class GroupPracticeInTestNG {
  @Test(groups="smoke")
  public void Homeloan() {
	  System.out.println("I am from smoke test group");
  }
  @Test(groups="Regression")
  public void Carloan() {
	  System.out.println(" I am from Regression test group");
  }
  @Test(groups="System")
  public void healthloan() {
	  System.out.println(" I am from System test group");
  }
  @Test(groups="Sanity")
  public void boatloan() {
	  System.out.println(" I am from Sanity test group");
  }
  
}
