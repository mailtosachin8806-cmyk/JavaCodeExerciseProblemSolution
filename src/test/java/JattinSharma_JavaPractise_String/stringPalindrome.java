package JattinSharma_JavaPractise_String;

import org.testng.annotations.Test;

public class stringPalindrome {

	@Test(description = "Check a string is valid palindrome or not")
	public void validPalindrome() {

		String input = "A man, a plan, a canal: Panama";
		StringBuilder sb = new StringBuilder();

		char array[] = input.toCharArray();

		for (char c : array) {
			if (Character.isLetterOrDigit(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}
		System.out.println(sb.toString());

		String cleanInput = sb.toString();
		String reversedInput = sb.reverse().toString();

		if (cleanInput.equals(reversedInput)) {
			System.out.println("Valid Palindrome");
		} else {
			System.out.println("Invalid Palindrome");
		}
	}

	@Test(description = "Check a string is valid palindrome or not by two pointer approach")
	public void validPalindromeTwoApproach() {
		String input = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(input));
	}

	private static boolean isPalindrome(String input) {

		char array[] = input.toCharArray();

		int left = 0;
		int right = array.length - 1;

		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(array[left])) {
				left++;
			}
			while (left < right && !Character.isLetterOrDigit(array[right])) {
				right--;
			}

			if (Character.toLowerCase(array[left]) != Character.toLowerCase(array[right])) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
