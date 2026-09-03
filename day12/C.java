package day12;

public class C extends B {

public void three(){
		
		System.out.println("hi inside the method three");
	}
	public static void main(String[] args) {
		
		C c=new C();
//		c.one();
        
          c.three();
          System.out.println(c);

	}

}
