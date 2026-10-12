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
	
	@Test
	public void handleReverseWordString() {
		
		String input = "Sachin Gharsele";
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (int w = 0; w < words.length; w++) {

            String word = words[w];

            // Reverse only the first word
            if (w == 0) {
                word = new StringBuilder(word).reverse().toString();
            }

            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                if (i % 2 == 0) {
                    temp.append(Character.toUpperCase(ch));
                } else {
                    temp.append(Character.toLowerCase(ch));
                }
            }

            result.append(temp).append(" ");
        }

        System.out.println(result.toString().trim());
	}

}
