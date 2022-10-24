package oPPsConCept;

class Student1 {
	
	String name;
	int age;
	
	
	public void stdinfo(String name) {                // This is an example of methodoverloading, creating different methods with same name
		                                              // inside one class and they are used for different purposes
		System.out.println(name);                     // We have few Rules for Creating Methodoverloading 
	}	                                              // Either the return type should be different 
	                                                  // Or parameters type should be different
	public void stdinfo(int age) {                    // Either the argument type should be different
	                                            // Otherwise it will show compilation error, that's why we call it as compile time polymorphism
		System.out.println(age);                // error will show in the editor when creating methodoverloading
		}
		
	public void stdinfo(String name, int age) {
			
		System.out.println(name + " " + age);
		}
		
		
	}
	







public class PolyMorphisms {                  // ability to present the same interface in more then one form
                                             // 1. Compile Time Polymorphism (Static) 
	                                        //2. Runtime Polymorphism (Dynamic) 
	public static void main(String[] args) {
		
		Student1 s1 = new Student1 ();              /*  Compile Time Polymorphism-->The polymorphism which is implemented at the compile time is known as compile-time polymorphism.
		                                           *  Example - Method Overloading    
                                                   */  
		s1.age= 27;
		s1.name = "aman";
		s1.stdinfo(24);
		s1.stdinfo("aman", 27);
	}

}
