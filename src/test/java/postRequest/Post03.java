package postRequest;

import baseURLs.DummyBaseURL;
import org.junit.Test;
import pojoDatas.DummyRestApiPojo;

public class Post03 extends DummyBaseURL {


    /*

    Given
        http://dummy.restapiexample.com/api/v1/create
    And
        Request Body olarak aşağıdaki pattern de body gönderiniz
      {
  "name": "Drake F.",
  "salary": "40000",
  "age": "27"
}
    When
        Kullanıcı POST Methodu ile Request Gönderir
    Then
        Status Code un "200" olduğunu Assert et
    And
           Response Body nin aşağıdaki şekilde olduğunu doğrulayınız
           {
    "status": "success",
    "data": {
        "name": "Drake F.",
        "salary": "40000",
        "age": "27",
        "id": 4545
    },
    "message": "Successfully! Record has been added."
}

   */


    @Test
    public void post03(){


        specification.pathParams("createPath","create");


        DummyRestApiPojo dummyRestApiPojo = new DummyRestApiPojo("Drake F,","40000","28");










    }

}
