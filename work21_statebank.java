package Assignment;

public class work21_statebank extends work21_bank {
	
	public void deposit() {
		
		System.out.println("amount deposit in state bank");
	}
	
	
	public static void main(String[] args) {
		
		work21_statebank callbank = new work21_statebank ();
		
		callbank.deposit();
		callbank.saveing();
		callbank.fixed();
	}
	
	

}
