package JavaPractice;

public class This {

	int x=100;
	public void method1() {
		int x=111;
		System.out.println(x);
		System.out.println(this.x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This t=new This();
		t.method1();
		System.out.println(t.x);
		
		
		
		
		
	}

}
