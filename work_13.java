package Assignment;

public class work_13 {
	
	public void empnameandid (String empname ,int empid ) {
		System.out.println("empolyee name "+empname);
		System.out.println("empolyee id "+empid);
		
	}
	
	public void getempaddress() {
		
		String address ="21 chennai";
		
		System.out.println("address "+address);
		
	}
	
	public void empsalary(double salary) {
		
		System.out.println("empsalary "+salary);
		
	}
	
	public void empnumber (long number) {
		
		System.out.println("emp mobile "+number);
		
	}
	
	public static void main(String[] args) {
		
		work_13 employee = new work_13();
		
		employee.empnameandid("abishek", 21);
		employee.empnumber(1234567890L);
		employee.getempaddress();
		employee.empsalary(10000.00);
	}

}
