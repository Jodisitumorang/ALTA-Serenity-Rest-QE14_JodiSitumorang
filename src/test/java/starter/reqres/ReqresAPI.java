package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {
    public static String LIST_USERS = Constants.BASE_URL+"/api/users?page={page}";
    public static String CREATE_USER = Constants.BASE_URL+"/api/users";
    public static String UPDATE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String DELETE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String LOGIN_USER = Constants.BASE_URL+"/api/login";
    public static String REGISTER_USER = Constants.BASE_URL+"/api/register";
    public static String DELEYED_RESPONSE = Constants.BASE_URL+"/api/users?delay={delay}";


    @Step("Get list user with valid parameter page")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page", page);
    }



    @Step("Update user with valid json and user id")
    public void putUpdateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Delete user with valid user id")
    public void deleteUser(int id){
        SerenityRest.given().pathParam("id", id);

    }




//    Tugas Post Login
    @Step("Post login user ")
    public  void postLoginUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

//    Tugas Post Register
    @Step("Post register user")
    public void postRegisterUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

//    Tugas Post Create User
    @Step("Post create user with valid json")
    public void postCreateUser(File json){
    SerenityRest.given()
            .contentType(ContentType.JSON)
            .body(json);
    }

//    Tugas Get Deleyed Response
    @Step("Get deleyed response user with valid parameter page")
    public void getDeleyedResponse(int delay){
        SerenityRest.given().pathParam("delay", delay);
    }
    @Step("Get deleyed response user with invalid parameter")
    public void getDeleyedResponseInvalid(String delay){
        SerenityRest.given().pathParam("delay",delay);
    }





}
