package JattinSharma_JavaPractise;

public class LeaderNumbers {
//Questin no. 23
	
	public static void main(String[] args) {
		
		int a[] = {19,16,17,4,3,5,2};
		
		int length= a.length;
		int maxRight = a[length-1];
		
		System.out.println("Max Right " + maxRight);
		
		for(int index=length-2; index>=0;index--)
		{
		//	System.out.println(a[index]);
			
			if(a[index]>maxRight)
			{
				maxRight=a[index];
				System.out.println(maxRight);
			}	
		}
		
	}
}
