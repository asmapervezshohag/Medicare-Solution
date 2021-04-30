package com.peolentech.automationtrainingcourse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");//opening browser.
		driver.manage().window().maximize();//maximize the window.
		Thread.sleep(6000);
		driver.navigate().refresh();// refresh the window.
		Thread.sleep(6000);
		driver.navigate().back();// going back.
		Thread.sleep(6000);
		driver.navigate().forward();// going forward.
		String a = driver.getCurrentUrl();// for getting the current url.
		System.out.println("This is the url= "+ a);
		WebElement linkclick= driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]"));
		linkclick.click();
		Thread.sleep(6000);
		String title = driver.getTitle();// for getting title of the page.
		
		
		System.out.println("This is the title of my current page= " + title);
		String windowhand =driver.getWindowHandle();// for getting window handle.
		System.out.println( "Current window handle is= " + windowhand);
		driver.close();// closes the current browser.
		driver.quit();//close all the browsers opened by selenium script.
	}
}
