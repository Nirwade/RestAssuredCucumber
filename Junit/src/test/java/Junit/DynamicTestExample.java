package Junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExample {
	
	@TestFactory                                                //using @@TestFactory annotation we can create multiple tests 
	public List<DynamicTest> Method1(){                         // using single method at runtime, we will be creating a factory of test                    
		                                                        //()-> using lamda expression; we are write function without giving the name of the function
		return Arrays.asList(                               
				                                                //dynamicTest method has a class called DynamicTest; which generate test at runtimr
			
				DynamicTest.dynamicTest("NegitiveTest", ()->assertTrue(StringFunction.isPalindrome("mom"))),
				DynamicTest.dynamicTest("PostiveTest", ()->	assertTrue(StringFunction.isPalindrome("dad"))));

			
			
		}
		
	}


