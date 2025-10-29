package tdd.user;

public class User {

    private String userName, password, typeOfUser = "normal";

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
        if (userName.length() >= 4) this.userName = userName;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        if (typeOfUser.equals("normal")
                || typeOfUser.equals("admin")
                || typeOfUser.equals("super")) {
            this.typeOfUser = typeOfUser;
        }
    }

    public int getSolidus() {
        return 5;
    }
}
