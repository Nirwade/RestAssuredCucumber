package com.demoapi;

import static org.junit.Assert.*;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.swing.Action;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Assert;

public class DemoAPITest {
	
	static AndroidDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
		URL URl = new URL("http://localhost:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities ();
		capabilities.setCapability("plaftformName", "Android");
		capabilities.setCapability("plaftformVersion", "8.1.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");
		capabilities.setCapability("appPackage", "com.touchboarder.android.api.demos");
		
	         driver = new AndroidDriver(URl,capabilities);
		
		System.out.println(driver.getSessionId());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void scrollUp() {
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		
		int startX = (int) (0.5 * width);
		int startY = (int) (0.9 * height);
		
		int endX = startX;
		int endY = (int) (0.1 * height);
		
		TouchAction action = new TouchAction(driver);
		
		action
		.longPress(PointOption.point(startX, startY))
		.moveTo(PointOption.point(endX, endY))
		.release()
		.perform();
		
	}
	
	@Test
	public void FindandClickView(String ViewName) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
			boolean flgFound = false;
			
			while(!flgFound) {
		
		WebElement prntViews = driver.findElement(By.id("android:id/content"));
		List<WebElement> lstViews = prntViews.findElements(By.id("android:id/text1"));
		for (WebElement view : lstViews) {
			System.out.println(view.getAttribute("view"));
			if(view.getAttribute("text").equals(ViewName)) {
				flgFound = true;
				view.click();
				break;
			}
		}
		if(!flgFound) {
			scrollUp();
		}
				
			}
		
	System.out.println("Found the element");
	
	}

	@Test
	private void seekbar() {
		FindandClickView("seek bar");
		
		WebElement seekbar = driver.findElement(By.id(""));
		int StartX = seekbar.getLocation().getX();
		int StartY = seekbar.getLocation().getY();
		int Width = seekbar.getSize().getWidth();
		
		int x = StartX + (int) (Width*0.8);
		
		action
		.longPress(PointOption.point(x, StartY))
		.release()
		.perform();
		
		

		
	}


		
	
}
