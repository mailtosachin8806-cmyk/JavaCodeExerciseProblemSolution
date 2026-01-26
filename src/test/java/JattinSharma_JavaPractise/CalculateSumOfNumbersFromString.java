package JattinSharma_JavaPractise;

public class CalculateSumOfNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int no = Integer.parseInt("sachin"); here you will get NumberFormatException
		 */
		String input = "This is 1000 and it should be 20 30 40 50";

		String words[] = input.split(" ");
		int totalSum = 0;
		for (String word : words) {
			try {
				int number = Integer.parseInt(word);
				totalSum = totalSum + number;
				// System.out.println(word);
			} catch (NumberFormatException e) {
			}

		}
		System.out.println("The total sum is : " + totalSum);
	}
}
