package day18;

public abstract class Payment {
	
	
	double amount;
	
	public Payment() {
		
	}
	
	
	public Payment(double amount) {
		 
		this.amount=amount;
	}
	
	
	
	public void payProcess() {
		System.out.println("Payment processing.......");	
		}
	
	public abstract void payInfo();
	

	public static void main(String[] args) {
		
	}

}
