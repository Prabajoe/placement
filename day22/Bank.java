package day22;

public class Bank extends Thread {

	int balance = 5000;

	int amount;

	public Bank(int amount) {
		
		this.amount=amount;
	}

	synchronized void withdraw(int amount) {

		System.out.println(Thread.currentThread().getName() + "Trying to withdraw ");

		if (balance >= amount) {

			System.out.println(Thread.currentThread().getName() + "Withdraw Completd");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			 balance -=amount;

			System.out.println(Thread.currentThread().getName() + "Current Account balance" +" "+balance);

		} else {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Current Account balance iNSUFFICIANT");
		}

	}

	@Override
	public void run() {

		withdraw(amount);

	}

	public static void main(String[] args) {

		Bank b = new Bank(4000);

		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);

		t1.setName("User 1");
		t2.setName("User 2");

		t1.start();
		t2.start();

	}

}
