package JattinSharma_JavaPractise_String;

public class CountUppercaseAndLowercase {
//Question 9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "aAbBcCdDttgghhASDFGHJKLBN";
		System.out.println(input);
		
		int lowerCaseCount = 0;
		int UpperCaseCount = 0;
		String lowerString = "" ;
		String upperString = "";
		char dataArray[] =input.toCharArray();
		
		for(char data:dataArray) {
			if(Character.isUpperCase(data))
			{
				UpperCaseCount++;
				upperString = upperString + data;
				
			}
			else if (Character.isLowerCase(data))
			{
				lowerCaseCount++;
				lowerString = lowerString +data;
			}
		}
		
		System.out.println("Input String " + input);
		System.out.println("Uppercase character " + UpperCaseCount);
		System.out.println("LowerCase character " + lowerCaseCount);
		System.out.println(lowerString);
		System.out.println(upperString);
	}

}
