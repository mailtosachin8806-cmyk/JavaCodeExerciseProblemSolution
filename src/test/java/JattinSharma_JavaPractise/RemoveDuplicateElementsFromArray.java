package JattinSharma_JavaPractise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Set:- Always store a unique value 2.HashSet :- Always store a unique value
		 * but the order is not maintained. 3. TreeSet :- Always store a unique value
		 * but retrieve the data in the assending order. 4. LinkedHashSet :- Unique
		 * value and it will preserve the order
		 */

		int a[] = { 20, 30, 10, 20, 40, 90, 50, 10, 60 };
		System.out.println(Arrays.toString(a));
		// output [20, 30, 10, 40, 90, 50, 60]
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		Integer i = new Integer(20);
		int data2 = i.intValue();

		for (int data : a) {
			dataSet.add(data);
		}
		System.out.println(dataSet);

		System.out.println("Convert Dataset into Array");

		// We can use stream to convert set into array

		int result[] = dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));

		System.out.println("Remove duplicate elements from array without using Set");

		a = Arrays.stream(a).distinct().toArray();

		System.out.println(Arrays.toString(a));

	}

}
