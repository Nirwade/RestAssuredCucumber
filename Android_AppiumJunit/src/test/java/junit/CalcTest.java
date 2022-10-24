package junit;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import packageA.CalcATest;

public class CalcTest  {
	
	public static AndroidDriver driver; 
	
	@Tag("Sanity")
	@BeforeAll
	
	public static void setUp () throws MalformedURLException {
		
		URL URL = new URL("http://localhost/wd/hub");
		
		DesiredCapabilities capabilities = new DesiredCapabilities ();
		
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("deviceName","emulator-5554");
		capabilities.setCapability("appPackage","com.google.android.calculator");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		capabilities.setCapability("platformVersion","8.1.0");
		
		driver= new AndroidDriver(URL, capabilities);
		System.out.println(driver.getSessionId());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	
		
		
		
	}
	
	
}

