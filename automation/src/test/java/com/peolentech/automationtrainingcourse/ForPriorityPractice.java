package com.peolentech.automationtrainingcourse;

import org.testng.annotations.Test;

public class ForPriorityPractice {
  @Test ( priority=2)
  public void f() {
	  
	  System.out.println(" I am from priority 2nd");
  }
@Test(priority= 1)
public void carloan() {
	System.out.println(" I am from priority 1st");
}
}
