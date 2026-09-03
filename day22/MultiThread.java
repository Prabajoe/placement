package day22;

import java.util.Iterator;

public class MultiThread extends Thread  {

	@Override
	public void run() {

		for (int i = 0; i <= 1000; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {

		MultiThread t = new MultiThread();
		MultiThread t1 = new MultiThread() ;
			
	
		
//		t.setName("jagadish");
		
		 t.start();
		 t1.start();

		for (int i = 0; i <= 1000; i++) {

			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

}
