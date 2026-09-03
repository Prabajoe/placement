package day32;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


public class Demo {


	public static void main(String[] args) {
		
		List<List<Integer>> list=Arrays.asList(
			 Arrays.asList(1,2),
			 Arrays.asList(3,4),
			 Arrays.asList(5,6)
			 );
	list.stream().flatMap(i->i.stream()).forEach(i -> System.out.println(i));
	System.out.println(" ");
	List<Integer> list1=Arrays.asList(7,4,0,3,5,2,1);
	list1.stream().sorted((a,b)->a.compareTo(b)).forEach(i->System.out.println(i));
	System.out.println("");
	List<Integer>list2=Arrays.asList(1,2,3,4);
	int sum=list2.stream().reduce(1,(a,b)->a*b);
	System.out.println(sum);
	System.out.println("");
	List<Integer> list3=Arrays.asList(7,4,0,3,5,2,1,3,0);
	list3.stream().distinct().forEach(i->System.out.println(i));
	System.out.println("");
	
	List<String> list4=Arrays.asList("Hari", "Kavi","Rovi","Jaga");
	list4.stream().filter(i -> i.endsWith("i")).forEach(i-> System.out.println(i));
		
	
			
			
			
			
			
			
			
			
		
	}

}
