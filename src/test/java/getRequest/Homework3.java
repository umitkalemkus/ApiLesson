package getRequest;

import baseURLs.RestfullBaseURL;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;


import static io.restassured.RestAssured.given;

public class Homework3 extends RestfullBaseURL {

    /*
        Given
            https://restful-booker.herokuapp.com/booking
        When
             Kullanıcı GET Methodu ile Request Gönderir
         And
            Kullanıcı firstname olarak Sarah i aratır
        Then
            Status Code un "200" olduğunu Assert et
		And
            Response body de "bookingid" olduğunu verify eder.

*/

    @Test   // -> it is like it main method
    public void homework3() {


   specification.pathParam("bookingPath","booking");


   Response response = given().spec(specification).when().get("/{bookingPath}");
   response.prettyPrint();


  response.then().assertThat().statusCode(404);



        }






    }







