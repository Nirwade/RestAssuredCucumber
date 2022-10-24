package test2;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutAnnot3 {

	@BeforeGroups("sanity")
	public void BeforeGroup() {
		System.out.println("This is before Group for class 4");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("This is before mthod for class 4");
	}
	
	@Test(groups= {"sanity","regression"}, enabled=true)
	public void test4 () {
		System.out.println("This is class 4 from another package");
	}
	@Test(dependsOnMethods="test4")
	public void test5 () {
		System.out.println("This is class 5 from another package");
	}
	
	
}
