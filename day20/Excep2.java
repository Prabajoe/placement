package day20;

import java.util.Scanner;

public class Excep2 {
 
//	public void display()  {
//		Scanner sc=new Scanner(System.in);
//		
//		try {
//			
//			int b=sc.nextInt();
//		  int a=10/b;
//		  System.out.println(a);
//		  
//		   
//		  
//					
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}finally {
//			sc.close();
//			System.out.println("erro handled");
//		}
//		
//		
//		
//	}
//	
//	
//	public void dis() {
//		
//		try {
//			
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the age");
//		
//			int age=sc.nextInt();
//			
//			System.out.println(age);
//			
//			throw new Exception();
//			
//			
//		} catch (Exception e) {
//			
//			System.out.println(e);
//		}
//	}

	public void dis3() {
		
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Username");
	
		int age=sc.nextInt();
		
		System.out.println(age);
		
		if(age<=18){
		
		throw new InvalidUserName("age greater then or equal to 18");
		}
		
		
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
		
	}
	
	public class InvalidUserName extends Exception{
		
		public InvalidUserName(String s) {
			
			super(s);
		}
	}
	
	public void dis4()throws Exception {
		int a=10/0;
	}
	public static void main(String[] args) {
	 
		Excep2 Ex=new Excep2();
//		Ex.dis3();
		try {
			Ex.dis4();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	
	}

}
