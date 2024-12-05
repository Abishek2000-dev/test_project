package Assignment;

public class work23 {
	
	public void studentinfo(String name, int studentid, String address) {
		
		System.out.println("student name " +name);
		System.out.println("student id " + studentid);
		System.out.println("student address" + address);
		
	
	}
	
    public void studentinfo(String name, int studentid, String course) {
		
		System.out.println("student name " +name);
		System.out.println("student id " + studentid);
		System.out.println("student course" + course);
		
	
	}
	
    public void studentinfo(String name, int studentid, long number) {
		
		System.out.println("student name " +name);
		System.out.println("student id " + studentid);
		System.out.println("student phonenumber" + number);
		
	
	}
    
    public static void main(String[] args) {
		work23 studentdetail = new work23();
		
		studentdetail.studentinfo("abishek",1111, 3345345356939l);
		studentdetail.studentinfo("king", 1929, "computer");
		studentdetail.studentinfo("tom",83830, "chennai");
		
	}
	
	

}
