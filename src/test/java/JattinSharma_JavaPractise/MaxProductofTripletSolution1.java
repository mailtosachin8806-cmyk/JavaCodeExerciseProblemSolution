package JattinSharma_JavaPractise;

import java.util.Arrays;

public class MaxProductofTripletSolution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question no. 25

		int a[] = { -10, -3, 5, 6, -20 };
		// Step 1 : Sort the array
		Arrays.sort(a); // [-20, -10, -3, 5, 6]

		int n = a.length;
		if (n < 3) {
			System.err.println("Minium number of elements that should be there in the array should be 3");
			System.exit(0);
		}

		System.out.println(Arrays.toString(a));
		int resultOne = a[n - 1] * a[n - 2] * a[n - 3];
		System.out.println("The result one is: " + resultOne);

		int resultTwo = a[0] * a[1] * a[n - 1];
		System.out.println("The result second is : " + resultTwo);

		int result = Math.max(resultOne, resultTwo);
		System.out.println("THe maximum number is : " + result);
	}

}
