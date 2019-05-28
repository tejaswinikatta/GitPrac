package stringsconcepts;

public class String_IMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String ("Hi Good Morning");
		String s2=new String ("Hi Good Morning");
		System.out.println(s1==s2); /// false
		String s3="Hi Good Morning";
		System.out.println(s3==s2);//false
		String s4="Hi Good Morning";
		System.out.println(s3==s4);//true
		String s5="Hi";
		String s6=s5+"Good Morning";
		System.out.println(s4==s6);
		String s7="Hi"+" Good Morning";
		System.out.println(s4==s7);//true
		final String s8="Hi";
		String s9=s8+" Good Morning";
		System.out.println(s9==s4);//true
		System.out.println(s6==s1);
		
		
		
		
		
		
	}

}
