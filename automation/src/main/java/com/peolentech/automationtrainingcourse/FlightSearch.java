package com.peolentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightSearch {
	static WebDriver driver;
	private static JavascriptExecutor js;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		js=(JavascriptExecutor)driver;
		driver.get("https://www.travelocity.com/");
		driver.manage().window().maximize();
		
		WebElement flight = driver.findElement(By.id("d1-btn"));
		flight.click();
		/*Thread.sleep(2000);
		WebElement arrowclick = driver.findElement(
				By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging'])[2]"));
		arrowclick.click();*/
		Thread.sleep(2000);

		WebElement Datetravel = driver.findElement(By.xpath("//button[@aria-label='May 3, 2021.']"));
	Datetravel.click();
	Thread.sleep(2000);
	WebElement donebc= driver.findElement(By.xpath("(//*[text()='Done'])[1]"));
	js.executeScript("arguments[0].click",donebc);
	//donebc.click();
		 //Thread.sleep(2000);
		// WebElement travelers = driver.findElement(By.xpath("//button[@aria-label='1 room, 2 travelers']"));
		 //travelers.click();
		//Thread.sleep(2000);
	// WebElement addTra= driver.findElement(By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'] [2])"));

	// addTra.click();
		// driver.close();

	}

}
