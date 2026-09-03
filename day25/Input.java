package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Input {
	
	public void getMethod() {
		
		
		InputStream in =System.in; // get raw Data from Keyboard
		
		InputStreamReader isr =new InputStreamReader(in); // convert raw byte data to char
		BufferedReader br =new BufferedReader(isr); // covert char to string data type
		
		

		
		try {
			System.out.println("enter the name ");
			String name = br.readLine();
			
			System.out.println("enter the age ");
			
		      int age = Integer.parseInt(br.readLine()) ;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 
			try {
				isr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}
		
	}

	public static void main(String[] args) {
	
		Input ip =new Input();
		ip.getMethod();
	}

}
