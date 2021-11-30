package org.emp;

public class Employee {
	public void empId() {
		System.out.println(" emp id is 451596");

	}
	public void empName() {
		System.out.println("emp name is Ranjith");

	}
	public void empDob() {
		System.out.println("emp dob is 20.07.1994");

	}
	public void empPhone() {
		System.out.println("emp pnone no is 8098562337");
 
	}
	public void empEmail() {
		System.out.println("ranjith94.pandian@gmail.com");

	}
	public void empAddress() {
		System.out.println("Virudhunagar district-626138");

	}
	public static void main(String[] args) {
		
		Employee em=new Employee();
		em.empId();
		em.empName();
		em.empDob();
		em.empPhone();
		em.empEmail();
		em.empAddress();
		em.salary();
	}
	private void salary() {
		System.out.println("Salary is 78553");

	}
	
	

}
