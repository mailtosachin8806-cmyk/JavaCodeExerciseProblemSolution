package JattinSharma_JavaPractise_String;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequenciesOfWordsInString {
//Question 13
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Hello my Name is Sachin Sachin";
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		
		String inputArray[] = input.split(" ");
		
		for (String data:inputArray)
		{
			result.put(data, result.getOrDefault(data, 0)+1);
		}
		System.out.println(result);
		
		for( Map.Entry<String, Integer> entry : result.entrySet())
		{
		System.out.println(entry.getKey() + " " + entry.getValue());	
		}
		
	}

}
