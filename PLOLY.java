package auto_test_25_oct_2024;

public class PLOLY {
	
	// methodoverloading and complie time polymorpisem
	
	public void add(int a , int b) {
		
		System.out.println(a+b);
		
	}
	public void add(int c , int d,int e) {
		
		
		System.out.println(c+d+e);
		
	}
	
	
	
	public static void main(String[] args) {
		
		PLOLY addition = new PLOLY();
		
		addition.add(30,82);
		addition.add(50, 85, 84);
		
	}
	
	
	

	
}
