package Assignment;

public class work27 implements intreface_27 {

	@Override
	public void opensavingaccount() {
		// TODO Auto-generated method stub
		
		System.out.println("account open");
		
	}

	@Override
	public void depositamount() {
		// TODO Auto-generated method stub
		System.out.println("accountdeposit");
		
	}

	@Override
	public void debitcardnumber() {
		// TODO Auto-generated method stub
		
		System.out.println("account debit card");
		
	}
	
	public void personalsaveing() {
		
		System.out.println("account is personal account");
	}
	
	public static void main(String[] args) {
		
		work27 bank = new work27();
		
		bank.debitcardnumber();
		bank.depositamount();
		bank.opensavingaccount();
		bank.personalsaveing();
	}
	
	

}
