package JavaPractice;

public class WrapperClasses {

	public static void main(String[] args) {
		
		//// Wrapper classes (parsing technique) used to convert String value to primitive data types like int,float,double
		
		///String to Int
		
		String s="100";
		int i=Integer.parseInt(s);
		
		/// String to float
		
		float f=Float.parseFloat(s);
		System.out.println(f);
		
		String s1="True";
		boolean b=Boolean.parseBoolean(s1);
		System.out.println(b);
		
		double d=Double.parseDouble(s);
		System.out.println(d);
		
		//// Converting int to String
		///**** we cannot covert the string variable to charector 
		int j=25;
		
		String n=String.valueOf(j);
		System.out.println(n+i);
		
		
		
		

	}

}
