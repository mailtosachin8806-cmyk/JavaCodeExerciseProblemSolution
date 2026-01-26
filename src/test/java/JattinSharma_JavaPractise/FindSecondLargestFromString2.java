package JattinSharma_JavaPractise;

import java.util.TreeSet;

public class FindSecondLargestFromString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * how to convert a char to int --> int x = char-'0'
 */
		
		String input = "abc123de05";
		findSecondLargest(input);		
	}
	public static void findSecondLargest(String input) {
		
		char data[]=input.toCharArray();
		int num;
		TreeSet<Integer> dataSet = new TreeSet<Integer>();
		for(char character:data) {
			if(Character.isDigit(character))
			{
				num = character-'0'; //convert the character into array
				dataSet.add(num);
			}
		}
		System.out.println("The data set " + dataSet);
		dataSet.pollLast(); //Remove last element of treeset
		System.out.println("The data set " + dataSet);
		System.out.println(dataSet.last());
		
		
	}
}
