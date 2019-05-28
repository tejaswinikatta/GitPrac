package JavaPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_1
{

	public static void main(String[] args) {
		Employee e1=new Employee("Teja", 20, "QA");
		Employee e2=new Employee("Chandu", 30, "DEV");
		Employee e3=new Employee("Sumathi", 10, "Pega");
		// TODO Auto-generated method stub

		LinkedList<Employee> e=new LinkedList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		Iterator<Employee>it=e.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.eno);
			System.out.println(emp.ename);
			System.out.println(emp.dept);
			
		}
		
		LinkedList<String> s=new LinkedList<String>();
		s.add("teja");
		s.add("chandu");
		s.add("lakshmi");
		s.add("venkatadri");
		/// Retriving the data from linked list
		System.out.println("****************");
		/// For loop
		
		for(int i=0;i<s.size();i++) {
		System.out.println(s.get(i));
		
		}
		
		
		//// Advanced for loop
		System.out.println("**************");
		for(String d:s) {
		
		System.out.println(d);
		}
		
		/// Iterator
		System.out.println("********************");
		Iterator<String> it1 =s.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		int num=0;
		System.out.println("*********************");
		while(num<s.size()) {
			System.out.println(s.get(num));
			num++;
		}
		
		
		s.addFirst("Kanuri");
		s.addLast("DEV");
		System.out.println(s);
		
		s.removeFirst();
		s.removeLast();
		System.out.println(s);
		
		
		
		}
		}
		
		
		
		
		
		
	


