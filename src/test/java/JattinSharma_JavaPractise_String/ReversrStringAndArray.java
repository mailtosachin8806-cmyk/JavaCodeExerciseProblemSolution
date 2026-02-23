package JattinSharma_JavaPractise_String;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReversrStringAndArray {
	
	
	@Test(description = "Reverse a string")
	public void reverseString()
	{
		String input = "Hello" ;
		char charArray[] = input.toCharArray();
		
		for(int i=0;i<=charArray.length-1; i++)
		{
			System.out.print(charArray[i]);
		}
		
		System.out.println("");
		for(int index=charArray.length-1; index>=0;index--)
		{
			System.out.print(charArray[index]);
		}
	}
	
	@Test(description = "Reverse a string through string buider")
	public void ReverseStringBuilder()
	{
		String input = "Hello" ;
		StringBuilder sb = new StringBuilder();
		char charArray[]=input.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--)
		{
			sb.append(charArray[i]);
		}
		
		System.out.println(input);
		System.out.println(sb);
	}
	
	@Test(description = "Reverse a string by two pointer approach")
	public void ReverseStringByPointer() {
		String input = "Hello";
		char[] charArray = input.toCharArray();
		System.out.println(Arrays.toString(charArray));

		int left = 0;
		int right = charArray.length - 1;
		char temp;
		while (left < right) {
			// Swap

			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;

		}
		System.out.println(Arrays.toString(charArray));
	}
	
	@Test(description="Reverse a Array by two pointer approach")
	public void reverseArray() {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		int left = 0;
		int right = arr.length - 1;
		int temp;

		while (left < right) {
			// swap
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		System.out.println(Arrays.toString(arr));

	}
	
	@Test(description = "Reverse an array")
	public void reverseString1() {
		
		String[] input = {"Anindita", "is", "in", "the", "Interview"};
		System.out.println(Arrays.toString(input));
		int left = 1;
		int right = input.length-2;
		String temp;
		while(left<right)
		{
			temp = input[left];
			input[left]= input[right];
			input[right]= temp;
			left ++;
			right --;
		}
		System.out.println(Arrays.toString(input));
	}
	

}
