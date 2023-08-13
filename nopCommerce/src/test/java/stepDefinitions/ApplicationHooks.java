package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.factory.DriverFactory;

import io.cucumber.java.*;


public class ApplicationHooks 
{
	public WebDriver driver;
	public DriverFactory obj;
	
	@Before(order=0)
	public void launchBrowser()
	{
	    obj= new DriverFactory();
		driver=obj.setUp();
	}
	
	@After(order=0)
	public void closeBrowser() {
		obj.quitBrowser();
	}
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			 // take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	

	}
}
