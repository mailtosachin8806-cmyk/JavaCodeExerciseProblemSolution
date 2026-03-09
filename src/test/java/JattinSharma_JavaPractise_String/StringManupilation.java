package JattinSharma_JavaPractise_String;

import org.testng.annotations.Test;

public class StringManupilation {
	/*
	 * String Manupulation 
	 * Java Sdet interview Preparation, day 14
	 * Input :- "r@56vi ku$%mar67";
	 * Output :- rvi kumar 24
	 */

	@Test
	public void handleStringManipulation()
	{
		String input = "r@56vi ku$%mar67";
		StringBuilder sb = new StringBuilder();
		int sum=0;
		for(char c : input.toCharArray()) {			
			if(Character.isLetter(c) || c== ' ') {
				sb.append(c);
			}
			else if(Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
			
		}
		
		sb.append(" ");
		sb.append(sum);
		System.out.println(sb);
	}
}
