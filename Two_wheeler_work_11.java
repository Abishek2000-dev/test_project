package Assignment;

public class Two_wheeler_work_11 {
	
	int noofWheels = 2;
	short noofMirrors=2;
	long Number = 4;
	boolean isPunctured = false;
	double runningKM = 9393.80;
	String bikename = "tvs";
	
	public void bikedata() {
		
		   System.out.println("Number of Wheels: " + noofWheels);
	        System.out.println("Number of Mirrors: " + noofMirrors);
	        System.out.println("Bike Number: " + Number);
	        System.out.println("Is Punctured: " + isPunctured);
	        System.out.println("Running KM: " + runningKM);
	        System.out.println("Bike Name: " + bikename);
	}
	
	public static void main(String[] args) {
		
		Two_wheeler_work_11 bikke = new Two_wheeler_work_11();
		
		bikke.bikedata();
		
		
	}
	

}
