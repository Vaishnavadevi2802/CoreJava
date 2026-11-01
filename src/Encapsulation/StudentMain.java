package Encapsulation;

public class StudentMain {

	public static void main(String[] args) {
	Student s1= new Student();
	
	s1.setName("Krishna");
	s1.setage(34);

	System.out.println("Student Name is "+ s1.getname());
	System.out.println("Student Age is "+ s1.getage());
	}

}
