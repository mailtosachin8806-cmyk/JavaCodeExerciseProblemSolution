package JattinSharma_JavaPractise;

import java.util.Arrays;

public class RotateArrayRightByTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question no. 18
		
		int a[]= {1,2,3,4,5,6,7};
		//Rotate the array 3 times
		int n=3;
		int k= n % a.length;
		//Reverse Array	
	//	int k=3;
		int left = 0;
		int right = a.length-1;
		a = reverse(a,left,right);		
		System.out.println(Arrays.toString(a));
		
		a = reverse(a,0,k-1);
		System.out.println(Arrays.toString(a));
		
		a = reverse(a,k,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static int[] reverse(int[] a, int left , int right) {
		// TODO Auto-generated method stub
		int temp;
		while(left < right) {
			temp = a[left];
			a[left]= a[right];
			a[right]= temp;
			left++;
			right --;
			
		}
		return a;
		
	}

}
