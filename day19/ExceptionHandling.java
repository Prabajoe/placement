package day19;

import java.util.Scanner;

public class ExceptionHandling {
	
	int a;
	int b;
	int c;
	
	
	int arr[]= {1,2,3,4,5};
	
	String s=null;
	

	  
	
	public void display() {
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value");
			int a=sc.nextInt();
			
			b=0;
			
			c=a/b;
			
			System.out.println(c);
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		System.out.println("program ended");
		
	}
	
	
	
	
//	public void display2() {
//		
//		try {
//			System.out.println(arr[7]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		
//		System.out.println("program ended 2");
//		
//	}
//	
//	public void display3() {
//		
//		try {
//			System.out.println(s.length());
//			
//		}catch(Exception e) {
//			
//			System.out.println(e);
//			
//		}
//		
//		System.out.println("program ended 3");
//	}

	public static void main(String[] args) {
		
		ExceptionHandling ex=new ExceptionHandling();
		
		System.out.println("program start");
		ex.display();
//		
//		ex.display2();
//		
//		ex.display3();

	}

}
