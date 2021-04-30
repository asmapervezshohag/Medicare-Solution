package com.peolentech.automationtrainingcourse;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ThirdWeekSelenium.HomeClass;
import ThirdWeekSelenium.Utility;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SignHomePage extends  Utility {
	
	@Test
	public void Pageobjprac() throws IOException {
		HomeClass HC = new HomeClass(driver);
		HC.searchfield();
		HC.searchIconClick();
		screenshot();
		String ed = HC.mysearch();
		System.out.println(ed);
		//Assert.assertEquals(ed, "\"computer\"");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(ed,"\"computer\"");
		HC.CustomerServiceClick();
		screenshot();
	}

	//public void beforeClass() {
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\geckodriver-v0.29.1-win64\\geckodriver.exe"
		 * ); driver = new FirefoxDriver();
		 * 
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\msedgedriver.exe"
		 * ); driver = new EdgeDriver();
		 * 
		 * driver.get("https://www.amazon.com/"); driver.manage().window().maximize();
		 */
		//browsers("FireFox");

	//}

	

//Below code is for taking screenshot.
	public void screenshot() throws IOException {
		Date dt = new Date();
		System.out.println(dt);
		String si = dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(si);
		File shotofscreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(shotofscreen,
				new File("C:\\Users\\asma_\\eclipse-workspace\\automation\\pictures\\" + si + "photo.png"));
	}

	}

