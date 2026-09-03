package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 int value;
		 int size;
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the array size");
		 
		  size=sc.nextInt();
		 
		 int arr[]=new int[size];
		 
		 for(int i=0;i<size;i++) {
			 System.out.println("enter index value"+i);
			  arr[i]=sc.nextInt();
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 
	     
		
//		int []arr=new int[5];
		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
	
//		int v=arr.length;
		
		int arr1[]= {4,35,43,5,1,4,10};
		Arrays.fill(arr1,5);
		System.out.println(Arrays.toString(arr1));
//		
//		for(int i=0;i<arr1.length;i++) {
//			
//			System.out.println(arr1[i]);
//			
//		}
		
		
		
	
	}

}
