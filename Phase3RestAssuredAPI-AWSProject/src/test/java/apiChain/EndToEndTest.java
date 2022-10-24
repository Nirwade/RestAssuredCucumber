package apiChain;



import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class EndToEndTest {
	
	
	Response response;
	
	String BaseURI = "http://35.78.107.1:8088/employees";
    
    @Test
	public void test1() throws IOException {
		
		response = GetAllMethods();
		Assert.assertEquals(response.getStatusCode(), 200);      
		
		
		
		response = PostMethod(); 
		
		String responsebody = response.getBody().asString();
		   
	    System.out.println("The response body is " + responsebody); 
		int responsecode = response.getStatusCode();
		Assert.assertEquals(responsecode, 201);
		System.out.println(responsecode);
		
		JsonPath jpath = response.jsonPath();
		int empid = jpath.get("id");
		System.out.println("created emp id is  " + empid);
		
		String frstname = jpath.get("firstName");
		System.out.println("Emp firstname is -- > " + frstname);
		
		int salary = jpath.get("salary");
		System.out.println("Added salary is -- > " + salary);
		
		//Assert.assertEquals(frstname, "Sujan");
		//Assert.assertEquals("100000", salary);
		
		
		response = PutMethod(empid );
		
		int staatuscode1 = response.getStatusCode();
		System.out.println(staatuscode1);
		Assert.assertEquals(staatuscode1, 200);
		
		String ResponseBody  = response.getBody().asString();
		System.out.println("Response body is --> " + ResponseBody);
		
		JsonPath jpath1 = response.jsonPath();
		String fstname = jpath1.get("firstName");
		Assert.assertEquals(fstname, "Sujana");
		
		
		response = DelMethod(empid);
		int statuscode = response.getStatusCode();
		System.out.println("The statuscode for del method --> " + statuscode);
		Assert.assertEquals(statuscode, 200);
		Assert.assertEquals(response.getBody().asString(), "");
		
		
		response = UpdtdGetMethod(empid);
		String responsebody1 = response.getBody().asString();
		System.out.println("responsebody is empty-- > " + responsebody1);
		JsonPath jpath2 = response.jsonPath();
		Assert.assertEquals(jpath2.get("message"), "Entity Not Found");
		
		int statuscode1 =response.statusCode();
		System.out.println("The status code for updtdGet is -->  " + statuscode1);
		Assert.assertEquals(statuscode1, 400);
		
		
		
			
	}
	
	
	
	@Test
	public Response GetAllMethods() {
		
		RestAssured.baseURI = BaseURI;
		
		RequestSpecification request =RestAssured.given();
		
	    Response response =	request.get();
		
		return response;
		
	}
	
	@Test
	public Response PostMethod() {
		
		RestAssured.baseURI = BaseURI;
		
		RequestSpecification request = RestAssured.given();
		
		JSONObject jobj = new JSONObject ();
		jobj.putOpt("firstName", "Sujan");
		jobj.putOpt("lastName", "ahuja");
		jobj.putOpt("salary", "100000");
		jobj.putOpt("email", "saurabh@abc.com");
		
		
		Response response = request.contentType(ContentType.JSON)
		.accept(ContentType.JSON).body(jobj.toString()).post();
	    
	   
	    
		return response;
	}
	
	@Test
	public Response PutMethod(int EmpId) {
		
		RestAssured.baseURI = BaseURI;
		
		RequestSpecification request = RestAssured.given();
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("firstName", "Sujana");
		jobj.put("lastName", "ahujan");
		
		Response response = request.contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(jobj.toString()).put("/" +EmpId);
		
		return response;
	}
	
	
	@Test
	public Response DelMethod(int EmpId) {
		
		RestAssured.baseURI = BaseURI;
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.delete("/" + EmpId );
		
		return response;
	}
	
	@Test
	public Response UpdtdGetMethod(int EmpId ) {
		
		RestAssured.baseURI = BaseURI;
		
		RequestSpecification request = RestAssured.given();
		
		Response response  =request.get("/" + EmpId );
		
		return response;
	}

}
