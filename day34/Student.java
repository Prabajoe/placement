package day34;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	
	
	int id;
	String name;
	int age;
	
	
	public Student(int id , String name ,int age) {
		
		this.id=id;
		this.name=name;
		this.age=age;
		
	}

	@Override
	public int compareTo(Student s) {
          
		if(this.id <s.id) {
			return 1;
		}else if(this.id>s.id){
			return -1;
		}else {
			return 0;
		}
		
	}
	
public static void main(String[] args) {
	
	 List<Student> list=new ArrayList<>();
	 
	 list.add(new Student(4,"hari",22));
	 list.add(new Student(2,"kavi",20));
	 list.add(new Student(1,"rovina",19));
	 list.add(new Student(3,"jagadesh",21));
	 
	 
	 Collections.sort(list);
	 
	 for (Student s : list) {
		 
		 System.out.println(s.id+" "+s.name+" "+s.age);
		
	}
	 
	 
	
}
	
     
		
	}

