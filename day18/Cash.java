package day18;

public class Cash extends Payment {
	
	
	
	public Cash(double amount) {
		super(amount);
	}
   
	@Override
	public void payInfo() {
		System.out.println("The cashpayment amount :"+amount);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
