package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS );
		
		WebElement inputfield = driver.findElement(By.id("twotabsearchtextbox"));
		inputfield.sendKeys("Iphone 13");
		
		WebElement srch = driver.findElement(By.xpath("//input[@type='submit']"));
		srch.click();
		
		List<WebElement> phoneList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']|//span[@class='a-price-whole']"));  
 
		for(WebElement eln:phoneList) {
		System.out.println(" list of Iphones make&models and their prices >> "+eln.getText());
			
	}
		
		
    	driver.close();
	}
}
