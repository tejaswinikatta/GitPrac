package stringsconcepts;

public class ReverseofString {
int j=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//using for loop		
		String s="Tejaswini";
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
		rev=rev+s.charAt(i);			
		}
		System.out.println(rev);
	



//// using String bufferclass
StringBuffer sb=new StringBuffer(s);
System.out.println(sb.reverse());
			
	
	
	}
	
}