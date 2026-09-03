package day34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultiComparator implements Comparator<Student2> {
	
	@Override
	public int compare(Student2 s1, Student2 s2) {
		
		if(s1.age<s2.age) {
			return -1;
		}else if(s1.age>s2.age) {
			return 1;
		}else {
			
		if(s1.name.compareTo(s2.name)< 0){
			return -1;
		}else if(s2.name.compareTo(s1.name)>0) {
			return 1;
		}else {
			  return 0;
		}
				
       
			
		}
			
		
		
	}

	public static void main(String[] args) {
		

		 List<Student2> list=new ArrayList<>();
		 
		 list.add(new Student2(4,"hari",20));
		 list.add(new Student2(2,"kavi",20));
		 list.add(new Student2(1,"rovina",19));
		 list.add(new Student2(3,"jagadesh",19));
		 
		 
		 Collections.sort(list, new MultiComparator());
		 
		 
		 for (Student2 s : list) {
			 
			 
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		 
		 

	}

}
