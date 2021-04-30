import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions obj = new Actions(driver);
//WebElement signoff= driver.findElement(By.id("nav-link-accountList"));
//obj.moveToElement(signoff).build().perform();
//WebElement linkclick=driver.findElement(By.linkText("Watchlist"));
//obj.moveToElement(linkclick).click().build().perform();
		obj.keyDown(Keys.SHIFT).build().perform();
		WebElement bestsellers = driver.findElement(By.linkText("Best Sellers"));
		bestsellers.click();
		obj.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowsid = driver.getWindowHandles();
		Iterator<String> wind = windowsid.iterator();
		String firstwindohandle = wind.next();
		String secondwindowhandle = wind.next();
		System.out.println(firstwindohandle);
		System.out.println(firstwindohandle);
		driver.switchTo().window(secondwindowhandle);
		WebElement NewElement = driver.findElement(By.linkText("Cell Phones & Accessories"));
		NewElement.click();
		driver.switchTo().window(firstwindohandle);

		/*
		 * Actions obj= new Actions(driver);
		 * driver.get("https://jqueryui.com/droppable/");
		 * driver.manage().window().maximize(); driver.switchTo().frame(0); WebElement
		 * draggable= driver.findElement(By.id("draggable")); WebElement droppable =
		 * driver.findElement(By.id("droppable")); obj.dragAndDrop(draggable,
		 * droppable).build().perform(); driver.switchTo().parentFrame(); WebElement
		 * droppablelink = driver.findElement(By.linkText("Droppable"));
		 * droppablelink.click();
		 */
//driver.close();

	}

}
