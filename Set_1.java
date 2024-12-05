package auto_test_26_oct_2024;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_1 {
	
	public static void main(String[] args) {
		
		//Set<String> name = new HashSet<>();
		//Set<String> name = new LinkedHashSet<>();
		Set<String> name = new TreeSet<>();
		
		name.add("abishek");
		name.add("king");
		name.add("tom");
		name.add("ramesh");
		name.add("abishek");
		
		System.out.println(name);
		
		for (String name1 : name) {
			System.out.println(name1);
			
			
		}
		
		List <String> name2 = new ArrayList<>(name);
		String string = name2.get(0);
		System.out.println(string);
		
		
	}

}
