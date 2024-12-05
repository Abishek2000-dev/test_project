package auto_test_21_oct_2024;

public class Add {
	
	//no parameter,no return
	
	/*public void addtwo() {
		int a =30;
		int b =50;
		int c = a+b;
		System.out.println(c);
		
		
		
		
	}*/
	
	//with parameter and no return
	
	/*
	 * public void Sub(int a , int b) { int c = a-b; System.out.println(c);
	 * 
	 * }
	 */
	
	//with parameter and with return
	
	/*
	 * public int mul(int a,int b) { return a*b;
	 * 
	 * }
	 */
	
	//not parameter and with return
	
	public int div() {
		
		int a = 25;
		int b = 5;
		int c = a/b;
		return c;
		
		
	}
	
	public static void main(String[] args) {
		
		Add addtwo = new Add();
		//addtwo.addtwo();
		//addtwo.Sub(59, 60);
		//int mul = addtwo.mul(40, 20);
		//System.out.println(mul);
		addtwo.div();
		int div = addtwo.div();
		System.out.println(div);
		
		
		
		
		
	}

}
