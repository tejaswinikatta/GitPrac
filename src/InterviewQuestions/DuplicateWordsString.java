package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateWordsString {

	public static void main(String[] args) {
	         HashMap<String, Integer> hs=new HashMap<String,Integer>();
			String s="i am am java java learning";
			String str[]=s.split(" ");
			
			for(String temp:str) {
				
				if(hs.get(temp)!=null) {
					hs.put(temp,hs.get(temp)+1);
				}
				else
				{
					hs.put(temp, 1);
				}
			

				}
	
	Iterator<String> it=hs.keySet().iterator();
			while(it.hasNext()) {
				String temp=it.next();
				if(hs.get(temp)>1) {
					System.out.println(temp+"------>"+hs.get(temp));
				}
			}
			
			
		
		 
		
		
		
		
		
		
		
		
		
		
		 
		}
		
		
	}


