package JattinSharma_JavaPractise;

import java.util.Arrays;

public class ArrayProblems {
//Question 16
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Calculate the total sum of all elements.
		 * 2. Largest and second largest number
		 * 3. Reverse the first half of the array
		 */
	//	int b[] = new int [5];
		int a[]= {1,2,3,4,5,6,7,6,5,4,3};
		System.out.println("Orginal Array is : " + Arrays.toString(a));
		//Calculate the total sum of the array
		int totalSum = 0;
		for(int value : a)
		{
			totalSum = totalSum + value;
		}
		System.out.println("The total sum is :" + totalSum);
		
		int totalNumberOfElements = a.length;
		
		double avg = ((double)totalSum)/totalNumberOfElements;
		
		System.out.println("AVg : " + avg);
		//Largest and second largest number
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MAX_VALUE;
		
		for(int number:a) {
			if(number>largest)
			{
				secondlargest = largest;
				largest = number;
			}
			else if(number>secondlargest &&number!=largest)
			{
				secondlargest = number;
			}
	}
		
		System.out.println("Largest Number : " + largest);
		System.out.println("Second Largest Number : " + secondlargest);
		
		//Reverse the first half of the array
		int left = 0;
		int mid = a.length/2;
		int right = mid-1;
		int temp;
		
		while(left<right) {
			temp=a[left];
			a[left]= a[right];
			a[right] = temp;
			left++;
			right--;
		}
		
		System.out.println("Half Reverse Array is: " + Arrays.toString(a));
		
		
		//Reverse the second half ot the array
		
		int secondleft= mid;
		
		int secondright = a.length-1;
		int secondtemp;
		while(secondleft<secondright)
		{
			secondtemp = a[secondleft];
			a[secondleft]= a[secondright];
			a[secondright]= secondtemp;
			secondleft++;
			secondright -- ;
		}
		
		System.out.println("Second Half Reverse Array is: " + Arrays.toString(a));		
	}
}
