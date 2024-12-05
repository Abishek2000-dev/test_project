package Assignment;

public class work20_student extends work20_department {
	
	 public void studentname() {
	        System.out.println("abishek");
	    }

	    public void studentid() {
	        System.out.println("12345");
	    }

	    public void studentdept() {
	        System.out.println(" Computer Science");
	    }

	    public static void main(String[] args) {
	    	work20_student student = new work20_student ();
	        
	        student.collegename();
	        student.collegecode();
	        student.collegerank();
	        student.deptname();
	        student.studentname();
	        student.studentid();
	        student.studentdept();
	    }

}
