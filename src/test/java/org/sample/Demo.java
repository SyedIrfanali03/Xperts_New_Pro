package org.sample;

import org.ser.Course;
import org.ser.getCourseDetails;
import org.testng.annotations.Test;
import org.utilities.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class Demo {
	
	
	
	private void kavitha() {
		
		System.out.println("Hi this is kavitha");

	}
	
	
	
	
	
	
	
	
	
	@Test
	private void tc() {
		
//		
////		//To get the all issue from jira
////		
////		RestAssured.baseURI = "https://irfanxpertedge.atlassian.net";
////		
////		given().log().all().queryParam("jql", "project = SCRUM ORDER BY created ASC")
////		.queryParam("maxResults", 20).
////		header("Accept","application/json").
////		auth().preemptive().basic("irfanxpertedge@gmail.com", Payload.token()).
////		when().get("/rest/api/3/search/jql").then().
////		log().all().assertThat().statusCode(200);
////		
//		
//		//Post create issue from jira
//
//		RestAssured.baseURI = "https://irfanxpertedge.atlassian.net";
//		
////		
////		given().log().all().header("Content-Type","application/json")
////		.header("Accept","application/json")
////		.auth().preemptive().basic("irfanxpertedge@gmail.com", Payload.token())
////		.body(Payload.issue())
////		.when().post("/rest/api/3/issue")
////		.then().log().all().assertThat().statusCode(201);
////		
//		
//		//put 
//	
////		 given().log().all().pathParam("issue", "SCRUM-2").header("Content-Type","application/json")
////		.header("Accept","application/json")
////		.auth().preemptive().basic("irfanxpertedge@gmail.com", Payload.token())
////		.body(Payload.update())
////		.when().put("/rest/api/3/issue/{issue}").then().log().all().assertThat().statusCode(204);
//		
//		
//		//delete
//		
//		
////		given().log().all().pathParam("issue", "SCRUM-2")
////		.header("Content-Type", "application/json")
////		.header("Accept","application/json")
////		.auth().preemptive().basic("irfanxpertedge@gmail.com", Payload.token())
////		.when().delete("/rest/api/3/issue/{issue}")
////		.then().log().all().assertThat().statusCode(204);
//		
//		
//	//add command	
//		
//		
////		given().log().all().pathParam("issue", "SCRUM-3")
////		.header("Content-Type", "application/json")
////		.header("Accept","application/json")
////		.auth().preemptive().basic("irfanxpertedge@gmail.com", Payload.token())
////		.body(Payload.comment())
////		.when().post("/rest/api/3/issue/{issue}/comment")
////		.then().log().all().assertThat().statusCode(201);
////		
//		
//		
//		
//		//Add attachments
//		
//		File source = new File("C:\\Users\\Syed Irfan\\eclipse-workspace\\API_New_Pro\\Data\\IT_Consultancy_Contacts.xlsx"); 
//		
//		given().log().all().pathParam("issue", "SCRUM-3")
//		.header("X-Atlassian-Token","no-check")
//		.header("Accept", "application/json")
//		.multiPart("file",source).auth().preemptive()
//		.basic("irfanxpertedge@gmail.com", Payload.token())
//		.when().post("/rest/api/3/issue/{issue}/attachments")
//		.then().log().all().assertThat().statusCode(200);
//		
//		
//	//	given().log().all().pathParam("issue", "KAN-17").header("X-Atlassian-Token","no-check").
////		header("Content-Type","multipart/form-data").multiPart(f).auth().preemptive().
////		basic("smartsyed0320@gmail.com", payload.myToken()).
////		when().post("/rest/api/2/issue/{issue}/attachments").then().log().all().assertThat().statusCode(200);
////		
//			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
