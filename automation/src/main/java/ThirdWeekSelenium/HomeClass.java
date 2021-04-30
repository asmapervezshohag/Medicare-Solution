package ThirdWeekSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeClass {
	WebDriver driver;
@FindBy (id="twotabsearchtextbox")WebElement search;
@FindBy(xpath ="//input[@type='submit']") WebElement searchicon;
@FindBy(linkText="Customer Service")WebElement Customer;
@FindBy(xpath="//*[@class='a-color-state a-text-bold']")WebElement mycomputer;



public HomeClass (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void searchfield() {
	search.sendKeys("computer");
}
public void searchIconClick() {
	searchicon.click();
}

public void CustomerServiceClick() {
	Customer.click();	
}
public String mysearch() {
	String textfordress = mycomputer.getText();
	return textfordress;
}
}
