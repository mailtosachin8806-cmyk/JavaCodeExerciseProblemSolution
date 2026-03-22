package JattinSharma_JavaPractise_String;

import java.net.MulticastSocket;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class EncodeString {

	@Test
	public void EncodeString() {
		// TODO Auto-generated method stub
//Question no. 28
		
		String input = "ddmmmttta";
		StringBuilder sb = new StringBuilder();
		
		int count=1;
		for(int i=1;i<input.length();i++)
		{
			if(input.charAt(i) == input.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(input.charAt(i-1));
				sb.append(count);
				count=1;
			}
		}
		sb.append(input.charAt(input.length()-1));
		sb.append(count);
		System.out.println(sb);
	}
	
	@Test
	public void handleEncodeStringWithHanshMap() {
		
		String input = "ddmmmttta";
		char[] inputArray = input.toCharArray();
		HashMap<Character, Integer>result = new HashMap<Character, Integer>();
		
		for(char data : inputArray)
		{
			result.put(data, result.getOrDefault(data, 0)+1);
		}
		
		System.out.println(result);
		
		for(Map.Entry<Character, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
	}

}
