package day36;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

	public static void main(String[] args) {
		 
		
		
		
		
		String name="Arju@#$#n";
		String mail="Arjun1911@gmail.in";
		String number="6876543210";
		
		
		Pattern namePattern=Pattern.compile("^[A-Za-z ]{3,50}$");
		Pattern mailPattern=Pattern.compile("^[^A-Z][\\w.-]+@[\\w.-]+\\.[a-z]{2,6}$");
		Pattern numberPattern=Pattern.compile("^[6-9]\\d{9}$");
		

		
		Matcher nameMatch=namePattern.matcher(name);
		
		if(nameMatch.matches()) {
			System.out.println("User name is valid");
			
		}else {
			System.out.println("User name is invalid");
		}
		

		Matcher mailMatch=mailPattern.matcher(mail);
		if(mailMatch.matches()) {
			System.out.println("User mail id is valid");
			
		}else {
			System.out.println("User mail id is invalid");
		}
		

		Matcher numberMatch=numberPattern.matcher(number);
		if(numberMatch.matches()) {
			System.out.println("User moblie number is valid");
			
		}else {
			System.out.println("User mobile number is invalid");
		}

	}

}
