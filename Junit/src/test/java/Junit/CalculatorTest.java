package Junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@DisplayName("CalAddition")              //@DisplayName: if we want to give custom name for the test case, we use this annotation
	@Test
	public void addTest1 () {
		
		  assertEquals(9, Calculator.add(4, 5));
		
		System.out.println("This is passed");
		
	}	
	
	    @DisplayName("CalSubraction")
	   // @Disabled                              //@Disabled: is used to skip/disable the test case for execution
		@Test
		public void subTest2() {
			
			assertEquals(10, Calculator.sub(20, 10));
			
			System.out.println("This is failed");
		}
		
	
		
	}


