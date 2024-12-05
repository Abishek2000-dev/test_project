package Assignment;

public class IFCONDITION {
	
	public static void main(String[] args) {
		
		int mark =50;
		
		if (mark>=100) {
			System.out.println("best mark");
		}
		else if (mark >=70) {
			System.out.println("good mark");
			
		}
		else if (mark >=50) {
			System.out.println("average mark");
					
				}
		else if (mark >=35) {
			System.out.println("pass mark");
		}
		else {
			System.out.println("fail mark");
		}
	}

}
