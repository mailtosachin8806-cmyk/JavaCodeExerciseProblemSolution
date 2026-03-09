package JattinSharma_JavaPractise;

import org.testng.annotations.Test;

public class EvenOrOdd {
	
	
	@Test(description= "Use a mathematical operation")
	public void handleEvenOrOdd() {
		
		int num =6;
		
		if(num% 2==0)
		{
			System.out.println("Is a Even Number");
		}
		else
		{
			System.out.println("Is a Odd Number");
		}
	}
	
	
	@Test(description = "Without mathematical operation")
	public void handleEvenorOdd() {
		
		int num =6;
		
		while(num>1) {
			num=num-2;
		}
		if(num==0) {
			System.out.println("Is a Even Number");
		}
		else {
			System.out.println("Is a Odd Number");
		}

		
		
		
		
		
		
		
	}

}
