package stringsconcepts;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=123456;
		int rev=0;
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
}
		
System.out.println(rev);
		int num1=1245;
	////using String buffer
System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
