package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
//	
//		File fl =new File("D:\\FileDemo\\Demo.txt");
//		
//		try {
//			if(fl.createNewFile()) {
//				System.out.println("file created"+fl.getName());
//			}else {
//				System.out.println("file is already exists"+fl.getName());
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
//		
		
		try {
			FileWriter fw=new FileWriter("D:\\FileDemo\\Demo.txt");
			BufferedWriter Br=new BufferedWriter(fw);
			
			fw.write("hello hi ok kkk");
			
			Br.write("hello");
			
			
			System.out.println("file overrided");
			Br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try {
			FileReader Fr=new FileReader("D:\\FileDemo\\Demo.txt");
			BufferedReader Br=new  BufferedReader(Fr);
			
		System.out.println(Br.readLine());	
			
			String b=Br.readLine();
//			System.out.println((char)b);
			
//			 String b=Br.readLine();
//				System.out.println(b);
//				
//				 b=Br.readLine();
//					System.out.println(b);
//					
//					 b=Br.readLine();
//						System.out.println(b);
//						
//						 b=Br.readLine();
//							System.out.println(b);
							
							while(b!=null) {
								System.out.println(b);
								b=Br.readLine();
								
							}
							
//							Br.close();
//				 b=Br.read();
//					System.out.println((char)b);
//					 b=Br.read();
//						System.out.println((char)b);
//						 b=Br.read();
//							System.out.println((char)b);
//							 b=Br.read();
//								System.out.println(b);
			
//			Scanner sc=new Scanner(Fr);
//			
//			while(sc.hasNextLine()) {
//				
//				String s=sc.nextLine();
//				System.out.print(s);
//			}
		
//		int c=Fr.read();
//		System.out.println((char)c);
//		 c=Fr.read();
//		System.out.println((char)c);
//		 c=Fr.read();
//			System.out.println((char)c);
//			 c=Fr.read();
//				System.out.println((char)c);
//				 c=Fr.read();
//					System.out.println((char)c);
//					 c=Fr.read();
//						System.out.println(c);
//						
//						while(c!=-1) {
//							System.out.print((char)c);
//							 c=Fr.read();
//						}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
//		
//		File Dl=new File("D:\\FileDemo\\Demo.txt");
//		
//		try {
//			
//			if(Dl.delete()) {
//				System.out.println("Deleted"+Dl.getName());
//			}else {
//				System.out.println("file not founded "+Dl.getName());
//			}
//			
//		} catch (Exception e) {
//			
//		}
	

	}
	
	
      

}
