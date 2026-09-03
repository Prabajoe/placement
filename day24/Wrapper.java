package day24;

public class Wrapper {
	
	
	public static void main(String[] args) {
		
		
//		Autoboxing --- implicit

		int a=10;
		
		Integer a1=10;
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a1.getClass());
		
//		AutoUnboxing ------ implicit
   Integer b=20;
    int b1=b;
   
    System.out.println(b.getClass());
    System.out.println(b);
	System.out.println(b1);
	
	
//	Boxing ------ Explicit
	
	int c=30;
	
	Integer c1=Integer.valueOf(c);
	
	System.out.println(c);
	System.out.println(c1);
	System.out.println(c1.getClass());
	
	
	
//	Unboxing ------ Explicit
	
	Character d='S';
	char d1=d.charValue();
	
	System.out.println(d);
	System.out.println(d1);
	System.out.println(d.getClass());
	
		
	}

	
	

	
}
