package JattinSharma_JavaPractise;

public class CountUppercaseAndLowercase {
//Question 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "aAbBcCdDttgghhASDFGHJKLBN";
		System.out.println(input);
		
		int lowerCaseCount =0;
		int UpperCaseCount =0;
		
		char dataArray[] =input.toCharArray();
		
		for(char data:dataArray) {
			if(Character.isUpperCase(data))
			{
				UpperCaseCount++;
				
			}
			else if (Character.isLowerCase(data))
			{
				lowerCaseCount++;
			}
		}
		
		System.out.println("Input String " + input);
		System.out.println("Uppercase character " + UpperCaseCount);
		System.out.println("LowerCase character " + lowerCaseCount);
	}

}
