package oPPsConCept;
                                                     //Static Keyword --> it is used which could be common for all the objects eg:
  class Studentss {  
	                                              //school name could be common for all the students, so we can make the school attribute as static
	  String name;                                 //here school becomes common for all objects(Students) and if any changes made in static attribute
	                                               //it will be applied for all the students
	static String school;
	
	public static void schoolchange() {
		
		school = "newschool";
	}
	                                              // Rules
	                                             //1.We can directly initialize static keyword with it's class name, no need to create an object for it
  }                                             //2.Static keyword allocates memory at one time, hence we will use for common elements/things
                                               //3.Static keyword can be used inside 1.variable(attributes)2.Method 3.Nested class (class inside class)4.Block

public class StaTicKeY {

	public static void main(String[] args) {
		
		Studentss s1 = new Studentss();
		s1.name = "aman";
		Studentss.school = "MVN";
		System.out.println(Studentss.school);
		
		
		

	}

}
