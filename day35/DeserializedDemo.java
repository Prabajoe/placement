package day35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserializedDemo {

	public static void main(String[] args) {
		
		try { 
			FileInputStream fi=new FileInputStream("D:\\JavaSer\\demo.ser");
			ObjectInputStream oob=new ObjectInputStream(fi);
			
			
			Student s1=(Student)oob.readObject();
			
			fi.close();
			oob.close();	
			
			System.out.println(s1.id+" "+s1.name+" "+s1.age);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
