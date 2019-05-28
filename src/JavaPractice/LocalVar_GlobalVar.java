package JavaPractice;

public class LocalVar_GlobalVar {
	
	int i=10;//Global variable
	
	public int menthod1() {
		int j=20;/// local variables
		int i=5;
		int k=i+j;
		System.out.println(i);
		return k;
	}

	public void med() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to access global variables variable in side main methos  we should create object for class

		LocalVar_GlobalVar l=new LocalVar_GlobalVar();
		System.out.println(l.i);
		l.med();
		System.out.println(l.menthod1());
		
		
		
		
		
	}

}
