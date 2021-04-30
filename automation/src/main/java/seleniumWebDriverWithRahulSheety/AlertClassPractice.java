package seleniumWebDriverWithRahulSheety;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassPractice {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String text ="Shohel";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com//AutomationPractice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Shohel");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Alert']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Confirm']")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();
//driver.close();


	}

}
