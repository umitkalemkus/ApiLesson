package getRequest;

import baseURLs.DummyBaseURL;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.reset;

public class Homework2 extends DummyBaseURL {





   /* And
    salary si 100.000'den az olanları konsola yazdırınız.
    Doris Wilder'ın bunlardan biri olduğunu assert ediniz.

*/
   @Test
   public void homework2(){
       specification.pathParam("employeesPath","employees");


       Response response =given().spec(specification).when().get("/{employeesPath}");
        response.prettyPrint();


       JsonPath jsonPath = response.jsonPath();


       List<Integer> employee_name = jsonPath.getList("data.findAll{(it.employee_salary)<100000}.employee_name");
       System.out.println(employee_name);


      Assert.assertTrue(employee_name.contains("Doris Wilder"));


   }



}
