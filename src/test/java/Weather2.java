import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;




public class Weather2 {
    @Test
    public void prueba(){
         RestAssured.baseURI = "https://api.openweathermap.org";

         Response response = RestAssured.given().when()
                 .queryParam("appid", "1d9fa7582e337a72c5d30d2f5325d902").queryParam("q","New York,US").get("/data/2.5/weather");

         String lon = response.jsonPath().getString("coord.lon");
         String lat = response.jsonPath().getString("coord.lat");

         Response response2 = RestAssured.given().when()
                .queryParam("appid", "1d9fa7582e337a72c5d30d2f5325d902").queryParam("lat", lat).queryParam("lon", lon).get("/data/2.5/uvi");

         String resp = response2.prettyPrint();

         System.out.println(response2.jsonPath().getString("value"));

     }


}

