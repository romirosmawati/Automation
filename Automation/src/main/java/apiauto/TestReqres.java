package apiauto;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestReqres {

    @Test
    public void getAllUsers() {
        RestAssured
                .given().when()
                .get("http://reqres.in/api/users?page=2")
                .then().log().all();
    }

}
