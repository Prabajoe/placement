package day35;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialableDemo {
	
	

	public static void main(String[] args) {
		
		Student s=new Student(101,"joe",23);
		
		try {
			FileOutputStream f=new FileOutputStream("D:\\JavaSer\\demo.ser");
			ObjectOutputStream ob=new ObjectOutputStream(f);
			
			ob.writeObject(s);
			
			System.out.println("Object serialized");
			
			f.close();
			ob.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
