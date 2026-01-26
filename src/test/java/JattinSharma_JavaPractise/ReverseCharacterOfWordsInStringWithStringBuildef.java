package JattinSharma_JavaPractise;

public class ReverseCharacterOfWordsInStringWithStringBuildef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Question20	
		String input  = "This is Fun";
		String words[]= input.split(" ");
		
		StringBuilder result = new StringBuilder();
		for(String word:words)
		{
			StringBuilder reverseWords = new StringBuilder(word);
			result.append(reverseWords.reverse().append(" "));
		}
		
		System.out.println(result);

	}

}
