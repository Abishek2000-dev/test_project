package Assignment;

public class work_17 {
	
	public static void main(String[] args) {
		String name = "abishek in england";
		
		char target = 'e';
		
		int count = 0;
		
		int len =name.length();
		
		for(int i = 0; i<len; i++) {
			
			if(name.charAt(i) ==target) {
				
				count++;
				
			}
			
			
			
			
			
		}
		
		System.out.println("e charater "+target+" count "+count);
		
		
		
		
	}

}
