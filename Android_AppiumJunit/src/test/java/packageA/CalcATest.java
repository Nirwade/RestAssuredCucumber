package packageA;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;  
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import junit.CalcTest;
import junit.framework.Assert;

public class CalcATest   { 
 AndroidDriver driver = CalcTest.driver;
	
 @DisplayName("Addition")
 @Test
 @Tag("Sanity")
	public  void add () {
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
	    driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	    
	    String actulres= driver.findElement(By.id("com.google.android.calculator:id/result_final")).getAttribute("text");
	    int ActualRes = Integer.parseInt(actulres);
	    int ExptRes = 14;
	    
	    Assert.assertEquals(ActualRes, ExptRes);
	
}
}
