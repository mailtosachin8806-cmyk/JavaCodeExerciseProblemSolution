package JattinSharma_JavaPractise;

import org.testng.annotations.Test;

public class JavaStringLengh {
	
	@Test(description="Length of string using tochararray()")
	public void javaStringLenght() {
		
		String data = "sachin";
		System.out.println(data.length());
		
		char character[] =data.toCharArray();
		int count=0;
		for(char x:character)
		{
			count++;
			
		}
		System.out.print(count);
		
	}
	
	@Test(description="Length of string without using tochararray()")
	public void withoutcharacterArray() {
		
		String data1 ="Hello World";
		System.out.println(data1.length());
		int count  = 0;
		
		while(true) {
			try {
			data1.charAt(count);
			count++;
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(count);
				break;
			}
		}
	}
	
	

}
