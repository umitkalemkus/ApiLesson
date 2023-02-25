package baseURLs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class GorestCoBaseURL {

    protected RequestSpecification specification;

    // https://gorest.co.in/public/v2/todos/14091   ---->> Base URL

    @Before
    public void setUpBaseURL(){
        specification = new RequestSpecBuilder().
                setBaseUri("https://gorest.co.in/public/v2").
                build();

    }




}
