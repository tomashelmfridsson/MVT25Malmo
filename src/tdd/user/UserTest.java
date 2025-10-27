package tdd.user;

//Junit5
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

}

