package day8;

import java.util.Scanner;

public class TicketBooking {

	public static void main(String[] args) {
		
//		boolean ticketOpen=true;
//		
//		Scanner sc=new Scanner(System.in);
//		
//		int seat[][]=new int[5][5];
//		
//		
//		while(ticketOpen) {
//			System.out.println("seat layout");
//			for(int i=0;i<seat.length;i++) {
//				for(int j=0;j<seat[i].length;j++) {
//					
//					System.out.print(seat[i][j]+" ");
//				}
//				System.out.println();
//			}
//				System.out.println("Enter the row 0 to 4");
//				int row=sc.nextInt();
//				System.out.println("Enter the col 0 to 4");
//				int col=sc.nextInt();
//				
//				if(row<5 && col<5 && row>0 && col>0 ) {
//					if(seat[row][col]==0) {
//						seat[row][col]=1;
//						System.out.println("your ticket as Booked Successfully");
//				}else {
//					System.out.println(" ticket as already Booked Successfully");
//				}
//				}else {
//					System.out.println("enter valid seat numbers");
//				}
//				
//		
//		} 
//		
		int num[] = {10,20,30,40};
		
		for(int number :num) {
			System.out.println(number);
		}

		
		
		String []names={"ravi","kumar","kavitha","hariharan","rovina"};
		for(String name:names) {
			System.out.println(name);
		}
	}

}
