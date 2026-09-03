package day31;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
	

	public static void main(String[] args) {
	
		
		List<String> name= Arrays.asList("kavi","rovina","hari","jagadesh","kalai");
			
//		for (String names : name) {
//			if(names.startsWith("k")) {	
//				System.out.println(names);
//			}	
//		}
//     element in list
//		using method Arrays.aslist
		List<String> names=name.stream().filter(i->i.startsWith("k")).collect(Collectors.toList());
		 System.out.println(names);
		       
		 
//		 element in array
//		 using Arrays.stream method
		 int []	arr= {1,2,3,4,5};
		 IntStream nums=Arrays.stream(arr);
		System.out.println(nums.count());
		 
//		 indivdual elements
//		 using streamof method
		 Stream<String> demo=Stream.of("apple","orange","banana");
		 demo.forEach(System.out::println);
		
//      generate element
//		 using generate method
		 Stream<String> hn=Stream.generate(()->"hello").limit(5);
		 hn.forEach(System.out::println);

//       iterate element
//		 using iterate method
		 
		 Stream <Integer> val=Stream.iterate(1,i->i+1).limit(3);
		 val.forEach(System.out::println);
		 
		 
	 
		 
	}

}
