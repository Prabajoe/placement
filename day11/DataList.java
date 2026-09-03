package day11;

public class DataList {

	static String collegeName="Saradha gangadharan college";
	 String name;
	 int rollNo;
	 int age;
	 String course;
	 int m1;
	 int m2;
	 int m3;
	 
	 int totalMarks;
	 double findAvg;
	 

	 
   public DataList(String name,int rollNo,int age,String course ,int m1 ,int m2 ,int m3){
	   this.name=name;
	   this.rollNo=rollNo;
	   this.age=age;
	   this.course=course;
	   this.m1=m1;
	   this.m2=m2;
	   this.m3=m3;
	   
   }
   public DataList() {
	// TODO Auto-generated constructor stub
}

	public void findTotal() {
		 totalMarks=m1+m2+m3;
		 System.out.println("TotalMark :"+totalMarks);
		 
	 }
	
	 public void findPercentage() {
		 findAvg=totalMarks/3;
		 System.out.println("Percentage :"+findAvg);
	 }
	 
	 public void studentDetails() {
		 
		 System.out.println(collegeName);
		 
		 System.out.println("NAME :"+name);
		 System.out.println("ROLLNO :"+rollNo);
		 System.out.println("AGE :"+age);
		 System.out.println("COURSE :"+course);
		 System.out.println("M1 :"+m1);
		 System.out.println("M2 :"+m2);
		 System.out.println("M3 :"+m3);
		 findTotal();
         findPercentage();
		
	 }
	
	public static void main(String[] args) {
		
		DataList s1=new DataList("raja",101,23,"MCA",96,99,35);
		DataList s2=new DataList();
		DataList s3=new DataList();
		s2.name="rani";
		s3.name="vijay";
		
	
		
		
//		s1.findTotal();
//        s1.findPercentage();
        s1.studentDetails();
      System.out.println(" ");
//        System.out.println(" ");
//        s2.name="rani";
//		s2.rollNo=102;
//		s2.age=20;
//		s2.course="BCA";
//		s2.m1=34;
//		s2.m2=23;
//		s2.m3=16;
//		
		s2.studentDetails();
		System.out.println();
		s3.studentDetails();
	

	}

}
