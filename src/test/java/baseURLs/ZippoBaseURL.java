package baseURLs;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class ZippoBaseURL {




    protected RequestSpecification specification  ;

    @Before
    public void setBaseURL(){

        specification = new RequestSpecBuilder().setBaseUri("api.zippopotam.us").build();



    }







}
