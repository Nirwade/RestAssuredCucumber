package oPPsConCept;


class Student {
	
	String name;
	int age;
	
	public void stdinfo() {
		
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student() {        // non parameterized constructor
		
		System.out.println("Constructor called");
	}
	
	
	Student(String name, int age) {   // parameterized constructor
		
		this.name = name;
		this.age = age;
	}
	
	Student(Student s3) {   // copy constructor --> copying the info of s3 and placing inside current obj
		this.name = s3.name;
		this.age = s3.age;
	}
	
	Student(int age) {
		
		
	}
}

public class ConstructorsC {

	public static void main(String[] args) {
		
		Student s1= new Student();
		
		s1.age = 26;
		s1.name = "aman";
		s1.stdinfo();
		
		
		Student s2= new Student("aman",24);
		s2.stdinfo();
		
		Student s3 = new Student(s2);
		s3.stdinfo();
	} 

}
