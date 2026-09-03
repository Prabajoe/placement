package day10;

public class MethodsType {
	
//	Static variables
	static String name="Oceanacademy";
	String name1="OCA";
	
//	Static mehtod 
	 
	static void myMethod() {
		System.out.println("remember what i have teach");
	}
	
	
	public void myMethod2() {
		System.out.println("remember what i have teach");
	}

	public static void main(String[] args) {
		
		
		System.out.println("Name : hari");
		System.out.println("age : 22");
		System.out.println("course : java");
		System.out.println("Academy name :"+name);
          
		myMethod();
		MethodsType.myMethod();
		
		
		final String student="jagadish";
		
	
	}

}
