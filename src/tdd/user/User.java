package tdd.user;

public class User {
    String userName,password;
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        if(userName.length() >=4) this.userName = userName;
    }
}
