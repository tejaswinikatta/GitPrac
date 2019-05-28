package JavaPractice;

public class Class_Object {

	int mod;
	int wheel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /// object is Class_Object()
		/// a,b,c is object reference variable
		
		Class_Object a=new Class_Object();
		Class_Object b=new Class_Object();
		Class_Object c=new Class_Object();
		
		a.mod=2014;
		a.wheel=4;
		
		b.mod=2015;
		b.wheel=2;
		
		c.mod=2016;
		c.wheel=4;
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		
		a=b;
		b=c;
		c=a;
		
		// a will be move to obect b and c will move to where the a object available
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		
	}

}
