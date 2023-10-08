package homeworks.hm35;

import org.testng.Assert;
import org.testng.annotations.Test;

import static homeworks.hm35.Specification.configureSpec;
import static homeworks.hm35.Specification.requestSpecification;
import static homeworks.hm35.Specification.responseSpecification;
import static io.restassured.RestAssured.given;


public class TestCreateSuccessWithPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testCreateSuccessWithPojo() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(201));

        UserForCreate userForCreate = new UserForCreate("morpheus", "leader");
        SuccessCreateUserResp successCreateUserResp = given()
                .body(userForCreate)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(SuccessCreateUserResp.class);

        Assert.assertEquals(successCreateUserResp.getName(), "morpheus");
        Assert.assertEquals(successCreateUserResp.getJob(), "leader");
    }
}
