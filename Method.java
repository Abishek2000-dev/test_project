package auto_test_17_oct_2024;

//accessmodifier returntype methodName(args){}


public class Method {
	
	//Public method 
	
     public void printMyname() {
    	 
    	 System.out.println("abishek");
     }
     
     //Private
     
     private int vechlieNumber() {
    	 
    	// return 4567;
    	 
    	 int number = 20;
    	 System.out.println(number);
    	 return number;
     }
     
     //Default
     
     String vechileColour () {
    	 
    	 String colour = "green";
    	 
    	 return colour;
    	 
    	 
     }
     
     void Colour () {
    	 
    	 System.out.println("red");
     }
      
     // class name and object name and Method name
     public static void main(String[] args) {
		
    	 Method obj = new Method();
    	 
    	 obj.printMyname();
    	 String vechileColour = obj.vechileColour();
    	 System.out.println(vechileColour);
    	 obj.vechlieNumber();
    	 obj.Colour();
	}
     
     
}
