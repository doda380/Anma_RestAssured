package Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;


public class Virtual_Clinic {

    @JsonProperty("Total")
    private String Total;

    @JsonProperty("PageNumber")
    private String PageNumber;

    @JsonProperty("PageSize")
    private String PageSize;

    @JsonProperty("Filter")
    private String Filter;

    @JsonProperty("Data")
    private List<SP_ProfileData> data;

    @JsonProperty("Messages")
    private List<UserMessages> Messages;

    @JsonProperty("IsSuccess")
    private String IsSuccess;

    @JsonProperty("Exception")
    private String Exception;

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public String getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(String pageNumber) {
        PageNumber = pageNumber;
    }

    public String getPageSize() {
        return PageSize;
    }

    public void setPageSize(String pageSize) {
        PageSize = pageSize;
    }

    public String getFilter() {
        return Filter;
    }

    public void setFilter(String filter) {
        Filter = filter;
    }

    public List<SP_ProfileData> getData() {
        return data;
    }

    public void setData(List<SP_ProfileData> data) {
        this.data = data;
    }

    public List<UserMessages> getMessages() {
        return Messages;
    }

    public void setMessages(List<UserMessages> messages) {
        Messages = messages;
    }

    public String getIsSuccess() {
        return IsSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        IsSuccess = isSuccess;
    }

    public String getException() {
        return Exception;
    }

    public void setException(String exception) {
        Exception = exception;
    }

    UserLogin tkn = new UserLogin();
    Virtual_Clinic v;
    public void VirtualClinic() {

       v = given().header("Authorization", tkn.getToken()).contentType("application/json").body("{}").
                when().log().all()
                .post("https://qcapi.anma.edu.sa/Api/ServiceProviderUser/PublishedServiceProviderGetAll").as(Virtual_Clinic.class);

        Response response = RestAssured
                .given()
                .header("Authorization", tkn.getToken())
                .contentType("application/json")
                .body("{}")
                .when()
                .log().all()
                .post("https://qcapi.anma.edu.sa/Api/ServiceProviderUser/PublishedServiceProviderGetAll");

// Print the entire response body
        System.out.println(response.asPrettyString());
    }

    public void DisplayRespone() {

    }

}