package Constructor;

public class Person {
	String name;
	int age;
	
	//Default Constructor
	Person(){
		System.out.println("Default Constructor Called!");
		name="Unknown";
		age=0;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}

	public static void main(String[] args) {
		Person p1=new Person();
	}

}
