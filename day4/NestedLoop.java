package day4;

public class NestedLoop {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(i==1 || j==1 || i==6 || j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println(" ");
		}
	}

}
