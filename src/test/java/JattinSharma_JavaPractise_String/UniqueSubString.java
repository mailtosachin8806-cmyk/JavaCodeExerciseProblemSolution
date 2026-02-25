package JattinSharma_JavaPractise_String;

import java.util.LinkedHashSet;

public class UniqueSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Question 24
		
		String input = "aabbccddeea";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		char[] words = input.toCharArray();
		
		
		for(char word:words)
		{
			if(set.add(word))
			{
				sb.append(word);
		
			}
		}
		
		System.out.println("Uniques String : " + sb);
			
	}

}
