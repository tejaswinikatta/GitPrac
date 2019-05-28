package stringsconcepts;

public class RemoveSpecialCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hi #&^$@*&&* All";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);		
		System.out.println(s.replace('H', 'h'));
		
		
		//// coverting primitive type to string
		int x=99;
		System.out.println(String.valueOf(x));
		byte y=98;
		System.out.println(String.valueOf(y));
		char ch='a';
		System.out.println(String.valueOf(ch));
		
		
	}

}
