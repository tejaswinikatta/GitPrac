package stringsconcepts;

public class NormalEqual_EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Teja";
		String s2=new String("Teja");
		System.out.println(s1==s2); //it will compare base on the adress and references
		System.out.println(s1.equals(s2)); // in strings the equals method was over rided and it will comare the data
		 
		StringBuffer sb1=new StringBuffer("Teja");
		StringBuffer sb2=new StringBuffer("Teja");
		System.out.println("String buffer =="+(sb1==sb2));
		System.out.println("String equals method"+sb1.equals(sb2));//this method was noth ooverridded in String buffer so in this equal method is ment for address comparision
		
		
		
		
		
		
		
		
	}

}
