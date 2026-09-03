package day27;

import java.util.LinkedList;

public class LinkDSA {

	public static void main(String[] args) {
	
		LinkedList<Object> l=new LinkedList<Object>();
	
		l.add("hello");
		l.add('K');
		l.add(1234);
		l.add(23333.444);
		
		
		l.set(0, 1);
		
	
		
		System.out.println(l.get(0));
		
		
		
		 for (Object obj : l) {
			  
			 System.out.println(obj);
			
		}
		
		
		
		
	}

}
