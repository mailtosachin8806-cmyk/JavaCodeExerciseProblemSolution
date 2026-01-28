package JattinSharma_JavaPractise;

import java.util.HashMap;
import java.util.Map;
//Question 5
public class Reverse_Map {

	public static void main(String[] args) {
		//Map is a assosciative array.Which store a data in a key value pair, key should be unique.
		//Syntax:- 
		//HashMap<String,Integer> ojmap = new HashMap<String,Integer>();
		//Reverse Map means -> converting <K,V> value into <V,K>
		
		
		Map<String, Integer> ogMap = new HashMap<String, Integer>();
		
		ogMap.put("A", 1);
		ogMap.put("B", 2);
		ogMap.put("C", 3);
		System.out.println(ogMap);
		System.out.println("Now reverse a map");

		Map<Integer,String> reverseMap = new HashMap<Integer,String>();
		for (Map.Entry<String, Integer> data : ogMap.entrySet())
		{
			reverseMap.put(data.getValue(), data.getKey());
		}
		System.out.println(reverseMap);
	}

}
