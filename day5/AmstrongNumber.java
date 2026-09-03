package day5;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int val1=sc.nextInt();
		
		int val2=val1;
		int val3=val1;
		int count=0;
		int sum=0;
		int rem=0;
		
		while(val1>0) {
			count++;
			val1=val1/10;
		}
		
		while(val2>0) {
		 
			int product=1;
			rem=val2%10;
			
			for(int i=1;i<=count;i++) {
				product=product*rem;
			}
		  sum=sum+product;
             
		  val2=val2/10;
		}
		if(val3==sum) {
			System.out.println("AMSTROMG NUMBER");
		}else {
			System.out.println("NOT A AMSTROMG NUMBER"+sum+val3);
		}

	}

}
