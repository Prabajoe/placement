package day22;

public class ThreadSt extends Thread {
	
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getState());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		ThreadSt st=new ThreadSt();
		ThreadSt st2=new ThreadSt();
		System.out.println(st.getState()); // new state
		
		
		st.start(); // Runnable  State
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(st.getState());
		
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(st.getState());
	
//		try {
//			st.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
         
		System.out.println(st.getState());// Terminated
	
		
	}
	
	

}
