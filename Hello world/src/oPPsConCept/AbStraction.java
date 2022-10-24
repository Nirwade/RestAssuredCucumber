package oPPsConCept;   // Abstract is an idea/illusion which does not have any physical form
                         /* Abstraction - -> Hiding the unnecessary details & showing only the essential parts/functionalities to the user.
                          * We can achieve abstraction in 2 ways 1.Abstract class 2.Interfaces (Pure Abstraction)
                          */
abstract class Animal { 
	
Animal () {
	
	System.out.println("Parent/base class(Animal class) constructor");
}
	                                // Since we have inherited the properties of animal class inside horse and chicken classes
abstract public void walk();        // showing animal class to user will be unrequired, hence we can make the animal class as abstract 
	                                // as will not create obj of animal class coz we have horse and chicken classes
public void eat()   {               // We can even make properties(attributes) and functions of abstract class as Abstract
		                            // Here the walk function is imp in other classes but will be not used in animal class as it's not required
System.out.println("animal eats"); 
  
                                     // once we make the walk function as abstract, it's implementation is not required
                                    //coz that function will be inherited in other classes
}  
}

class Horse extends Animal {
	
  Horse() {
		
	System.out.println("Derived/child class(Horse class) constructor");
	
	}
	
	public void walk() {
		
		System.out.println("walks on 4 legs");
	}                                                 //Rules:
}                                                    //1.To declare a class as abstract, we should use abstract keyword
                                                    //2. in abstract class we can have non abstract methods as well eg: line-No:14
class Chicken extends Animal{                      //3.Cannot create an obj of abstract class
	                                              //4.Constructors chaining supported --> when we create an object of derived class then 1st Base class 
	public void walk() {                         // constructor will be called then derived constructor is called line-No:9,27
		                                        // 5.Final Class -Prevents inheritance but we can create an obj of final class
		                                        //6.Abstract class - supports inheritance but we cannot create an obj of abstract class
		                                       //7.Final Method - Prevents method overriding
		                                      //8. Abstract method - Supports method overriding
	System.out.println("walks on 2 legs");    //9.if a class contains an abstract method inside it, then the class must also be abstract.
	}
}

public class AbStraction {

public static void main(String[] args) {
	
	Horse h1 = new Horse();            // Note: if try to create the obj of abstract class we will get runtime error(when running the program)
	h1.walk();                        //  will not see error during the compile time(in the editor)
    h1.eat();      
   Animal Horse = new Horse();       // Note: But we can create an obj of abstract class using subclass and using that obj we can refer to subclass objects
   Horse.eat();
    
	}

}

