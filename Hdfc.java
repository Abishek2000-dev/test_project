package auto_test_25_oct_2024;

public class Hdfc implements Rbi {

	@Override
	public void opensaveingaccount() {
		// TODO Auto-generated method stub
		System.out.println("account create");
		
	}
	
	public void deposite(int a ) {
		
		System.out.println("amount is" +a);
		
	
	}
	
	public static void main(String[] args) {
		
		Rbi bank = new Hdfc(); //upcasting
		
		/*
		 * Hdfc bank = new Hdfc(); bank.opensaveingaccount(); bank.deposite(500);
		 */
		
		bank.opensaveingaccount();
	}
	
	
	

}
