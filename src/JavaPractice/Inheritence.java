package JavaPractice;

public class Inheritence  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b=new BMW();
		b.start(); /// Overriding
		b.details();
		b.stop();
		b.threatSafty();
		System.out.println("__________________");
		/// Top Type casting::: child object is assigned to parent object reference variable
		 Car c=new BMW();
		 c.start();
		 c.stop();
		 c.details();
		 /// c.threatSafty();---- we can access only the common methods and parent methods cannot access methods in child class
		 
		 //// down casting 
		 
		 BMW b1=(BMW) new Car();/// it will throw error when try to call
		 b1.details();// throw Exception "Class Cast Exception "
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
