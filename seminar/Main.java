package seminar;

public class Main {

	public static void main(String[] args) {
     //equalsToIgnoreCase
		String a = "HEllo";
		String b = "helloo";
		System.out.println(a.equalsIgnoreCase(b));
		
	//compareToIgoreCase
		String c ="apple";
		String d="orange";
		System.out.println(c.compareToIgnoreCase(d));
	//stripLeading
		String e = "         Hello World    h    d";
		System.out.println(e.stripLeading());
	//matches
		String f = "abc123@gmail.com";
		System.out.println(f.matches("[a-z]+\\d+@gmail.com"));
	//toCharArray
		String g = "Hi";
		char [] arr = g.toCharArray();
        for(char ca: arr) {
        	System.out.println(ca);
        }
      //getByte()
        String h = "A";
		byte [] bytes = h.getBytes();
        for(byte bi: bytes) {
        	System.out.println(bi);
	}
      //codePointAt
        String j = "o";
        System.out.println(j.codePointAt(0));
        
      //codePointCount
        String str = "KavithaRovinaHariJagadish";
        System.out.println(str.codePointCount(0,str.length()));
      //toString
         int num = 123;
        System.out.println(num.toString());
	}
}
