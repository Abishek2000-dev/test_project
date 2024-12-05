package Assignment;

public class ForStatment {

	public static void main(String[] args) {
		
		//for loop
		
		for(int i = 0; i<=10; i++ ) {
			
			System.out.println(i);
			
		}
		
		//while loop
		
		int a = 0;
		
		while(a>=5) {
			
			System.out.println("while loop "+a);
			
			break;
			
		}
		
		//do while loop
		// for each loop
		
		int [] 	TT= {1,2,3,4,5};
		
		for (int b : TT) {
			System.out.println(b);
		}
		
		 
		//switch
		int day = 7;
		
		switch(day){
			
			case 1:
				System.out.println("monday");
				break;
				
			case 2:
			   System.out.print("Tuesday");
			   break;
			   
			case 3:
				System.out.println("Wedday");
				break;
				
			default:
				System.out.println("weekend");
				
			   
		}

		
	}

}
