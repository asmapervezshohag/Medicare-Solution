package ThirdWeekSelenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Utility {
	public WebDriver driver;
@Parameters({"browser","Website"})
 @BeforeClass
public void browsers(String browser,String sites) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(sites);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(sites);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\msedgedriver.exe");
			driver = new EdgeDriver();

			driver.get(sites);
			driver.manage().window().maximize();
		}
}
		@AfterClass
		public void endclass() {
			 driver.close();
		}

	
}

