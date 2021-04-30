package ThirdWeekSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObModel {
		/* according to page object model we can create separate class for each 
		 * page of the application and we locate all the element according to page inside
		 * each class.
		 * The page object classes we will be creating we have to do 3 separate action inside
		 * those classes.
		 * 1st-Whatever elements we need from that page locate that elements.
		 * 2nd-We have to create a constructor of the class.(page factory constructor)
		 * 3rd- Create the methods according to the action have to perform on the each 
		 * elements.
		 * @ FindBy is shortcut to locate the element
		 */
		
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();*/


}
