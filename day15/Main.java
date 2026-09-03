package day15;

public class Main {
	
	

	public static void main(String[] args) {
		
		Customer c=new Customer();
		c.setBankName("American Express");
		c.setBanchBank("New york");
		c.setInterestRate(55.5);
		
		c.setCustomerName("Kavitha");
		c.setAccountNumber(1234567993);
		c.setBalance(342343.343);
		
		System.out.println("Bank Details");
        System.out.println(" ");
	System.out.println(c.getBankName());	
		System.out.println(c.getBanchBank());
		System.out.println(c.getInterestRate());
		  System.out.println(" ");
		System.out.println("Customer Details");
        System.out.println(" ");
		System.out.println(c.getCustomerName());
		System.out.println(c.getAccountNumber());
		System.out.println(c.getBalance());
	
		
		

	}

}
