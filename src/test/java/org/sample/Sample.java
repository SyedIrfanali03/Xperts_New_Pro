package org.sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.utilities.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.Iterator;

public class Sample {
	
	
	
	@Test
	private void tc() {
		
		//post - create request // baseuri, resource, parameters key value, body, method post
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String addPlace = given().log().all().queryParam("key", "qaclick123").
		header("Content-Type", "application/json").
		body(Payload.addPlace()).
		when().
		post("/maps/api/place/add/json").
		then().log().all().assertThat().
		statusCode(200).extract().asString();
		
		
		JsonPath j = new JsonPath(addPlace);
		String pId = j.getString("place_id");
		System.out.println(pId);
		
		//get
		
		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", pId).
		when().get("/maps/api/place/get/json") 
		.then().log().all().assertThat().statusCode(200);
		
		
		
		//put
		
		given().log().all().queryParam("key", "qaclick123")
		.body(Payload.update(pId))
		.when().put("/maps/api/place/update/json").
		then().log().all().assertThat().statusCode(200);
		
		//Delete
		
		given().log().all().queryParam("key", "qaclick123").body(Payload.delete(pId))
		.when().delete("/maps/api/place/delete/json")
		.then().log().all().assertThat().statusCode(200);
		
		//get
//		
//		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", pId).
//		when().get("/maps/api/place/get/json") 
//		.then().log().all().assertThat().statusCode(200);
//		

	}
	
	
	
	@Test
	private void tc1() {
		
		
		JsonPath js = new JsonPath(Payload.response());
		
		
		//1. Print No of courses returned by API
		
		int count = js.getInt("courses.size()");
		System.out.println("Number of Courses : " + count);
		
		
		//2.Print Purchase Amount
		
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println("PurchaseAmount: " + purchaseAmount);
		
		
		//3. Print Title of the first course
		
			String firstCourse = js.getString("courses[0].title");
			System.out.println("First Course Title : " + firstCourse);
		
		
		//4. Print All course titles and their respective Prices
			
			for (int i = 0; i < count; i++)
			{
				String title = js.getString("courses["+ i +"].title");
				
				int price = js.getInt("courses["+ i +"].price");
				
				System.out.println(title + ":"  + price);
			}
		
		
		//5. Print no of copies sold by RPA Course
		
			for (int i = 0; i < count; i++)
			{
				String title = js.getString("courses["+ i +"].title");
				
				if(title.equalsIgnoreCase("RPA"))
				{
					int copies = js.getInt("courses["+ i +"].copies");	
					System.out.println("RPA Copies: " + copies);
					
					break;
				}
				
			}
			
			
			//6. Verify if Sum of all Course prices matches with Purchase Amount
		
		

			int purchaseAmounts = js.getInt("dashboard.purchaseAmount");
			
			int sum  = 0;
			
			for (int i = 0; i < count; i++) 
			{
				
				int price = js.getInt("courses["+ i +"].price");
				int copies = js.getInt("courses["+ i +"].copies");
				
				
				int amount = price * copies;
				
				sum = sum + amount;
				
				
			}
			
			System.out.println("Calculated Amount: " + sum);
			System.out.println("Purchase Amount: " + purchaseAmounts);
			
			Assert.assertEquals(sum, purchaseAmounts);
		
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
