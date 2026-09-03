package day16;

import java.util.StringTokenizer;

public class NeedsOfString {

	public static void main(String[] args) {
	
		 String passWord="Admin123";
		        
		 String demo="Admin13";
		 
		 
		 String s=new String("hello");
         
		 System.out.println(System.identityHashCode(passWord));
		 System.out.println(System.identityHashCode(demo));
		 
         
//         System.out.println(s);
		 
		 StringBuffer sb=new StringBuffer("hello");
		 
		 System.out.println(sb.capacity());
		 
		 System.out.println(sb.reverse());
		 
//		 sb.append("world");
		 
		 System.out.println(sb);
		 
		 
		 StringBuilder sb1=new StringBuilder("java");
		 
		 System.out.println(sb1);
		 
		 StringTokenizer st=new StringTokenizer("hi hello-everyone","-");
		 
		 
		 while(st.hasMoreTokens()) {
			 
			 System.out.println(st.nextToken());
			 
		 }
		 
		 
		 
		 
		 
		 
		    
		  
		 
         
    
	}

}
