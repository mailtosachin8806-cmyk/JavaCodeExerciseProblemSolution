package JattinSharma_JavaPractise_String;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;
/*
 * Jatin sdet, day 16
 */

public class manipulateJsonObject {
	
	@Test(description="To habdle a JSON Parsing ")
	public void handleParsingJson() {
		
		String JsonPayload = "{\r\n"
				+ "  \"orderId\": \"O1001\",\r\n"
				+ "  \"orderDate\": \"2025-05-10\",\r\n"
				+ "  \"customer\": {\r\n"
				+ "    \"name\": \"Bob Johnson\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"street\": \"123 Maple Street\",\r\n"
				+ "      \"city\": \"Anytown\",\r\n"
				+ "      \"state\": \"CA\",\r\n"
				+ "      \"zip\": \"90210\"\r\n"
				+ "    },\r\n"
				+ "    \"contact\": {\r\n"
				+ "      \"email\": \"bob.j@example.com\",\r\n"
				+ "      \"phone\": \"555-4567\"\r\n"
				+ "    }\r\n"
				+ "  },\r\n"
				+ "  \"items\": [\r\n"
				+ "    {\r\n"
				+ "      \"productId\": \"P001\",\r\n"
				+ "      \"productName\": \"Laptop\",\r\n"
				+ "      \"quantity\": 2,\r\n"
				+ "      \"price\": 999.99\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"productId\": \"P003\",\r\n"
				+ "      \"productName\": \"Keyboard\",\r\n"
				+ "      \"quantity\": 1,\r\n"
				+ "      \"price\": 75.5\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"associatedProblems\": [\r\n"
				+ "    {\r\n"
				+ "      \"problemName\": \"Diabetes\",\r\n"
				+ "      \"medications\": [\r\n"
				+ "        {\r\n"
				+ "          \"medicationName\": \"Aspirin\",\r\n"
				+ "          \"dose\": \"500 mg\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "          \"medicationName\": \"Metformin\",\r\n"
				+ "          \"dose\": \"850 mg\"\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"pending\"\r\n"
				+ "}";
		
		JSONObject jsonObject = new JSONObject(JsonPayload);
//		System.out.println(jsonObject.toString(2));
		
	
		/* First way to update a json value
		JSONArray itemsArray = jsonObject.getJSONArray("items");
		System.out.println(itemsArray.getJSONObject(0).toString(2));
		
		
		// to update a productName value
		itemsArray.getJSONObject(0).put("productName", "Desktop");
		System.out.println(itemsArray.getJSONObject(0).toString(2));
		
		*/
		
		//2nd way  to update a JSON value
		
		JSONArray itemsArray = jsonObject.getJSONArray("items");
		
		for(int i=0;i<itemsArray.length();i++) {
			JSONObject item = itemsArray.getJSONObject(i);
			
			if(item.getString("productName").equalsIgnoreCase("Laptop")) {
				item.put("productName", "Desktop");
			}
		}
		
		System.out.println(jsonObject.toString(2));
		
		
		
		
		
		
		
		
		
	}
}
