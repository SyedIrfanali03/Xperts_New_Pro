package org.utilities;

public class Payload {
	
	
	public static String addPlace() {
		
		String add = "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Infosys Technologies\",\r\n"
				+ "  \"phone_number\": \"(+91) 123 456 7890\",\r\n"
				+ "  \"address\": \"29, side mumbai, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"herbal park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "";
		
		
		return add;

	}
	
	
	public static String update(String pId) {
		
		String updates = "{\r\n"
				+ "\"place_id\":\""+pId+"\",\r\n"
				+ "\"address\":\"70 Summer walk, USA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "";
		
		
		return updates;
	}
	
	
	
	public static String delete(String pId) {
		
		String delete = "{\r\n"
				+ "    \"place_id\":\""+pId+"\"\r\n"
				+ "}\r\n"
				+ "";
			return delete;
	}
	
	
	
	
	public static String response() {
		
		String dummy ="{\r\n"
				+ "  \"dashboard\": {\r\n"
				+ "    \"purchaseAmount\": 910,\r\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\r\n"
				+ "  },\r\n"
				+ "  \"courses\": [\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Selenium Python\",\r\n"
				+ "      \"price\": 50,\r\n"
				+ "      \"copies\": 6\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Cypress\",\r\n"
				+ "      \"price\": 40,\r\n"
				+ "      \"copies\": 4\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"RPA\",\r\n"
				+ "      \"price\": 45,\r\n"
				+ "      \"copies\": 10\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}\r\n"
				+ ""; 
		return dummy;

	}
	
	
	public static String token() {
		
		String tok = "ATATT3xFfGF0ZSXkJchlcLs8pIn-j48VEZj96zTUt7Luq68csIJHDKyLU00Nrr-O0UJDkZrWvkBiYhn-5j1IYHCTCkDxLAbVKghNzSaeD1sxSiAC6VCOIUZHGQrCZFoPLW4cWyno8WhWTMtZW7olci--9HqJz-xpo9BBXNJiQ-WcniCriAo9c1M=7BE4B80E";

	return tok;
	
	}
	
	public static String issue() {
		
		String is = "{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"project\": {\r\n"
				+ "      \"key\": \"SCRUM\"\r\n"
				+ "    },\r\n"
				+ "    \"summary\": \"Login page issue\",\r\n"
				+ "    \"description\": {\r\n"
				+ "      \"type\": \"doc\",\r\n"
				+ "      \"version\": 1,\r\n"
				+ "      \"content\": [\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"paragraph\",\r\n"
				+ "          \"content\": [\r\n"
				+ "            {\r\n"
				+ "              \"type\": \"text\",\r\n"
				+ "              \"text\": \"Valid username and invalid password allows login.\"\r\n"
				+ "            }\r\n"
				+ "          ]\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    },\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "      \"name\": \"Bug\"\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
		
		return is;

	}
	
	public static String update() {
		
		String upd ="{\r\n"
				+ "  \"fields\": {\r\n"
				+ "    \"summary\": \"Updated Login page issue\",\r\n"
				+ "    \"description\": {\r\n"
				+ "      \"type\": \"doc\",\r\n"
				+ "      \"version\": 1,\r\n"
				+ "      \"content\": [\r\n"
				+ "        {\r\n"
				+ "          \"type\": \"paragraph\",\r\n"
				+ "          \"content\": [\r\n"
				+ "            {\r\n"
				+ "              \"type\": \"text\",\r\n"
				+ "              \"text\": \"Updated description: Login page validation is not working properly.\"\r\n"
				+ "            }\r\n"
				+ "          ]\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
		
		return upd;

	}
	
	
	public static String comment() {
		
		String cmd = "{\r\n"
				+ "  \"body\": {\r\n"
				+ "    \"type\": \"doc\",\r\n"
				+ "    \"version\": 1,\r\n"
				+ "    \"content\": [\r\n"
				+ "      {\r\n"
				+ "        \"type\": \"paragraph\",\r\n"
				+ "        \"content\": [\r\n"
				+ "          {\r\n"
				+ "            \"type\": \"text\",\r\n"
				+ "            \"text\": \"Testing completed successfully\"\r\n"
				+ "          }\r\n"
				+ "        ]\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "}";
		
		
		return cmd;

	}
	
	

}
