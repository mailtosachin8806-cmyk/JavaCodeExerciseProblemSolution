package JatinSharma_JavaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import dto.Employee;
import dto.NewEmployee;
import dto.Person;

public class Stream_Intermediate {

	@Test(description="Sort list of Employees By salary")
	public void sotEmployeeBySalary() {
		
		List<Employee> myList = Arrays.asList(
		new Employee(101,"John",5000),
		new Employee(102,"Alice",6000),
		new Employee(103,"Bob",8000),
		new Employee(104,"David",10000)
		);
		
		List<Employee> listAssending = myList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
		System.out.println(listAssending);
		
		List<Employee> listDssending = myList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
		System.out.println(listDssending);
	}
	
	@Test(description="Calculate the average age of a person list of person objects using java stream")
	
	public void  averageAgeExample()
	{
		
	List<Person> myPeopleList = Arrays.asList(
		new Person("Alice",25),		
		new Person("Bob",30),			
		new Person("Charlie",28),	
		new Person("David",35)
		);
		
	double avg = myPeopleList.stream().mapToInt(Person::getAge).average().orElse(0.0);
	System.out.println(avg);
	}
	
	@Test(description="Partition numbers in even and odd list")
	public void partitionEvenOdd() {
		
	List<Integer> numbers = Arrays.asList(2,9,8,7,1,5,11,10,18);
	
	Map<Boolean, List<Integer>> output= numbers.stream().sorted().collect(Collectors.partitioningBy(n -> n%2==0));
	
	System.out.println("Even Numbers : " + output.get(true));
	System.out.println("Odd Numbers : " + output.get(false));
	
	}
	
	@Test(description="Group a list of words by their length using stream")
	public void groupByLength() {
		
		List<String> words = Arrays.asList("Apple","Bat","Ball","Cat","Banana","Dog","Goat");
		Map<Integer, List<String>> output= words.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(output);
	}
	
	@Test(description="Count occurence of each element in a list")
	public void countOccurence() {
		List<String> words = Arrays.asList("Apple","Bat","Ball","Cat","Banana","Dog","Bat","Apple","Cat");
		
		Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
	}
	
	@Test(description="Group Employee By Department And Calculate Average By Salary")
	public void groupByDepartment() {
		
	List<NewEmployee>	myEmployeesList = Arrays.asList(
		 new NewEmployee(1, "John", "HR", 50000),
		 new NewEmployee(2, "Jane", "IT", 70000),		
		 new NewEmployee(3, "Mike", "IT", 80000),
		 new NewEmployee(4, "Sara", "Finance", 90000),
		 new NewEmployee(5, "Paul", "HR", 950000)
		);
		
	Map<String, Double> collectAssendOrder = myEmployeesList.stream()
	.collect(Collectors.groupingBy(NewEmployee::getDepartment,
			Collectors.averagingDouble(NewEmployee::getSalary)));
	
	System.out.println(collectAssendOrder);

	}
	
	@Test(description="Find the highest-paid employee in each  department")
	public void  highestSalaryInDept()
	{
		List<NewEmployee>	myEmployeesList = Arrays.asList(
				 new NewEmployee(1, "John", "HR", 50000),
				 new NewEmployee(2, "Jane", "IT", 70000),		
				 new NewEmployee(3, "Mike", "IT", 80000),
				 new NewEmployee(4, "Sara", "Finance", 90000),
				 new NewEmployee(5, "Paul", "HR", 950000)
				);
		
		Map<String, Optional<NewEmployee>> maxSalary = myEmployeesList.stream()
		.collect(Collectors.groupingBy(NewEmployee::getDepartment,
				Collectors.maxBy(Comparator.comparing(NewEmployee::getSalary))));
		
	//	System.out.println(maxSalary);
		maxSalary.forEach((dept, emp) ->
	    System.out.println(dept + " -> " + emp.get()));
		
		Map<String, Optional<NewEmployee>> minSalary = myEmployeesList.stream()
				.collect(Collectors.groupingBy(NewEmployee::getDepartment,
						Collectors.minBy(Comparator.comparing(NewEmployee::getSalary))));
		System.out.println("*******************");
		System.out.println(minSalary);
	}
	
