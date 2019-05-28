package JavaPractice;

public class Countructors_this {
	Countructors_this(){
		System.out.println("Hi it is defauls constructor");
	}
	Countructors_this(int x){
		this();
		System.out.println(x);
	}
	Countructors_this(int x,int y){
		
		this(x);
	System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Countructors_this t=new Countructors_this();
		//Countructors_this t1=new Countructors_this(20);
		Countructors_this t2=new Countructors_this(10,5);
		
		
		
		
		
		
		
		
	}

}
