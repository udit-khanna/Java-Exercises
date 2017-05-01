package testpro;

//import keywords.Person;

public class classEgug {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "EJava";
		anotherMethod(p1);
		System.out.println(p1.name);
		someMethod(p1);
		System.out.println(p1.name);
	}

	static void someMethod(Person p2) {
		p2.name = "someMethod";
		System.out.println(p2.name);
	}

	static void anotherMethod(Person p3) {
//		p3 = new Person();
		p3.name = "anotherMethod";
		System.out.println(p3.name);
	}

}

class Person {
	public String name;
	public int height;
}
