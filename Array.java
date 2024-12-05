package auto_test_21_oct_2024;

import java.util.Arrays;

public class Array {
		public static void main(String[] args) {
			int[] a = {2,4,5,6,7};
			int c =a.length;
			int d = a[0];
			System.out.println(d);
			
			
			for (int i = 0; i<c;i++) {
				System.out.println(a[i]);
			}
			
			int[]ages1= new int[6];
			ages1[0]=12;
			ages1[1]=15;
			ages1[2]=16;
			ages1[3]=2;
			ages1[4]=100;
			ages1[5]=9;
			int j=  ages1.length;
			System.out.println(ages1[0]);
			
			for (int i =0 ; i<j; i++) {
				
				
				System.out.println(ages1[i]);
			}
			
			System.out.println("!!");
			
			Arrays.sort(ages1);
			for (int i =0 ; i<j; i++) {
				
				
				System.out.println(ages1[i]);
			}
			
			
			
			
		}
}
