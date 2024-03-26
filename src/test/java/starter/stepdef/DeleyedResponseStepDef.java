package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.ReqresResponse;

import java.io.File;
import static org.hamcrest.Matchers.equalTo;
public class DeleyedResponseStepDef {

    @Steps
    ReqresAPI reqresAPI ;
    @Given("Deleyed Response user with valid parameter page {}")
    public void deleyedResponseUserWithValidParameterPage(int page) {
        reqresAPI.getDeleyedResponse(page);

    }

    @When("Send request Deleyed Response user")
    public void sendRequestDeleyedResponseUser() {
        SerenityRest.when().get(ReqresAPI.DELEYED_RESPONSE);

    }

    @And("Response Body page should be {}")
    public void responseBodyPageShouldBe(int page) {
        SerenityRest.and().body(ReqresResponse.PAGE,equalTo(page));

    }



    @Given("Deleyed response user with invalid parameter teks {}")
    public void deleyedResponseUserWithInvalidParameterTeks(String teks) {
        reqresAPI.getDeleyedResponseInvalid(teks);
    }

    @When("Send Request Deleyed Response user with invalid parameter")
    public void sendRequestDeleyedResponseUserWithInvalidParameter() {
        SerenityRest.when().get(ReqresAPI.DELEYED_RESPONSE);
    }
}
