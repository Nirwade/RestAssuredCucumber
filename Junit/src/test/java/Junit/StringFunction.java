package Junit;

import org.junit.jupiter.api.Test;

public class StringFunction {
	
	//madam
	
	public static boolean isPalindrome(String str) {  // making it as static, so we can call this function via class itself
		
		
		int start = 0;
		int end = str.length()-1;
				
		while (start<end ) {
			
           if 	(str.charAt(start) != str.charAt(end)) {
        		   return false;		   
        		   
		} else 
           
			start++;
			end--;
			
		} 
		 return true;
		
	} 

	
	/*public void Palindrome2 (String str) {
	 * 
	 
	 
	String rev = "";
	String i = str.length();
	
		
		for (int i=(i-1); i>=0; --i) {
			rev = rev + str.CharAt(i)
			
			}
			
			if(str.toLowerCase().equalsstr.toLowerCase()){
			return true;
}else{
return false;
			 
		}
		
		for (int i1=0; i1<str.length()-1; i1--) {
			System.out.println("value2"+i1);
			
			
				
			
			
		}
		
		if (i=!i1) {
			
		}
		
	}*/
}
