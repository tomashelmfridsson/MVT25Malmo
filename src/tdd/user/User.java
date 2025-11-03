package tdd.user;

public class User {

    private String userName, password, typeOfUser = "normal";
    private int solidus = 5, numberLoggedIn = 0;

    public void setSolidus(int solidus) {
        this.solidus = solidus;
    }

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
        return solidus;
    }

    public boolean loggaIn(String usr, String pswd) {
        if (usr.equals(this.userName) && pswd.equals(this.password)) {
            this.solidus++;
            numberLoggedIn++;
            if (numberLoggedIn == 20){
                this.solidus +=20;
                this.typeOfUser="Goldmember";
            }
                return true;
        }
        return false;
    }

    public boolean tShirt(){
        if (this.solidus >= 15) {
            this.solidus -= 15;
            return true;
        }
        return false;
    }
}
