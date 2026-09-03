package Day23;

public class InterThread extends Thread {
	
	TeaShop obj;
	
	public InterThread(TeaShop obj) {
		
		this.obj=obj;
	}
	
	 @Override
	public void run() {
		
		 obj.processingOrder(50);
		 
	}
	

	public static void main(String[] args) {
		
		TeaShop s=new TeaShop();
		
		Order o=new Order(s);
		InterThread t=new InterThread(s);
		
		
		o.start();
        t.start();
		
		

	}

}
