package Day23;

public class TeaShop {
	
	int tea=50;
	
	synchronized void teaMaster(int noOfOrder) {
		
		
		System.out.println("-----------Tea order------------");
		
		if(tea>=noOfOrder) {
			
			System.out.println("Tea ready Now"+" "+tea);
			
			System.out.println("Tea for serving"+" "+noOfOrder); 
			
			
			tea -=noOfOrder;
			
			System.out.println("Remaining Tea"+" "+tea); 
			
					
					
			
			
			
		}else {
			
			System.out.println("Please Wait for your Tea");
			
			try {
				wait();
				
				System.out.println("-------Tea after notify method-----------");
				
				System.out.println("Tea for serving after wait"+" "+noOfOrder); 
				
				tea -=noOfOrder;
				System.out.println("Remaining"+" "+tea); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	synchronized void processingOrder(int noOfOrder) {
		
		System.out.println("--------Tea in Preperation---------");
		
		System.out.println("Tea on preperation " +" "+noOfOrder);
		
		tea +=noOfOrder;
		
		System.out.println("Total Tea "+" "+tea);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		notify();
     
        
          
		
	}

}
