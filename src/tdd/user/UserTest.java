package tdd.user;

//Junit5

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    void testOFUser() {
        User myUser = new User("Tomas", "qwerty");
    }

    @Test
    void testSetUserNameTo5Chars() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setUserName("Tomas");
        assertEquals("Tomas", myUser.getUserName());
    }

    @Test
    void testSetUserNameTo3Chars() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setUserName("Åsa");
        assertEquals("Gunnar", myUser.getUserName());
    }

    @Test
    void testSetUserNameTo4Chars() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setUserName("Olle");
        assertEquals("Olle", myUser.getUserName());
    }

    @Test
    void testSetFailedUserName() {
        String[] indata = {"Åsa", "Bo", "Eva"};
        for (int i = 0; i < indata.length; i++) {
            User myUser = new User("Gunnar", "qwerty");
            myUser.setUserName(indata[i]);
            assertEquals("Gunnar", myUser.getUserName());
        }
    }

    @Test
    void testOfTypeOfUserNormal() {
        User myUser = new User("Gunnar", "qwerty");
        assertEquals("normal", myUser.getTypeOfUser());
    }

    @Test
    void testOfSetTypeOfUserToAdmin() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypeOfUser("admin");
        assertEquals("admin", myUser.getTypeOfUser());
    }

    @Test
    void testOfSetTypeOfUserToSuper() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypeOfUser("super");
        assertEquals("super", myUser.getTypeOfUser());
    }

    @Test
    void testOfNotCorrectSetTypeOfUser() {
        User myUser = new User("Gunnar", "qwerty");
        myUser.setTypeOfUser("fsdfsd");
        assertEquals("normal", myUser.getTypeOfUser());
    }


    // hoodie kostar 20 solidus, och stickers 5 solidus.

    @Test
    void testOfSolidus() {
        User myUser = new User("Gunnar", "qwerty");
        assertEquals(5, myUser.getSolidus());
    }

    @Test
    void testofLoggaIn() {
        User myUser = new User("Gunnar", "qwerty");
        assertTrue(myUser.loggaIn("Gunnar", "qwerty"));
        assertEquals(6, myUser.getSolidus());
    }

    @Test
    void testofFailingLoggaIn() {
        User myUser = new User("Gunnar", "qwerty");
        assertFalse(myUser.loggaIn("Gunnar", "abc"));
        assertEquals(5, myUser.getSolidus());
    }

    @Test
    void testOfGoldMember() {
        User myUser = new User("Gunnar", "qwerty");
        for (int index = 1; index < 20; index++) {
            assertTrue(myUser.loggaIn("Gunnar", "qwerty"));
            assertEquals(5 + index, myUser.getSolidus());
        }
        assertTrue(myUser.loggaIn("Gunnar", "qwerty"));
        assertEquals(45, myUser.getSolidus());
        assertEquals("Goldmember",myUser.getTypeOfUser());
    }

    @Test
    void testOfBuyTshirt(){
        User myUser = new User("Gunnar", "qwerty");
        myUser.setSolidus(15);
        assertTrue(myUser.tShirt());
    }

    @Test
    void testOfFailedBuyTshirt(){
        User myUser = new User("Gunnar", "qwerty");
        assertFalse(myUser.tShirt());
    }

}

