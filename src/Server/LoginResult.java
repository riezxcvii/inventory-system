package Server;

// encapsulate the result of a validateLogin
public class LoginResult {

    private boolean isValid;
    private int userID;
    private String userType;

    public LoginResult(int userID) {
        this.userID = userID;
    }

    public LoginResult(boolean isValid, int userID, String userType) {
        this.isValid = isValid;
        this.userID = userID;
        this.userType = userType;
    }

    public boolean isValid() {
        return isValid;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserType() {
        return userType;
    }
}
