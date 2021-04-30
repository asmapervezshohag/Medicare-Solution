package com.peolentech.automationtrainingcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MacysHomePage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		String macys = driver.getCurrentUrl();
		System.out.println(" This is the current url : " + macys);
		Thread.sleep(6000);
		/*String title = driver.getTitle();
		System.out.println(" This is the title of my current page : " + title);*/
		
		String windowhand = driver.getWindowHandle();
		System.out.println(" Current window handle is= " + windowhand);
		
		driver.close();
		driver.quit();
	}

}
