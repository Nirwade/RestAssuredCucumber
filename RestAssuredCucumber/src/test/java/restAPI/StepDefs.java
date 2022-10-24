package restAPI;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefs {
	
	Response response;
	RequestSpecification request;
	String URI = "http://localhost:3000/employees";
	
	@Given("The base URI is {string}")
	public void the_base_URI_is(String URI) {
	    
		
	    request = RestAssured.given()
	    		  .baseUri(URI);
	}

	@When("I perform the GET Operation")
	public Response i_perform_the_GET_Operation() {
	   
	   
		response = request.get();
		return response;
	}

	@Then("Responsecode should be")
	public void response_code_should_be( ) {
	  
		response = i_perform_the_GET_Operation();
	    Assert.assertEquals(response.statusCode(), 200);
	    
	    
	   response = i_perform_the_post_operation_with_and1("Shivaya", "900000"); 
	    Assert.assertEquals(response.getStatusCode(), 201);
		JsonPath json = response.jsonPath();
    	int UpEmID	= json.get("id");
    	System.out.println("created id is  " + UpEmID);
    	
    	
    	response =  i_perform_the_put_operation_with_and( UpEmID,  "OOMShivaya",  "1000000");
    	Assert.assertEquals(response.getStatusCode(), 200);
    	json = response.jsonPath();
    	String upemname =json.get("name");
    	Assert.assertEquals(upemname, "OOMShivaya");
    	System.out.println("updated name is "+ upemname);
    	json = response.jsonPath();
        String salary= json.get("salary");
   	    System.out.println("updated salary is "+ salary);
   	    Assert.assertEquals(salary, "1000000");
   	    
   	    
   	    response = i_perform_the_del_operation_with( UpEmID);
   	    Assert.assertEquals(response.getStatusCode(), 200);
    	String ResponseBody = response.body().asString();
 	    System.out.println("Body is empty successfully deleted UpEmID " +ResponseBody);
 	    Assert.assertEquals(ResponseBody, "{}");
	}
	
//=============================== POST ====================================
	@When("I perform the POST Operation with {string} and {string}")
	public Response i_perform_the_post_operation_with_and1(String Name, String Salary) {
	   
	  
       RestAssured.baseURI = URI;
		
        Map<String, Object> MapObj = new HashMap<String, Object> ();
		
		MapObj.put("name", Name);
		MapObj.put("salary", Salary);
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.contentType(ContentType.JSON).accept(ContentType.JSON).body(MapObj).post("/create");
			
	    return response;
		
	}	
			


		         
		  		
	

//============================== PUT =========================================
	@When("I perform the PUT Operation with {int}, {string} and {string}")
	public Response i_perform_the_put_operation_with_and(int UpEmID, String Name, String Salary) {
		RestAssured.baseURI = URI ;
    	
    	JSONObject json = new JSONObject ();
    	
    	json.put("name", Name);
    	json.put("salary", Salary);
    	
    	
    	RequestSpecification request = RestAssured.given();
    	
    	Response response =  request.contentType(ContentType.JSON).accept(ContentType.JSON).body(json.toString()).put("/"+ UpEmID);
    	
    	return response; 
	    
	}

//============================== DEL=======================================
	@When("I perform the DEL Operation with {int}")
	public Response i_perform_the_del_operation_with(int UpEmID) {
		
		 RestAssured.baseURI = URI;
		   
		   RequestSpecification request  = RestAssured.given();
		  
		   Response response = request.delete("/" + UpEmID );
		   
		   return response;
		
	    
	}
}
