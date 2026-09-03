package day3;

public class DoWhile {

	public static void main(String[] args) {
		
		int i=1;
		int n=5;
		int sum=0;
		do {
			
			if(i%2==0) {
				sum=sum+i;
				System.out.println(sum);
			}else {
				System.out.println("odd");
			}
			i++;
		}while(i<=n);
			
	
		
		

	}

}
