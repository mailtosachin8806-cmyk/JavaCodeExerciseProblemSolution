package JattinSharma_JavaPractise_String;

public class ReverseCharacterOfWordsUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question19
		
		String input = "This is fun";
		String words[] = input.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			char[] Character = word.toCharArray();
			int left = 0;
			int right = Character.length - 1;
			char temp;
			while (left < right) {
				temp = Character[left];
				Character[left] = Character[right];
				Character[right] = temp;
				left++;
				right--;
			}

			sb.append(Character).append(" ");
		}

		System.out.println("Original String : " + input);

		System.out.println("Reverse String : " + sb);		
	}

}
