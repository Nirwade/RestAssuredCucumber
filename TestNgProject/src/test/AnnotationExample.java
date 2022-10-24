package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("@Before method is used to execute the pre-requsite at every test cases");
	
	}
	
	@BeforeMethod(alwaysRun=true)
	public void BeforeAlwaysrun() {
		System.out.println("This is @Before method with always run, it gives results both before method and before group");
	
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("@BeforeTest is used to execute the pre-requsite before all the test cases; only once");
	}
	@Test
	public void test1() {
		
		System.out.println("This is test case 1 ");
	}
		
	
	@Test(priority=0)
	public void test6() {
		
		System.out.println("This is test case 6 ");
	}
	
	@Test(priority=1)
	public void test7() {
		
		System.out.println("This is test case 7 ");
	}
	
	@Test(priority=-1)
		public void test2() {
			
			System.out.println("Test 2; it take care of creating the main method at runtime, we can create n.. no of test cases inside same class");
	}		
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("@after method is used to execute the pre-requsite after every test case");	
	}
	
	@AfterTest
	public void AferTest() {
		System.out.println("@AfterTest is used to execute the pre-requsite before all the test cases; only once");
		
	}
}		


