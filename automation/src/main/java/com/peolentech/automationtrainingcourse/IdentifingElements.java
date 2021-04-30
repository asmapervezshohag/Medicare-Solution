package com.peolentech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifingElements {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement searchbbox = driver.findElement(By.name("field-keywords"));
		WebElement Searchicon = driver.findElement(By.id("nav-search-submit-button"));
		searchbbox.sendKeys("Women Bangladeshi dress");
		Searchicon.click();
		WebElement books = driver.findElement(By.linkText("Books"));
		books.click();
		// WebElement spring = driver.findElement(By.partialLinkText("Spring clean with
		// "));
		// spring.click();
		// WebElement cart = driver.findElement(By.className("nav-line-2"));
		// cart.click();
		WebElement rturns = driver.findElement(By.xpath("(/html/body/div/header/div/div/div/div/a)[4]"));
		rturns.click();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("test@yahoo.com");
		WebElement button = driver.findElement(By.xpath("//input[@id='continue']"));
		button.click();
		WebElement password = driver.findElement(By.xpath("//*[@id='ap_password']"));
		password.sendKeys("12345");
		WebElement signin = driver.findElement(By.xpath("//*[@id='signInSubmit']"));
		signin.click();
		WebElement tx = driver.findElement(By.xpath("//*[text()='Important Message!']"));
		System.out.println(tx.isDisplayed());
		WebElement ch = driver.findElement(By.xpath("//*[contains(text(), 'the characters')]"));
		System.out.println(ch.isDisplayed());
		//driver.close();
		// Enter you see

	}

}
