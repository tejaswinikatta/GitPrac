package JavaPractice;

public class StaticAndNonStatic {
	///Global Variable
	String name="chandu";
	static int age=23;
	
	///Non-Static Method
	
	public void nonStatic() {
		System.out.println("Hi i am non Static Method");
		System.out.println(age);//Non-Static method can acess both static and non Static variables
		System.out.println(name);
	}
	public  static void staticmethod() {
		System.out.println("hi i am static methos");
		System.out.println(age);///Static methods can access only static variables
		
	}

	public static void main(String[] args) {
		
		/// calling static methods
		//1 direct calling
		staticmethod();
		//2 By using class name
		StaticAndNonStatic.staticmethod();
		///// Calling Non Static methods
		//Need to create object for the class and by using reference variable we can call
		StaticAndNonStatic s=new StaticAndNonStatic();
		s.nonStatic();
		////Calling Static local variables
		//direct calling
		System.out.println(age);
		// By using class name
		System.out.println(StaticAndNonStatic.age);
		////Non Static Variables
		//By creating the object
		System.out.println(s.name);
		//// can we call static method by using object reference ?---- we can call but it will show the warning static methods should be call in a static way and it was not agood practice
		
			
		
		
		
		

	}

}
