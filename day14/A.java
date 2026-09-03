package day14;

public class A {
	
	public void one() {
		System.out.println("100");
	}
    
	void two() {
		System.out.println("200");
	}
	
	protected void three() {
		System.out.println("300");
	}
	
	private void four() {
		System.out.println("400");
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		a.one();
		a.two();
        a.three();
        a.four();
        
        
        
        
	}

}
