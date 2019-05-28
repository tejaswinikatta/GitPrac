package JavaPractice;

public class CallByValue_CallByRef {
	
	int x;
	int y;
	int a;
	int b;
	
	//// Call by value
	
	public void method1(int a,int b) {
		 a=300;
		 b=400;
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println("****************");
		
	}
	public void  swap(CallByValue_CallByRef t) {
		int temp;
		temp=t.x;
		t.x=t.y;
		t.y=temp;
		System.out.println(x);
		System.out.println(y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValue_CallByRef c=new CallByValue_CallByRef();
		int a=10;
		int b=20;
		c.method1(a, b);// Call by value
		System.out.println(a);
		System.out.println(b);
		System.out.println("***********************");
		
		c.x=100;
		c.y=200;
		c.swap(c);//// call by reference
	}

}
