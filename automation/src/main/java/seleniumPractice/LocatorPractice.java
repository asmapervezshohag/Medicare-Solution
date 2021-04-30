package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.findElement(By.xpath("//*[@id=\'globalnavbar-header-container\']/div[2]/div/div[5]"
				+ "/div/div/div[1]/a")).click();
				driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("hellowWorld");
		//driver.findElement(By.id("username")).sendKeys("hellowWorld");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123434");
		driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		
	}

}
