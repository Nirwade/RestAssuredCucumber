package packageB;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;  //
import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import junit.CalcTest;
import junit.framework.Assert;

public class CalcBTest {
	
	 AndroidDriver driver = CalcTest.driver;
	 

	@DisplayName("Multiplie")
	 @Test
	@Tag("Sanity")
	public  void multiple () {
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	    String actreval=	driver.findElement(By.id("com.google.android.calculator:id/result_final")).getAttribute("text");
	    
   int ActualVal=Integer.parseInt(actreval);
   int ExpectVal = 40;
   Assert.assertEquals(ExpectVal, ActualVal);
   
  
		
		
	}
	
	public void device() {
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		String AlRes = driver.findElement(By.id("com.google.android.calculator:id/symbolic")).getAttribute("text");
		float AlRes1=Integer.parseInt(AlRes);
		int ExptRes1 = 4/9;
		
		Assert.assertEquals(ExptRes1, AlRes1);

	}

}
