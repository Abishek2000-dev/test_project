
package auto_test_22_oct_2024;

public class String_value {
	
	//String something value = ""
	
 public static void main(String[] args) {
		/*
		 * String text1 = "abishek"; String text2 = "Java"; boolean equals =
		 * text1.equals(text2); System.out.println(equals); String upperCase =
		 * text1.toUpperCase(); System.out.println(upperCase); String lowerCase =
		 * upperCase.toLowerCase();
		 * 
		 * System.out.println(lowerCase); boolean equals2 = upperCase.equals(lowerCase);
		 * 
		 * System.out.println(equals2);
		 * 
		 * boolean equalsIgnoreCase = upperCase.equalsIgnoreCase(lowerCase);
		 * 
		 * System.out.println(equalsIgnoreCase);
		 */
	 
	 String d1 = "I am in chennai";
		 String d2 = "chenni";
		 
			/*
			 * boolean contains = d1.contains(d2);
			 * 
			 * System.out.println(contains);
			 * 
			 * 
			 * d2.startsWith("ch"); System.out.println( d2.startsWith("ch"));
			 * 
			 * d2.endsWith("ni"); System.out.println( d2.endsWith("ni"));
			 * 
			 * d2.concat("airport");
			 * 
			 * System.out.println( d2.concat("airport"));
			 * 
			 * String h = d2 + "beach";
			 * 
			 * System.out.println(h);
			 * 
			 * 
			 * System.out.println(d1.charAt(0));
			 * 
			 * int j = d1.length();
			 * 
			 * for (int i = 0;i<j;i++) { char charAt = d1.charAt(i);
			 * 
			 * System.out.println(charAt);
			 * 
			 * } char[] charArray = d1.toCharArray();
			 * 
			 * for (int i =0; i<charArray.length;i++) { System.out.println(charArray[i]); }
			 */
		 
		String[] split = d1.split("a");
		
		for(int i = 0; i<split.length; i++) {
			
			System.out.println(split[i]);
		}
		
		String Text = "mindforce";
		
		String substring = Text.substring(2);
		
		System.out.println(substring);
		String substring2 = Text.substring(2, 5);
		
		System.out.println(substring2);
		
		String replace = Text.replace("d", "1");
		System.out.println(replace);
		
		String gppd = "tom 19393";
		String replaceAll = gppd.replaceAll("[^0-9]", "");
		
		System.out.println(replaceAll);
	
}
	

}
