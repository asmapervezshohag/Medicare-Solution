package seleniumWebDriverWithRahulSheety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicDropdown {// handling dynamicdropdown with indexing.
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath(" //div[@id='glsctl00_mainContent_ddl_originStation1"
				+ "_CTNR'] //a[@value='DED']")).click();//parents child traverse.
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PNQ']")).click();
		//driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();//I used index.
		driver.close();
	}

}
