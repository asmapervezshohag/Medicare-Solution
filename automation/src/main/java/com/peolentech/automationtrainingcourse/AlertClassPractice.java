package com.peolentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassPractice {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.travelocity.com/");
		driver.manage().window().maximize();
		/*
		 * WebElement alerts = driver.findElement(By.name("alert")); alerts.click();
		 * driver.switchTo().alert().accept(); WebElement alertdismiss =
		 * driver.findElement(By.name("confirmation")); alertdismiss.click();
		 * driver.switchTo().alert().dismiss(); WebElement alertsendtx =
		 * driver.findElement(By.name("prompt")); alertsendtx.click();
		 * driver.switchTo().alert().sendKeys("This is an alert");
		 * driver.switchTo().alert().dismiss();
		 */

		WebElement flight = driver.findElement(By.id("d1-btn"));
		flight.click();
		Thread.sleep(2000);
		WebElement arrowclick = driver.findElement(
				By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-button-paging'])[2]"));
		arrowclick.click();
		Thread.sleep(2000);

		WebElement Datetravel = driver.findElement(By.xpath("//button[@aria-label='May 3, 2021.']"));
		Datetravel.click();
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div"
				+ "/div/div[1]/div/div[2]/div/div[3]/button/span/span")).click();
		 Thread.sleep(2000);
		 WebElement travelers = driver.findElement(By.xpath("//button[@aria-label='1 room, 2 travelers']"));
		 travelers.click();
		Thread.sleep(2000);
	 WebElement addTra= driver.findElement(By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'] [2])"));

	 addTra.click();
		// driver.close();

	}

}
