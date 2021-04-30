package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDragAndDropPractice {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions obj = new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
WebElement drag=driver.findElement(By.id("draggable"));
WebElement drop = driver.findElement(By.id("droppable"));
obj.dragAndDrop(drag, drop).build().perform();
driver.switchTo().parentFrame();

WebElement droptext=driver.findElement(By.xpath("(//*[text()='Droppable'])[1]"));
String tx=droptext.getText();
System.out.println(tx);
	}

}
