package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			String text ="Shohel";
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com//AutomationPractice");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement mousehoover= driver.findElement(By.id("mousehover"));
			Actions ob= new Actions(driver);
			ob.moveToElement(mousehoover).build().perform();
			Thread.sleep(2000);
			WebElement toppage=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]"));
			ob.moveToElement(toppage).click().build().perform();

	}

}
