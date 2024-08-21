package Pojo;



public class UserLogin{

    private String username;

    private String Password;

    public static String UserType;

    public static String token;

    public static Boolean HasOrderFree ;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getToken() {
        return "Bearer " + this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static Boolean getHasOrderFree() {
        return HasOrderFree;
    }

    public void setHasOrderFree(Boolean hasOrderFree) {
        this.HasOrderFree = hasOrderFree;
    }

    public static String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        this.UserType = userType;
    }

}






