package auto_test_25_oct_2024;

public class Bmw extends Car {
	
	public void Bmwred () {
		
		System.out.println("Bmw car is red");
		
	}
	
	public static void main(String[] args) {
		
		Bmw rent = new Bmw();
		
		rent.Bmwred();
		rent.breaks();
		rent.soundhorn();
		rent.Accar();
		
		
		
	}

}
