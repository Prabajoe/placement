package day16;

public class Three {
	
	public int cal(int a ,int b) {
		return a+b;
	}
	
	public int cal(int a ,int b ,int c) {
		return a-b-c ;
	}
	public int cal(int a ,int b ,int c ,int d) {
		return a*b*c*d;
	}
	public double  cal(double a ,double b ) {
		return a/b;
	}
	
	


	public static void main(String[] args) {
	
		Three t=new Three();
		System.out.println(t.cal(12, 24));
		System.out.println(t.cal(93, 33,6 ));
		System.out.println(t.cal(100, 10 ,19 ,12));
		System.out.println(t.cal(200.12, 24.0));
		
	

	}

}
