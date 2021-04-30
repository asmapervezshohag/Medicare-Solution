package praticePackageforTestNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ThirdWeekSelenium.Utility;

public class liPractice extends Utility implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver=((Utility)result.getInstance()).driver;
		 Date dt = new Date();
				System.out.println(dt);
				String si = dt.toString().replace(" ", "_").replace(":", "_");
				System.out.println(si);
				File shotofscreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		try{FileHandler.copy(shotofscreen,
						new File("C:\\Users\\asma_\\eclipse-workspace\\automation\\pictures\\passed\\" + si + "photo.png"));
			} catch(IOException e){
			e.printStackTrace();
			}
			}

	

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver=((Utility)result.getInstance()).driver;
		  Date dt = new Date();
				System.out.println(dt);
				String si = dt.toString().replace(" ", "_").replace(":", "_");
				System.out.println(si);
				File shotofscreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
		try{
			FileHandler.copy(shotofscreen,
						new File("C:\\Users\\asma_\\eclipse-workspace\\automation\\pictures\\failed\\" + si + "photo.png"));
			} catch(IOException e){
			e.printStackTrace();
			}
			}

	}


