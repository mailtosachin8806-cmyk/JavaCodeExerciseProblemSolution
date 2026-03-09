package JattinSharma_JavaPractise_String;

import java.util.Arrays;

import org.testng.annotations.Test;

/*Java Sdet interview Preparation, day 15
 * Input = "Java Test"
 * Output = "avaJ tesT"
 */

public class WordReverse {
	
	@Test
	public void handleReverseWords() {
	
		String input = "Java Test";
		String data[] = input.split(" ");
		System.out.println(Arrays.toString(data));
		StringBuilder sb = new StringBuilder();
		for(String word:data) {
		//	System.out.println(word);
			char charArray[] = word.toCharArray();
			int left = 0;
			int right = charArray.length-1;
			char temp;
			while(left<right)
			{
				temp = charArray[left];
				charArray[left] = charArray[right];
				charArray[right] = temp;
				left ++;
				right--;
			}
		//	System.out.println(Arrays.toString(charArray));
			String result = new String(charArray);
			System.out.println(result);
			sb.append(result).append(" ");
			
		}
		
		System.out.println(sb);
		
		
	}

}
