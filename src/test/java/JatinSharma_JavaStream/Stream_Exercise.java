package JatinSharma_JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class Stream_Exercise {
	
	@Test (description= "Filter Even and Odd Numbers from array list")
	public void filterEvenNumber() {
		//Filter => It is a intermediate operation.
		//Collect => It is a terminal operation
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);	
		List<Integer> result =  numberList.stream().filter(i-> i%2==0).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	
	@Test(description = "Convert Numbers in list to their squares")
	public void squareNumbers() {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> result = numberList.stream().map(n -> n*n).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	
	@Test(description= "Square Even Number from List")
	
	public void sqaureEvenNumbers() {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
	//	List<Integer> result = numberList.stream().filter(n -> n%2==0).map( n-> n*n).collect(Collectors.toList());
		List<Integer> result = numberList.stream().filter(n -> n%2==0).map( n-> n*n).toList();
		
		result.forEach(System.out::println);
	}
	
	@Test(description ="Find the first number greater than 10 from list")
	
	public void findFirstNumberGreaterThan() {
		
		List<Integer> numberList = Arrays.asList(3,7,12,5,11,20);
	//** Optional<T> was introduced in Java 8 to represent a value that may or may not be present. 
	//	  It helps avoid NullPointerException and makes the code more expressive. //
		
		Optional<Integer> result= numberList.stream().filter(n -> n>10)
		.sorted()
		.findFirst();
		
		System.out.println(result.get());
		
	}
	
	@Test(description ="Count the number greater than 5 from list")
	public void countGreaterThan() {
		
		List<Integer> numberList = Arrays.asList(1,3,2,4,5,6,7,8,9,11,13,15);
		
		long result = numberList.stream().filter(n -> n>5).count();
		System.out.println(result);
	}
	
	
	@Test(description ="Find sum and producy of all the numbers")
	public void sumOfElements() {
		List<Integer> numberList = Arrays.asList(1,2,3,4,5);
		
		Integer sum = numberList.stream().reduce(0,(a,b)-> a+b);
		Integer product = numberList.stream().reduce(1,(a,b)-> a*b);
		
		System.out.println(sum);
		System.out.println(product);
	}
	
	@Test(description ="Find sum of even numbers in List")
	public void sumEvenNumber() {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer sum = numberList.stream().filter(n-> n%2==0).reduce(0,(a,b)-> a+b);
		System.out.println(sum);
	}
	
	@Test(description ="Find the Maximum number in List")
	
	public void MaxNumber() {
	
	List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,9,8);
	
	Integer maxNumber = numberList.stream().reduce(0,(a,b)-> Integer.max(a, b));
	System.out.println(maxNumber);
	
	Optional<Integer> max = numberList.stream().reduce(Integer::max);
	System.out.println(max.get());
	
	}
	
	@Test(description ="Sum of Square of Even numbers in List")
	public void EvenSquareSum () {
		
	List<Integer> numberList = Arrays.asList(1,2,4,6,7,5,8,10);
	
//	Integer sum = numberList.stream().filter( n -> n%2==0).map( n-> n*n).reduce(0,(a,b)-> a+b);
	Optional<Integer> sum = numberList.stream().filter( n -> n%2==0).map( n-> n*n).reduce(Integer::sum);
	System.out.println(sum.get());
	}
	
	@Test(description="Find distinct element from a list")
	public void findDistinctElements() {
		
		List<Integer> numberList = Arrays.asList(5,2,8,2,5,9,3);
		
		List<Integer> list = numberList.stream().sorted().distinct().toList();
		System.out.println(list);
		
	}
	
	@Test(description="Find Average of all numbers in a list")
	
	public void findAverage() {
		
		List<Integer> numberList = Arrays.asList(5,10,15,20,25);
		double avg = numberList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
	}
	
	@Test(description="Sort a list of integers in assending and descending order using stream")
	
	public void sortLists () {
		
		List<Integer> numberList = Arrays.asList(5,3,9,6,1,7,2);
		numberList.stream().sorted().forEach(System.out::println);
		
		numberList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	
	@Test(description="Count how many string start with a specific letter A")
	
	public void countStartWithA() {
		List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
		
		List<String> list = fruits.stream().filter(n -> n.startsWith("A")).toList();
		System.out.println(list);
		
		long count = fruits.stream().filter(n -> n.startsWith("A")).count();
		System.out.println(count);
	}
	
	@Test(description = "Join all strings in a list into a single comma-seprated string")
	public void joinStringExamples() {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Avocado","Mango","Apricot");
		
		String collect = fruits.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(collect);
	}
	
	@Test(description = "Check if all elements are positive numbers")
	public void allPositiveExample() {
		 
		List<Integer> numbers =	Arrays.asList(1,2,3,4,5,6,-7);
		
		boolean match = numbers.stream().allMatch(n -> n>0);
		System.out.println(match);
	}
	
	@Test(description = "Check if any number is divisible by 3")
	public void numberDivisibleBy () {
		
	List<Integer> numberList = Arrays.asList(5,7,9,11,13);
	
	boolean match = numberList.stream().anyMatch(n -> n %3==0);
	System.err.println(match);
	}
	
	@Test(description="Flatten the list of list")
	public void flattenExample() {
		
		List<List<Integer>> listOfLists = Arrays.asList(
		Arrays.asList(1,2,3),
		Arrays.asList(4,5),
		Arrays.asList(6,7,8)
		);
		
		List<Integer> list = listOfLists.stream().flatMap(List::stream).toList();
		System.out.println(list);
	}
	
	@Test(description="Find the first non-empty string in a list")
	public void firstNonEmpty() {
	List<String> myList = Arrays.asList("","","Hello","World","");
	myList.stream().filter(n -> !n.isEmpty()).toList().forEach(System.out::println);
	
	Optional<String> firstNumber= myList.stream().filter(n-> !n.isEmpty()).findFirst();
	
	System.out.println(firstNumber.get());
	}
	
	@Test(description="Find the second highest number  in a list using stream")
	
	public void secondHighestNumber() {
		List<Integer> numbers = Arrays.asList(5,6,11,12,13);
		Optional<Integer> first= numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(first.get());
	}
}
