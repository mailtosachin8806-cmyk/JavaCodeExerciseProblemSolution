package JattinSharma_JavaPractise;

public class ReverseCharacterOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question19
		
		String input = "This is fun";
		String words[]= input.split(" ");
		String result = " ";
		for(String word:words)
		{
		 char[] Character = word.toCharArray();
		 int left= 0;
		 int right = Character.length-1;
		 char temp;
		 while(left<right)
		 {
			 temp= Character[left];
			 Character[left] = Character[right];
			 Character[right] = Character[left];
			 Character[right] = temp;
			 left++;
			 right--;		 
		 }
		 
		 result = result + new String(Character) + " ";	 
		}
		
		System.out.println("Original String :" + input );
		
		System.out.println("Reverse String :" + result.trim() );
		
		
		
		
		
	}

}
