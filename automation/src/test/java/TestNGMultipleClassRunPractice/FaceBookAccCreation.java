package TestNGMultipleClassRunPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBookAccCreation {
	static WebDriver driver;

  @Test
  public void f() throws InterruptedException {
			
			
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\asma_\\eclipse-workspace\\automation\\Chromedriver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				WebElement CreateAC= driver.findElement(By.linkText("Create New Account"));
				CreateAC.click();
				Thread.sleep(6000);
				WebElement name = driver.findElement(By.name("firstname"));
				name.sendKeys("Joga");
				WebElement laname = driver.findElement(By.name("lastname"));
				laname.sendKeys("moga");
				WebElement PN = driver.findElement(By.name("reg_email__"));
				PN.sendKeys("12734928");
				WebElement Passw = driver.findElement(By.name("reg_passwd__"));
				 Passw.sendKeys("12799009");
				WebElement months= driver.findElement(By.name("birthday_month"));
				Select obj=new Select(months);
				obj.selectByIndex(1);
				obj.selectByValue("8");
				obj.selectByVisibleText("Dec");
				WebElement days= driver.findElement(By.name("birthday_day"));
				Select ob=new Select(days);
				ob.selectByIndex(10);
				ob.selectByValue("28");
				//obj.selectByVisibleText("t");
				WebElement year= driver.findElement(By.name("birthday_year"));
				Select objj=new Select(year);
				objj.selectByIndex(21);
				objj.selectByValue("1998");
				WebElement genders = driver.findElement(By.xpath("//input[@type='radio'][1]"));
				genders.click();
				
				WebElement signup=driver.findElement(By.name("websubmit"));
				signup.click();
				driver.close();
			}

		
  }

