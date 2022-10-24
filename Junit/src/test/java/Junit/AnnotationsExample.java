package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsExample {
	
@BeforeAll	
public static void method3() {
		
		System.out.println("this is BeforeAll, it executes once before all test cases are excuted");
	}
	
	
	@BeforeEach
	public void method1() {
		
		System.out.println("this is BeforeEach, it executes before each test");
	}
	
	
	@Test
	public void addTest1 () {
		
		  assertEquals(27, Calculator.add(20, 7));
		  assertTrue(true);
		
		System.out.println("This is Test case-1");
		

}
	
   @Test
	public void subTest1 () {
		
		  assertEquals(13, Calculator.sub(20, 7));
		
		System.out.println("This is Test case-2");
	}
   
   @Test
   public void arrayTest1 () {
	   
	      String[] array1= {"Red", "Blue", "Purple"};
		  String[] array2= {"Red", "Blue", "Purple"};
		  
		  assertArrayEquals(array1, array2);
		  assertTrue(true);
		  
		  System.out.println("Result "); 
   }
	
@AfterEach
public void method2() {
		
		System.out.println("this is AfterEach, it executes after each test");
		
	}
@AfterAll
public static void method4() {
	
	System.out.println("this is AfterAll, it executes once after all test cases are excuted");
}
	
	
}