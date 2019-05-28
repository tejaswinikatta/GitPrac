package JavaPractice;

public class MethodOverLoading {
	
	public void sum() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void sum(int x) {
		System.out.println(x);
	}
public void sum(int x,int y) {
	
		System.out.println(x+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading m=new MethodOverLoading();
		m.sum();
		m.sum(1);
		m.sum(5,6);
		
		
		
	}

}
