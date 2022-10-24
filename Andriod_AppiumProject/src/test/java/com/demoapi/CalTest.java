package com.demoapi;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class CalTest {
	
	
	public static void main (String[] args) throws MalformedURLException  {
	
	// set the desired capabilities along with URL and Driver setup
		
		URL URl = new URL("http://localhost:4723/wd/hub");
	DesiredCapabilities capabilities = new DesiredCapabilities ();
	capabilities.setCapability("plaftformName", "Android");
	capabilities.setCapability("plaftformVersion", "8.1.0");
	capabilities.setCapability("deviceName", "emulator-5554");
	capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	capabilities.setCapability("appPackage", "com.google.android.calculator");
	
        AndroidDriver driver = new AndroidDriver(URl,capabilities);
	
	System.out.println(driver.getSessionId());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
	driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
    driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
    
    String actulres= driver.findElement(By.id("com.google.android.calculator:id/result_final")).getAttribute("text");
    int ActualRes = Integer.parseInt(actulres);
    System.out.println(" This is actual res --> "  +  ActualRes );
     int exptresults = 14;
     
     
     driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
     driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
     driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
     driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
     
    String actulres1 = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getAttribute("text");
  int ActualRes1 = Integer.parseInt(actulres1);
  System.out.println(" This is actual res  --> "  +  ActualRes1 );
  int exptresults1 = 13;
    
    
    /*    try {
        	for(int i =0; i<30; i++)
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}  
	
	*/


	
	
	
	
	
	
	 
	}
}
