package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RepeatedTestExample {
	
	 @RepeatedTest(4)             //repeatedly executes the test case 4 times based on the given number
	 public void repeat1 () {
		
		 assertEquals(29, Calculator.sub(40, 11));
		
		System.out.println("This is Test case-2 for repeated example, it excutes multipletimes");
	}

}
