package day22;

public class RDemo implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

	public static void main(String[] args) {

		RDemo r = new RDemo();

		Thread tr = new Thread(r);

		tr.start();

		for (int i = 1; i <= 1000; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
