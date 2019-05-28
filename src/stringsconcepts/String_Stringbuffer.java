package stringsconcepts;

public class String_Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("teja");//once the string is created no changes can be done
System.out.println(s.hashCode());
s=s.concat("aswini"); //// another object will be created in the object
System.out.println(s.hashCode());

System.out.println(s);

/////////// String Buffer is a mutable method and we can made the chnages
StringBuffer sb=new StringBuffer("Teja");
sb.append("aswini");
System.out.println(sb);
		
		
		
		
		
		
		
		
	}

}
