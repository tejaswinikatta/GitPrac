package stringsconcepts;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1=" Hi ALL good Morning ";
		String s2=" Hi ALL good Morning ";
		System.out.println(s1.length());
		System.out.println(s1.substring(0, 9));
		System.err.println(s1.charAt(1));
		System.out.println(s1.indexOf('0'));
		System.out.println(s1.indexOf("good"));
		System.out.println(s1.indexOf('0', 10));
		System.out.println(s1.indexOf("goodd"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.trim());
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.trim().length());
	
		/// spliting
		String date="20-04-2019";
		String doj[]=date.split("-");
		String day=doj[0];
		String mont=doj[1];
		String year=doj[2];
		System.out.println(day);
		System.out.println(mont);
		System.out.println(year);
		

	}

}
