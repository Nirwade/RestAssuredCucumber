package com.calc;

import static org.junit.Assert.*;

import java.net.URL;
import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class Cal11Test {
	
	static AndroidDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
		URL URl = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities ();
		capabilities.setCapability("plaftformName", "Android");
		capabilities.setCapability("plaftformVersion", "8.1.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		
	         driver = new AndroidDriver(URl,capabilities);
		
		System.out.println(driver.getSessionId());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void addtest() {
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
	    driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	    
	    String actulres= driver.findElement(By.id("com.google.android.calculator:id/result_final")).getAttribute("text");
	    int ActualRes = Integer.parseInt(actulres);
	    System.out.println(" This is actual res --> "  +  ActualRes );
	     int exptresults = 14;
	     Assert.assertEquals(exptresults, ActualRes);
	   
		
		
	}

	public void multitest() {
		
		 driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
	     driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
	     driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
	     driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	     
	    String actulres1 = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getAttribute("text");
	  int ActualRes1 = Integer.parseInt(actulres1);
	  System.out.println(" This is actual res  --> "  +  ActualRes1 );
	  int exptresults1 = 13;
	
		
	}
	
}
