package InterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hs=new HashMap<String,Integer>();
		int s[]= {10,20,30,10,20,-1,-1};

		
		Set<Integer> st=new HashSet<Integer>();
		for(Integer i:s) {
				
			if(st.add(i)==false) {
				
				System.out.println("duplicate value"+i);
				
			}
			else
			{
				st.add(i);
			}
			
		}
		
		
		
		
	}

}
