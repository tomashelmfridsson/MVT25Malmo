package tdd.user;

//Junit5
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    void testOFUser(){
        User myUser = new User("Tomas","qwerty");
    }

    @Test
    void testSetUserNameTo5Chars(){
        User myUser = new User("Gunnar","qwerty");
        myUser.setUserName("Tomas");
        assertEquals("Tomas",myUser.getUserName());
    }

    @Test
    void testSetUserNameTo3Chars(){
        User myUser = new User("Gunnar","qwerty");
        myUser.setUserName("Åsa");
        assertEquals("Gunnar",myUser.getUserName());
    }

    @Test
    void testSetUserNameTo4Chars(){
        User myUser = new User("Gunnar","qwerty");
        myUser.setUserName("Olle");
        assertEquals("Olle",myUser.getUserName());
    }

    @Test
    void testSetFailedUserName(){
        String[] indata = {"Åsa","Bo", "Eva"};
        for (int i=0;i<indata.length;i++){
            User myUser = new User("Gunnar","qwerty");
            myUser.setUserName(indata[i]);
            assertEquals("Gunnar",myUser.getUserName());
        }
    }

    @Test
    void testOfTypeOfUserNormal(){
        User myUser = new User("Gunnar","qwerty");
        assertEquals("normal",myUser.getTypeOfUser());
    }

    @Test
    void testOfSetTypeOfUserToAdmin(){
        User myUser = new User("Gunnar","qwerty");
        myUser.setTypeOfUser("admin");
        assertEquals("admin",myUser.getTypeOfUser());
    }

    @Test
    void testOfSetTypeOfUserToSuper(){
        User myUser = new User("Gunnar","qwerty");
        myUser.setTypeOfUser("super");
        assertEquals("super",myUser.getTypeOfUser());
    }

    @Test
    void testOfNotCorrectSetTypeOfUser(){
        User myUser = new User("Gunnar","qwerty");
        myUser.setTypeOfUser("fsdfsd");
        assertEquals("normal",myUser.getTypeOfUser());
    }

    @Test
    void testOfSolidus(){
        User myUser = new User("Gunnar","qwerty");
        assertEquals(5,myUser.getSolidus());
    }

}

