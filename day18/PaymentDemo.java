package day18;

import java.util.Scanner;

public class PaymentDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();

		Cash Cp = new Cash(amount);
		Upi Up = new Upi(amount);
		Card Cd = new Card(amount);
		
	    
		Payment payDemo[]= {Cp,Up,Cd};
		
		System.out.println("Enter the Payment Method");
		System.out.println("For Cash press- 0");
		System.out.println("For Upi press- 1");
		System.out.println("For Card press- 2");
		
		int choice=sc.nextInt();
		
		 if(choice >=0 && choice<=2) {
			 
		for(int i=choice;i<=choice;i++) {
			
			payDemo[choice].payProcess();
            payDemo[choice].payInfo();
		}
		 
		 }else {
			 System.out.println("invalid choice");
		 }
		 

		

	
    	Cd.reFund(100);
        
		

	}

}
