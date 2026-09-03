package day33;


public class EnumDemo {
	
	
	enum days{
		
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THRUSDAY,
		FRIDAY,
		SATURDAY
		
		 
			}
	
	 days d=days.SUNDAY;
	 
 public void display() {
	 

	 
	switch (d) {
	case SUNDAY: 
		System.out.println("day 1");
		break;
		
	case MONDAY: 
		System.out.println("day 2");
		break;
	case TUESDAY: 
		System.out.println("day 3");
		break;
		
	case WEDNESDAY: 
		System.out.println("day 4");
		break;
	case  THRUSDAY: 
		System.out.println("day 5");
		break;
	case  FRIDAY: 
		System.out.println("day 6");
		break;
		
	case  SATURDAY: 
		System.out.println("day 7");
		break;
		
     default :
    	 System.out.println("invalid");
	}
	
	
	 
 }
	
	 
	 
	 
	 
	 
	 
	 
	    
	 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumDemo e=new EnumDemo();
		e.display();
		 
		 
		
		for (days d : days.values()) {
			
			System.out.println(d);
			
		}
		
	}

}
