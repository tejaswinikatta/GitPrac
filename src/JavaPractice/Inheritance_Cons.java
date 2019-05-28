package JavaPractice;

class A{
	A(){
		System.out.println("hi... i am A() constructor");
	}
	
	A(int x)
	{
		System.out.println("hiii i am parameteraised constructor of a"+x);
	}
}

class B extends A{
	B(){
		
		System.out.println("i am b class default costructr");
	}
	B(int y){
	super(y);
	System.out.println("i am b parameteraized contructor"+y);
	}
}


public class Inheritance_Cons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b=new B();
		B b1=new B(20);
		
		
		
		
		
	}

}
