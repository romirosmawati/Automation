package apiAuto;
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

    @Test
    public void test2(){
        System.out.println("Test Hello World 2");
    }

    @Test
    public void test3(){
        System.out.println("Test Hello World 3");
    }

    @Test
    public void test4(){
        System.out.println("Test Hello World 4");
    }

    @Test
    public void test5(){
        System.out.println("Test Hello World 5");
    }
}
