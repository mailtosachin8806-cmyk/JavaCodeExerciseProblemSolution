package RahulShetty_JavaPractise;

import org.json.JSONObject;

public class manipulateJson2 {
	
	public static void main(String[] args) {
		String jsonPayload = "{\r\n"
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
				+ "      \"price\": 75.50\r\n"
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
		
		JSONObject jsonObject= new JSONObject(jsonPayload);
		
		System.out.println(jsonObject.toString());
		
		
	}

}
