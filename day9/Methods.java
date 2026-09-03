package day9;

public class Methods {

	
//	without parameter without return type
public static void one() {
		System.out.println("hello my method");
		
	}
	
//with parameter without return type
public static void two(int g ,int u) {
	System.out.println(g+u);
	
}

//without parameter with return type
public static int three() {
	
	int price=100;
	return price;
	
}
//with parameter with return type
public static double multiple(int x,int y) {
	

	return x*y ;
	
}

public static int numbers(int n){
	
	if(n==0) {
		return 0;
	}
//	System.out.println(n);
	return n+numbers(n-1);
	
	
	
}

	public static void main(String[] args) {
		
		one();	
		two(12,5);
	System.out.println(	three());
	System.out.println(multiple(6,8));
	
	System.out.println(numbers(5));	
	}


}
