package org.acme;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    void testConversionKnotsKm() {
        given()
        .when()
            .contentType(ContentType.JSON)
            .get("/calculate/radius/6")
        .then()
            .statusCode(200)
            .body("area", is(6.0F),
             "radius", is(1.3819766F));
    }


}