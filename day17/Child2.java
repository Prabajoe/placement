package day17;

public class Child2 extends Child {

	@Override
	public void marriage() {
		System.out.println("Married");

	}

	@Override
	public void childName() {
		System.out.println("Kavitha");
	}

	public static void main(String[] args) {

		Child2 ch2 = new Child2();
		ch2.childName();
		ch2.childGrow();
		ch2.childEducation();
		ch2.marriage();

	}

}
