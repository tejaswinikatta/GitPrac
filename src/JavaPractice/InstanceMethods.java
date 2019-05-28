package JavaPractice;

public class InstanceMethods {
	public static int l=5;
	public void method1()

	{
		System.out.println("Hello World");
	}
	public int addition() {
		int a=10;
		int b=20;
		int c=a+b+l;
		return c;
	}
	
	public String Qa() 
	{
		String sname="Selenium";
		
		return sname;
	}
	
	public double division() {
		
		int x=10;
		int y=5;
		  double z=x/y;
		return z;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceMethods i=new InstanceMethods();
		
		System.out.println(i.addition());
		System.out.println(i.division());
		System.out.println(i.Qa());
		
		
		
		
		
		
	}

}
