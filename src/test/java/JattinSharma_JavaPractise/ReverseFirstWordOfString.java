package JattinSharma_JavaPractise;

import java.util.Arrays;

public class ReverseFirstWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hello World from Sachin";
		reverseFirstWord(input);
	}
	
	public static void reverseFirstWord(String input) {
		if(input==null || input.isEmpty()) {
		System.out.println(input);
	}
		else {
		String words[]	= input.split(" ",2);
		//split array in 2 forms
//		for (String word : words) {
//			System.out.println(word);
//		}
//		
		char[] charArray = words[0].toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		int left=0;
		int right = charArray.length-1;
		
		while(left<right)
		{
		char temp=	charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = temp;
		left++;
		right--;
		}
		String reverseWord = new String(charArray);
		System.out.println(input);
		System.out.println(reverseWord + " " + words[1]);

}
	}
}