package stringsconcepts;

public class String_Lc_Up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="teja";
		String s2="chandu";
		String s3="tejachandu";
		String s4=s1.concat(s2);
		System.out.println(s3==s4);
		System.out.println(s4);
		String s5=s1.toLowerCase();
		System.out.println(s5==s1);
		System.out.println(s3.compareTo(s5));
		
		
		
		
	}

}
