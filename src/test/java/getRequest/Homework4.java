package getRequest;

import baseURLs.DummyBaseURL;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class Homework4 extends DummyBaseURL {

    /*

    Given
	   	    https://dummy.restapiexample.com/api/v1/employee/1
		When
			Kullanıcı GET Methodu ile Request Gönderir
		Then
			 Status Code un "200" olduğunu Assert et
		And
		     Response body nin bu şekilde olduğunu doğrular
    {
    "status": "success",
    "data": {
        "id": 1,
        "employee_name": "Tiger Nixon",
        "employee_salary": 320800,
        "employee_age": 61,
        "profile_image": ""
    },
    "message": "Successfully! Record has been fetched."
}

*/
    @Test
    public void get03() {


        specification.pathParams("employeePath", "employee" , "idPath","1");


        Response response = given().spec(specification).when().get("/{employeePath}/{idPath}");
        response.prettyPrint();


          response.then().assertThat().statusCode(200);

          assertTrue(response.getBody().asString().contains("\"id\": 1") );
        assertTrue(response.getBody().asString().contains("\"employee_name\": \"Tiger Nixon"));
        assertTrue(response.getBody().asString().contains("\"employee_salary\": 320800"));
        assertTrue(response.getBody().asString().contains(" \"employee_age\": 61"));
        assertTrue(response.getBody().asString().contains("\"profile_image\": \"\""));








    }

}





