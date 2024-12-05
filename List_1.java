package auto_test_26_oct_2024;

import java.util.ArrayList;
import java.util.List;

public class List_1 {

	public static void main(String[] args) {
		List <String> name = new ArrayList<>(); 
		name.add("abishek");
		name.add("king");
		name.add("tom");
		name.add("ramesh");
		name.add("abishek");
		//name.add(4, "ganesh");
		/*
		 * name.set(4, "ram"); name.remove("abishek"); int size = name.size();
		 * System.out.println(name); System.out.println(size); String string =
		 * name.get(3); System.out.println(string);
		 */
		
		/*
		 * for (int i = 0; i<size;i++) {
		 * 
		 * name.get(i);
		 * 
		 * System.out.println(name.get(i));
		 * 
		 * }
		 */
		
		/*
		 * name.clear(); name.isEmpty(); boolean contains = name.contains("abishek");
		 */
		
		//System.out.println(contains);
		
		
		for  (String name1 : name ) {
			
			System.out.println(name1);
		}
	}
}
