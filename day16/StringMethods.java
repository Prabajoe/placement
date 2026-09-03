package day16;

public class StringMethods {

	public static void main(String[] args) {
		//Length
		String str1="Hello";
		String str3="hello";
		System.out.println(str1.length());
		
		//Equals
		String str2="hello";
		System.out.println(str1.equals(str2));
		
		//Toupper
		System.out.println(str1.toUpperCase());
		
		//Tolower
		System.out.println(str1.toLowerCase());
		
		//Concat
		System.out.println(str1.concat(str3));
		
		//join
		String result=String.join("-",str1,str3);
		System.out.println(result);
		
		//RegionMatches
		String s="HelloWorld";
		String sl="World";
		System.out.println(s.regionMatches(5, sl, 0, 5));
		
		//CopyValueof
		char []arr= {'J','A','V','A'};
		String ST=String.copyValueOf(arr);
		System.out.println(ST);
		
		//Repeat
		System.out.println(str1.repeat(5));
		
		//Replace
		System.out.println(s.replace("l","x"));
		
		
		//CharAt
		System.out.println(str1.charAt(3));
		
		//Compara to
		
		System.out.println(str1.compareTo(str3));
		
		// trim
		
		String a=" Hiiii ";
		System.out.println(a.trim());
		
		// contains
		
		System.out.println(a.contains("ad"));
		
		//strip
		System.out.println(a.strip());
		
		//striptrailing
		System.out.println(a.stripTrailing());
		
		//substring
		String d="HelloEveryone";
		System.out.println(d.substring(0,5));
		
		//replacefirst
		String e="apple";
		System.out.println(e.replaceFirst("apple","orange"));
		
		//valueof
		
		int i =100;
	
		
		System.out.println();
		
		//intern
		
		String t=new String("Hello");
		String y=t.intern();
		String u="Hello";
		System.out.println(u==y);
		
		
		
		
		
		
		
		
		
		

	}
}
