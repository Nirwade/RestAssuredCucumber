package Junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;


public class StringFunctionTest {
	
	
	@Tag("Sanity")                          // @Tag: using this we can tag a series/group of test cases with some custom name
	@Test                                   // so whenever running test cases using runner class, we can list-out the test execution using tag names
	public void Testcase1True () {
		
		assertTrue(StringFunction.isPalindrome("madam"));
		
		assertTrue(StringFunction.isPalindrome("racecar"));
		System.out.println("This is palindrome");
		
	}
	
	@CustomAnnotation                                           // @CustomAnnotation:This annotation is created inside custom annotation class
	   public void Testcase1False () {                          // instead of using @Test,@Tag we can customize of our annotation
		assertFalse(StringFunction.isPalindrome("shashi"));
		System.out.println("String should be palindrome");
	}

}
