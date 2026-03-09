package JattinSharma_JavaPractise_String;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;


public class manipulateString {
	
	/*
	 * Input :- a1b2c3
	 * Output :- a3b2c1
	 */

	@Test (description  ="Handle a String Manipulation")
	public void EVmaipulationString() {
	String input = "a1b2c3";
	System.out.println(input);
	List<Character> list = new ArrayList<Character>();
	
	for(char c : input.toCharArray()) {
		
		if(Character.isDigit(c)) {
			list.add(c);
		}
		
	}
	
	System.out.println(list); // [1, 2, 3]
	
	int index = list.size()-1;
	
	StringBuilder sb = new StringBuilder();
	for(char c: input.toCharArray()) {
		if(Character.isDigit(c)) {
			sb.append(list.get(index));
			index -- ;
		} else {
			sb.append(c);
		}
	}
	
	System.out.println(sb);
	
	
	
	
	
	
	
	
	
}

}