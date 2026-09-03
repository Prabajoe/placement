package day12;

public class B extends A {

	int x=10;
	
	
public void two(){
		
		System.out.println("hi inside the method two");
	}

public static void main(String[] args) {
	
	B b=new B();	
	b.one();
	b.two();
	
	
}
}
