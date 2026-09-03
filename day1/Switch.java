package day1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE VALUE A");
		double a= sc.nextDouble();
		
		System.out.println("ENTER THE VALUE b");
		
		double b=sc.nextDouble();
		
          System.out.println("ENTER THE OP");
		
		char op=sc.next().charAt(0);                   
		
		switch (op) {

		case '+':
			System.out.println("Addition :"+(a+b));
			break;
		case '-':
			System.out.println("subraction"+(a-b));
			break;
		case '*':
			System.out.println("multiplication"+(a*b));
			break;
		case '/':
			System.out.println("division"+(a/b));
			break;
		case '%':
			System.out.println("modules"+(a%b));
			break;
		default:
			System.out.println("invalid");

		}

	}

}
