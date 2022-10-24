package Junit;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssumptionExample {
	
	
	@BeforeAll
	public static void SetUp() {
		
		System.setProperty("Env", "false");  //if the condition satisfies then only then test will be executed
	}                                        // if fails the test will be skipped

@Test	
public void SetUPTest () {
	
	assumeTrue("Dev".equals(System.getProperty("Env")));  //assume true is the annotation used for this logic
	                                                      // similarly we have assume false, it performs action opposite of assume true
		
		assertTrue(StringFunction.isPalindrome("madam"));
		assertTrue(StringFunction.isPalindrome("racecar"));
}

}