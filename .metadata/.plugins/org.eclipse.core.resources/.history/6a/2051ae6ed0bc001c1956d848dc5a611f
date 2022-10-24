package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");    

		//Maximize window
		driver.manage().window().maximize();

		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement searchstring =driver.findElement(By.xpath("//Input[@id='twotabsearchtextbox']"));
		searchstring.sendKeys("iphone 12");
		
		WebElement searchclick =driver.findElement(By.xpath("//Input[@id='nav-search-submit-button']"));
		searchclick.click();
		
				
		List<WebElement> data= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(data.size());

		List<WebElement> prices= driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for( WebElement el: data){
			
			System.out.println(el.getText());
		}
		
			for( WebElement e2: prices) {
				System.out.println(	"Phone lists and prices are ...." +((WebElement) e2).getText());
	
		}
			
			for(int i=0 ;i<data.size();i++)
			{
				System.out.println(""+data.get(i).getText() +  "... it's price is...> "  + prices.get(i).getText());
			}
			//driver.close();

	        }
	}
