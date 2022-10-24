package oPPsConCept;

class Pen {
	
	String color;  // these are attributes of pen
	String type; //gel, ballpoint
	
	public void writing() {  // functions which are defined inside the class we call it as methods
		
		System.out.println("Writing something");   // this is called blue print of a class pen
	}
	
	public void printColor() {
		
		System.out.println(this.color); // this keyword refers to current obj of a class
		                              //pass the current object as a parameter to another method 
		                       //refer to the current class instance variable

	}
	
	
	
class Student {
	
	String name;
	int age;
	
	public void printinfo() {
		
		System.out.println(this.name);
		System.out.println(this.age);
	}

}

public class ObjClassConcept {

	public static void main(String[] args) {
		
		
		Pen p1 = new Pen ();   // now we need to create obj of pen class to access the blue print
		 
		p1.color = "blue";  // these are called properties also Data
		p1.type = "gel";  // now from blue print we have created the pen 
		p1.writing();   // this is called members/methods 
		
		Pen p2 = new Pen();
		 p2.color = "black";
		 p2.type = "ballpoint";
		 p2.printColor();
		 p1.printColor();
		 
		 Student s1 = new Student();
		 s1.age = 26;
		 s1.name = "aman";
		 
		 s1.printinfo();

	}

}


