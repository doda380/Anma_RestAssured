package Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static io.restassured.RestAssured.given;


public class Get_SP_Profile {
    @JsonProperty("Total")
    private String Total;

    @JsonProperty("PageNumber")
    private String PageNumber;

    @JsonProperty("PageSize")
    private String PageSize;

    @JsonProperty("Filter")
    private String Filter;

    @JsonProperty("Data")
    private SP_ProfileData Data;

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

    public SP_ProfileData getData() {
        return Data;
    }

    public void setData(SP_ProfileData data) {
        Data = data;
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

    String BodyResponse;
    UserLogin tkn = new UserLogin();
    Get_SP_Profile Sp;
    public void SPUserProfile() {

        Sp = given().header("Authorization", tkn.getToken()).
                when().log().all()
                .get("https://qcapi.anma.edu.sa/Api/ServiceProviderUser/GetUser").as(Get_SP_Profile.class);
    System.out.println(Sp.getData().getFirstNameAr());
    }


    public void DisplayRespone() {


    }

}
