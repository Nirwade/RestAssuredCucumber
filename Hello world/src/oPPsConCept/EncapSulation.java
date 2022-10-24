package oPPsConCept; 
                                 // Access Modifier: 1.Public 2.Protected 3.Private 4.Default
class Account  {           // PUBLIC: Can be access inside & outside of Class & inside & outside of Package
	                      //DEFAULT: It is accessible only within the package not outside of package
	public String name;  //PROTECTED: It is accessible within the package & outside of package only for sub package(child classes)                     
	int amount;         //PRIVATE: It is accessible within the same Class & no other class can access it
	protected String email;
	private String password;
	
	
	/* Since other classes cannot access the private data we use the Getters & Setters concept
	 * To access private data, we will use Getters & Setters method
	 * Getters are used to retrieve the private data
	 * Setters are used to set the value for private data.
	*/
	
	public String getpassword() {
		//setpassword(randamPass);
		return this.password;
		
	}
	
	public String setpassword(String pass) {
		return this.password = pass;
	}
		
	}



                              // Packages: is a collection of similar types of classes, interfaces and sub-packages to maintain the order.
                              // packages are of 2 types: 1. Built-in 2.User-defined
public class EncapSulation { //  eg: Built-in --> importing --> java.util.io

	public static void main(String[] args) {
		
     Account ac1 = new Account();
     
     ac1.name = "Apna college";
     ac1.amount = 50000;
     ac1.email ="apnacollege@gmail.com";
     ac1.setpassword("abcd");
     System.out.println(ac1.getpassword());
     
	}

}
