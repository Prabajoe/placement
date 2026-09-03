package day20;

public class seminar4 {

	public static void main(String[] args) {
	//indexof
		String s="hell wrldo";
		System.out.println(s.indexOf("el"));
		
		//lastindexof
		System.out.println(s.lastIndexOf("e"));
		
		//startswith
		System.out.println(s.startsWith(""));
		//endswith
		System.out.println(s.endsWith("o"));
		//isblank
		String s1="";
		System.out.println(s1.isBlank());
		//isempty
		System.out.println(s1.isEmpty());
		//split
		String s2="hello, world, java";
		String arr[]=s2.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//replaceall
		String s3="app12le";
		System.out.println(s3.replaceAll("[0-9]","a"));
		//contentequals
		String s4="hello";
		String s5="HELLO";
		System.out.println(s4.contentEquals(s5));
		//format
		String name="rovina";
		int age=20;
		String result=String.format("my name is %s my age is %d",name,age);
		System.out.println(result);
	}

}
