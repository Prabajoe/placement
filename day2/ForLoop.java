package day2;

import java.util.Scanner;

public class ForLoop {
	
	

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter  the value");
//		int value=sc.nextInt();
		
//		int i=1234;
//		int rev=0;
//	while(i!=0) {
//		int digit=i%10;
//		rev =rev*10+digit;
//		
//		
//	i=i/10;
//	
//	}
//	
//   System.out.println(rev);
		
		int r=10;
		int count =0;
		int i=1;
		
		while(i<=r) {
			if(r%i==0) {
				count++;
			}
			i++;
		}
		if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number");
		}
		
	}

		
}
