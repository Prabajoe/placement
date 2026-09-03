package javabuddies;

public class NestedStatement {
	
	public static void main(String[] args) {
		
//		String name="joe";
//		int passWord=12356;
//		int key=7;
//		
//		if(name=="joe") {
//			if(passWord==123456) {
//				System.out.println("login successfully");
//			}else if(key==7) {
//				System.out.println("passsword is invalid");
//			}
//		}else {
//			System.out.println("user name is invalid");
//		}
//		
		
		int mark =30;
		
		boolean sportsQuotes=false;
		
		if(mark >=50) {
			if(mark>=90) {
				System.out.println("grade is A");
			}else if(mark>=80) {
				System.out.println("grade is B");
			}else if(mark>=70) {
				System.out.println("grade is c");
			}else {
				System.out.println("fail");
			}
		}else {
			if(sportsQuotes) {
				System.out.println("pass due to sportsQuoutes");
			}else {
				System.out.println("fail");
			}
		}
		
	}

}
