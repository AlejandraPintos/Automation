import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Weather {
    @Test
    public void initialTest(){
        RestAssured.baseURI ="https://api.openweathermap.org";

        //Getting response
        Response response = RestAssured.given().when()
                .queryParam("appid", "e8e84a1af87fb94722c27d2db5cba653").queryParam("id", 5038018).get("/data/2.5/forecast");

        //Getting response body to verify/assert
        String responseBody = response.jsonPath().getString("list[2].weather.main");
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println("Response Body is =>  " + response.prettyPrint());
        System.out.println(response.getStatusCode());


    }

}


