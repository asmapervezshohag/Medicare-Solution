package seleniumWebDriverWithRahulSheety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpDatedDropDown {
	static WebDriver driver;
/*This script is for checkbox count and selecting one checkbox from there
 * it has adding passenger dropdown too..
 * 
 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_IndArm']")).isSelected());
		Thread.sleep(6000L);
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).click();
		System.out
				.println(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_IndArm']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// String text = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("divpaxinfo")).click();// for the dropdown pan

		Thread.sleep(6000L);

		/*
		 * Increasing using while loop. int i=1; while(i<5) {
		 * driver.findElement(By.id("hrefIncAdt")).click(); i++; Increasing using for
		 * loop }
		 */
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();// for clicking the plus button
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		driver.findElement(By.id("btnclosepaxoption")).click();// for clicking the close button

		driver.close();

	}

}
