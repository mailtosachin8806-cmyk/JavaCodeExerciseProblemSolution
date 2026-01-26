package JattinSharma_JavaPractise;

import java.util.Arrays;

public class ReArrangeEvenAndOddNumber {
	public static void main(String[] args) {

		int a[] = {1,4,2,5,7,3,8,9,13,12};
		int left =0;
		int right = a.length-1;
		
		System.out.println("Start: " + Arrays.toString(a));
		
		while(left<right)
		{
			while(left < right && a[left]%2==0)
			{
				left++;
			}
			
			while(left < right && a[right]%2 !=0)
			{
				right--;
			}
			
			if(left<right) {
				int temp = a[left];
				a[left]= a[right];
				a[right]=temp;
				
			}
			
	//		System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
		
		
		int evenEnd = 0;
		while(evenEnd <a.length && a[evenEnd]%2==0)
		{
			evenEnd++;
		}
		
		Arrays.sort(a, 0, evenEnd);//Sort a even part
		Arrays.sort(a, evenEnd,a.length);//Sort a odd part
		
		System.out.println("End : " + Arrays.toString(a));
	}
}
