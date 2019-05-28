package JavaPractice;

import java.util.ArrayList;

public class ArrayList_Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("chandu");
		ar.add('C');
		ar.add(12.8);
		System.out.println("Size::::::::::"+ar.size());
		ar.add(200);
		ar.add('B');
		System.out.println("Size::::::::::"+ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	ArrayList<Integer> ar1=new ArrayList<>();
	ar1.add(100);
	ar1.add(0, 555);
	
		System.out.println(ar1.get(0));
		
		
		ArrayList<String> s=new ArrayList<>();
		s.add("Teja");
		System.out.println(s.get(0));
		
		
		
		
		
		
		
	}

}
