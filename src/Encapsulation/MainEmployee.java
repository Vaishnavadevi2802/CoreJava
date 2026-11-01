package Encapsulation;

public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.setEmpId("A011");
		e1.setSalary(50000);
	
       System.out.println("Employee id is"+e1.getEmpId());
       System.out.println("Employee salary is"+e1.getSalary());
	}

}
