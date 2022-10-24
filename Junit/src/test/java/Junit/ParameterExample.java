package Junit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterExample {
	
	
    @ParameterizedTest                                                 // it allows us to pass parameters
    
    @ValueSource(strings = {"radar", "madam", "ABCCBA", "radar"})    // in which we will provide sources values 
                                                                    // as many parameters we give here, those many will be executed
	public void ParaTest1 (String name) {
		
		assertTrue(StringFunction.isPalindrome(name));
		
    	System.out.println(" These are valid palindrome names === " + name);

	}
    
    
	@ParameterizedTest
	@ValueSource(ints= {12,4,6,8,10})                             // it allows us to pass parameters using integer values
    public void ParaTest2 (int num) {                         
    	
    	
    	assertTrue(num%2 ==0);
    	System.out.println(" These are valid even numbers === " + num);
    	
    }
    	
	@ParameterizedTest
	@EnumSource(Month.class)                             // it allows us to pass parameters for month values
	public void ParaTest3(Month month) {                //Enumeration: in addition to textual value it also contains integer values
		                                               // and prints those series of values one by one eg: months
		
		                                              // Enumsource coming from Enumeration class which contains a month class
		
	int MonthVal = month.getValue();
	System.out.println("This are months === " + MonthVal);
	
	assertTrue(MonthVal<=12);
		
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names= {"APRIL", "JUNE", "SEPTEMBER" ,"NOVEMBER"})  //another example of enumeration test
	public void ParaTest4(Month month) {
		
		assertEquals(30,month.length(false));                                          //logic to get months with 30 days       
		System.out.println("These are 30 months " + month);
	}
	
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names= {"February"})                  //another example of enumeration test
	public void ParaTest5(Month month) {
		
		
		assertEquals(28,month.length(false)) ;  
		assertEquals(29, month.length(true));

                                                                   //logic to get month with 29 days       
		System.out.println("These are  months " + month);
	}
	
	
	
	@ParameterizedTest
	@MethodSource("DPMethod")                                        //@methodsource annotation is used to fetch data from method
	                                                                 //here we need to give the method name along side the @methodsource
    public void ParaTest6 (String name) {
		                                                            // here test6 will fetch all of the data present in DPmethod 
		                                                            // and execute in its test6 function
		assertTrue(StringFunction.isPalindrome(name));
	}
	
	
	public static Stream<String> DPMethod () {                     // it should be static method, if it's not static 
		                                                           //the test can't get the data

		
		return Stream.of("mom", "dad" );
	}
}
