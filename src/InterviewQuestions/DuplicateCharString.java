package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="tejaswinitejasi";
		HashMap<Character,Integer> hs=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			if(hs.get(ch)!=null) {
				
				hs.put(ch, hs.get(ch)+1);
			}
			
			else
			{System.out.println("addd");
				hs.put(ch,1);
			}
			
		}
		Iterator<Character> its=hs.keySet().iterator();
		while(its.hasNext()) {
			char t=its.next();
			if(hs.get(t)>1) {
				System.out.println(t+"------->"+hs.get(t));
			}
		}
		
		
		
		
		
		
	}

}
