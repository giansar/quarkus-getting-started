package id.giansar;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    public void testGreetingEndPoint() {
        String name = "cahndeso";
        given()
                .pathParam("name", name)
                .when().get("/hello/greeting/{name}")
                .then().statusCode(200).body(is(name + ", piye kabarmu ?"));
    }
}
