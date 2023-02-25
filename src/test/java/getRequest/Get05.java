package getRequest;

import baseURLs.TheMovieBaseURL;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get05 extends TheMovieBaseURL {

    /*
        Given
            https://api.themoviedb.org/3/movie/popular

            apı_key = 4c841d9ec32b7f8c0069cf3fec36774f
        When
             Kullanıcı GET Methodu ile Request Gönderir
        Then
            Status Code un "200" olduğunu Assert et
		And
            Content Type ın "application/json" olduğunu assert et
		And
		    id lerin içerisnde
		    646389
            536554
            640146 olduğunu assert ediniz.

     */
    @Test
    public void get03() {

        specification.pathParams("moviePath","movie",
                "popularPath","popular")
                .queryParam("api_key","4c841d9ec32b7f8c0069cf3fec36774f");

      //  Kullanıcı GET Methodu ile Request Gönderir

        Response response = given().spec(specification).when().get("/{moviePath}/{popularPath}");

        response.prettyPrint();

       // Status Code un "200" olduğunu Assert et

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON).body("results.id", Matchers.hasItems(646389,536554,640146));













    }





}
