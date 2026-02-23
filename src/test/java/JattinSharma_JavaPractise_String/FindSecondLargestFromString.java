package JattinSharma_JavaPractise_String;

public class FindSecondLargestFromString {
//Question 10
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
		/*
		 * How to get ASCII value
		 */
//		char temp='3'; //5 ASCII value for character 51-48=3
//	//	int number = temp;
//		int number = temp- '0'; //51-48 = 3
//		System.out.println(number);
		int num;
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(char character:data) {
			if(Character.isDigit(character))
			{
				num= character-'0'; //convert char into a number
				if(num>first) {					
					second=first;
					first= num;
				}
				else if(num>second && num<first) {
					second=num;
				}
			}
		}
		
		System.out.println("The second largest number: "+ second);
				
		for(char character:data) {
			if(Character.isDigit(character))
			{
				System.out.println(character);
			}
		}
	}
}
