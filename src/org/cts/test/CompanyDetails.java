package org.cts.test;

public class CompanyDetails extends EmployeeDetails{
	
	private void compId() {
	System.out.println("Comp id is 123");
	}

	public static void main(String[] args) {
		
		
		CompanyDetails c = new CompanyDetails();
		c.compId();
		c.empId();
	}
}
