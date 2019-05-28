package JavaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Arraylist
		ArrayList ar=new ArrayList<>();
		ar.add(10);
		ar.add("Teja");
		ar.add(20);
		ar.add(30);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
	
	//// generic Array list--- we can define which type of values we need to allow to store into array list
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
			
		}
		System.out.println("**************************");
		Iterator<Integer> it1=ar1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		///Generic--String Array List
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Teja");
		ar2.add("Katta");
		ar2.add("Chandu");
		ar2.add("Kanuri");
		for(int i=0;i<ar2.size();i++) {
			System.out.println(ar2.get(i));
			
		}
		System.out.println("__________________");
		
	
		///// Userdefined objects as generic type
		Employee e1=new Employee("Teja", 20, "QA");
		Employee e2=new Employee("Chandu", 30, "DEV");
		Employee e3=new Employee("Sumathi", 10, "Pega");
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
	ar3.add(e1);
	ar3.add(e2);
	ar3.add(e3);
	Iterator<Employee> it=ar3.iterator();
	while(it.hasNext()) {
		Employee emp=it.next();
		System.out.println(emp.eno);
		System.out.println(emp.ename);
		System.out.println(emp.dept);
		
	}
	
	///// Add all
	
	ArrayList<String> ar4=new ArrayList<String>();
	ar4.add("Teja");
	ar4.add("Katta");
	ar4.add("Chandu");
	ar4.add("Kanuri");
	
	ArrayList<String> ar5=new ArrayList<String>();
	ar5.add("Teja");
	ar5.add("Chandu");
	ar5.add("sumathi");
	ar5.add("Prasana");
	//to add the elemnet present in ar5 to ar4
	ar4.addAll(ar5);
	System.out.println("********************");
	for(int i=0;i<ar4.size();i++) {
		System.out.println(ar4.get(i));
		
	}
	System.out.println("********************");
	//retail All --To get the common elements present between ar4 along with ar5
	
	ar4.retainAll(ar5);
	for(int i=0;i<ar4.size();i++) {
		System.out.println(ar4.get(i));
		
	}
	}

}
