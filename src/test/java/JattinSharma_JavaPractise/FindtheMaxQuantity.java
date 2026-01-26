package JattinSharma_JavaPractise;

import java.util.HashMap;
import java.util.Map;

public class FindtheMaxQuantity {
	public static void main(String[] args) {
		// Question number :- 27

		String a[] = { "xyz 9", "abc 10", "xyz 21","erd 784" };
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (String s : a) {
			String data[] = s.split(" ");
			String name = data[0];
			int quantity = Integer.parseInt(data[1]);
			System.out.println(name);
			System.out.println(quantity);
			hmap.put(name, hmap.getOrDefault(name, 0) + quantity);
		}

		System.out.println(hmap);
		
		String product ="";
		int maxQuantity = 0;
		
		for(Map.Entry<String, Integer>entryset : hmap.entrySet())
		{
			if(entryset.getValue()>maxQuantity)
				maxQuantity  =	entryset.getValue();
				product		 =	entryset.getKey();
		}
		
		System.out.println("product : " + product + " maxQuantity : " + maxQuantity);
		
		
		
		

	}
}
