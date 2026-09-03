package Day23;

public class Order extends Thread {
	
	TeaShop obj;
	
	
	public Order(TeaShop obj) {
		
		this.obj=obj;
	}
	
	@Override
	public void run() {
	
		obj.teaMaster(30);
	}

	
	
}
