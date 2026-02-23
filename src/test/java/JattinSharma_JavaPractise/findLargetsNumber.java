package JattinSharma_JavaPractise;

import org.testng.annotations.Test;

public class findLargetsNumber {
	
	@Test
	public void findSecondandFirstLargestNumber() {
		
		int[] arr = {10,2,50,25,15};
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num:arr)
		{
			if(num>firstMax)
			{
				secondMax = firstMax;
				firstMax = num;
			}
			else if(num>secondMax && num <= firstMax)
			{
				secondMax = num;
			}
		}
		System.out.println("The first maximum number is: "+ firstMax);
		System.out.println("The second maximum number is: "+ secondMax);
		
	}
	
		@Test
		public void findThirdSecondFirstMax() {
		
		int[] arr = {2,2,2,2,2,2};
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for(int num:arr)
		{
			if(num>firstMax)
			{
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			}
			else if(num>secondMax && num <= firstMax)
			{
				thirdMax = secondMax;
				secondMax = num;
			}
			
			else if(num>thirdMax && num<=secondMax) {
				thirdMax = num;
			}
			
		}
		System.out.println("The first maximum number is: "+ firstMax);
		System.out.println("The second maximum number is: "+ secondMax);
		System.out.println("The third maximum number is: "+ thirdMax);
		
	}
	}


