package JattinSharma_JavaPractise_String;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

/*
 * Day 18
 */
public class ManipulateList {
	
	@Test (description="Manipulate a List")
	public void handleManipulationList() {
		
	List <Integer> numberList	= Arrays.asList(1,22,32,123,null,100,132);
	
	List <Integer> numberList2 = numberList.stream().filter(i -> Objects.nonNull(i))
			.filter( i -> i.toString().startsWith("1"))
			.collect(Collectors.toList());
	
	System.out.println(numberList2);
		
	}

}
