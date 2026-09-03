package day22;

public class Demo extends Thread {
	
	
	@Override
	public void run() {
		
		for(int i=1 ; i<=200; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo();
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		d.setName("Father");
		d1.setName("Mother");
		d2.setName("son");
		
		d.start();
		try {
			d.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       d1.start();
       try {
		d1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        d2.start();
        try {
			d2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
