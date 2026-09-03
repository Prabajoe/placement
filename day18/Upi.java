package day18;

public class Upi extends Payment implements Refund{
	
	public Upi(double amount) {
		super(amount);
	}

	@Override
	public void payInfo() {
		System.out.println("The Upipayment amount :"+amount);
		
	}
	
	@Override
	public void reFund(double amount) {
		System.out.println("The Refund amount :"+amount);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
