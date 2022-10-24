package oPPsConCept;

                                 // inheriting the properties of Base class(parent) into Derived(Child) class
class Shape {                   // We call it as inheritance, 
	                           // This is the example of SINGLE LEVEL inheritance
	String color; 
	                          // We will use the extends keyword 
	                         // inheritance promotes code reusability
	
	public void area() {
		
		System.out.println("Display area");
	}
	
}
                                       
class Triangle extends Shape {  //child object acquires all the properties 
	                           //and behaviors of its parent object automatically so that 
	                       // We can reuse the attributes and behaviors which are defined in other classes. 
public void area(int l, int h) {
	

	System.out.println(1/2*l*h);
	
}
}

class EqulilaterialTriangle extends Triangle { // This is an example of MULTILEVEL Inheritance
	                                          // where 'class Triangle extends shape' 
	                                        // & 'class EqulilaterialTriangle extends Triangle'
	public void area(int l,int h) {
		
		System.out.println(1/2*l*h);
	}
}

class Circle extends Shape {   // This is an example of HIERARCHICAL Inheritance
	                          //where class Triangle extends Shape & class Circle extends Shape
	public void area(int r) {
		
		System.out.println(3.14*r*r);
	}
}
public class IInheritance {

	public static void main(String[] args) {   //MULTIPLE Inheritance is not supported in java
		                                      // this concept is covered with interfaces
		Triangle t1 = new Triangle();
		t1.color = "blue";
		t1.area();
		oPPsConCept.Account accn = new oPPsConCept.Account();
		accn.name = "Customer1";
		System.out.println(accn.name);
	}

}
