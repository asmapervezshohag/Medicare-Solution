package seleniumWebDriverWithRahulSheety;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windows = driver.getWindowHandles();// this will give me parent and child window id

	Iterator<String>winid= windows.iterator();
	String parentid=winid.next();
	String childid = winid.next();
	driver.switchTo().window(childid);
System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());	  
	}

}
