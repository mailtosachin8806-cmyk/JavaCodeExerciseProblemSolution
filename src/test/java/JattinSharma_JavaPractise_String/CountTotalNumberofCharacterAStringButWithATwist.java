package JattinSharma_JavaPractise_String;

public class CountTotalNumberofCharacterAStringButWithATwist {
//Question 12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="My name is sachin ";
		int count =0;
		
			char dataArray[]   = input.toCharArray();
			
			for(int index=0; index<dataArray.length;index++)
			{
				if(dataArray[index]==' ') {
					continue;
				}
				
			boolean whiteSpacePresentAfterTheChar = (index <dataArray.length-1) && dataArray[index+1]== ' ';
			boolean whiteSpacePresentBeforeTheChar = (index>0) && dataArray[index - 1] == ' ';
			
			if(!whiteSpacePresentAfterTheChar && !whiteSpacePresentBeforeTheChar) {
				count++;
			}
			}
			
			System.out.println("Count is: " + count );

	}

}
