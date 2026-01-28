package JattinSharma_JavaPractise;

import java.util.HashMap;
import java.util.Map;

public class CountTheFrequenciesOfCharacterInString {
//Question 13
	public static void main(String[] args) {
		// 

		String input = "aabbccddeeff";
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();

		for (char c : input.toCharArray()) {
			result.put(c, result.getOrDefault(c, 0) + 1);
		}

		System.out.println(result);

		for (Map.Entry<Character, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