	@Test(description="Find all departments with more than 2 employees")
	public void departmentEmployeeCount() {
		
		List<NewEmployee>	myEmployeesList = Arrays.asList(
				 new NewEmployee(1, "John", "HR", 50000),
				 new NewEmployee(2, "Jane", "IT", 70000),		
				 new NewEmployee(3, "Mike", "IT", 80000),
				 new NewEmployee(4, "Sara", "Finance", 90000),
				 new NewEmployee(5, "Paul", "HR", 950000),
				 new NewEmployee(6, "EVE", "IT", 850000),
				 new NewEmployee(7, "Saman", "Finance", 950000),
				 new NewEmployee(8, "Frank", "Sales", 950000),
				 new NewEmployee(9, "Ala", "Operation", 950000)
				);
		
		
		Map<String,Long> map = myEmployeesList.stream().collect(Collectors.groupingBy(NewEmployee::getDepartment,
				Collectors.counting()));
		
		System.out.println(map);
		
		List<String> list = map.entrySet().stream().filter(n -> n.getValue()>2).map(Map.Entry::getKey)
		.toList();
		
		System.out.println(list);
		
		List<String> list2 = myEmployeesList.stream().collect(Collectors.groupingBy(NewEmployee::getDepartment,
				Collectors.counting())).entrySet().stream().filter(n -> n.getValue()>2).map(Map.Entry::getKey)
		.toList();
		
		System.out.println(list2);
		
	}
	
	@Test(description="Find department with the highest average salary")
	
	public void highestAvgSalaryDept() {
		
		List<NewEmployee> myEmployeesList = Arrays.asList(
				 new NewEmployee(1, "John", "HR", 50000),
				 new NewEmployee(2, "Jane", "IT", 70000),		
				 new NewEmployee(3, "Mike", "IT", 80000),
				 new NewEmployee(4, "Sara", "Finance", 90000),
				 new NewEmployee(5, "Paul", "HR", 950000),
				 new NewEmployee(6, "EVE", "IT", 850000),
				 new NewEmployee(7, "Saman", "Finance", 550000),
				 new NewEmployee(8, "Frank", "HR", 650000),
				 new NewEmployee(9, "Ala", "Finance", 750000)
				);
		
		Map<String, Double> collect = myEmployeesList.stream().collect(Collectors.groupingBy(NewEmployee::getDepartment,
				Collectors.averagingDouble(NewEmployee::getSalary)));
		
		System.out.println(collect);
		
		Map.Entry<String, Double> stringDoubleEntry = collect.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
	
		System.out.println(stringDoubleEntry);
		
		Map.Entry<String,Double> collect2 = myEmployeesList.stream().collect(Collectors.groupingBy(NewEmployee::getDepartment,
				Collectors.averagingDouble(NewEmployee::getSalary)))
				.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();;
		
				System.out.println(collect2);
	}
	
	@Test(description="Find most frequent character in String")
	public void mostFrequent() {
		
		String input = "banana";
		
		Map<Character,Long> map = input.chars().mapToObj( c-> (char) c)
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		
		System.out.println(map);
		
		Map.Entry<Character, Long> characterLongEntry= map.entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElseThrow();
		System.out.println(characterLongEntry);
		
		Map.Entry<Character, Long> characterLongEntry2 = input.chars().mapToObj( c-> (char) c)
		.collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream()
		.max(Map.Entry.comparingByValue()).orElseThrow();
		
		System.out.println(characterLongEntry2);
	}
	
	@Test(description="Find first no repeating character in a string")
	public void firstNonRepeatingCharStream() {
		String input = "swiss";
		
		Optional<Map.Entry<Character, Long>> first = input.chars().mapToObj(c -> (char)c).collect(
				Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting())).entrySet().stream()
		.filter(entry -> entry.getValue()==1).findFirst();
		
		System.out.println(first);
	}
}
