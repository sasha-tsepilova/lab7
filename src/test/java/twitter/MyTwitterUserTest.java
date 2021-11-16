package twitter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    TwitterUser us1;
    MyTwitterUser us2;

    @BeforeEach
    void setUp() {
        us1 = new TwitterUser("firstuser@gmail.com", "Ukraine", new Date());
        us2 = new MyTwitterUser(us1);
    }

    @Test
    void getEmail() {
        assertTrue(us1.getUserMail().equals(us2.getEmail()));
    }

    @Test
    void getCountry() {
        assertTrue(us1.getCountry().equals(us2.getCountry()));
    }

    @Test
    void getTime() {
        assertTrue(us1.getLastActiveTime().equals(us2.getTime()));
    }
}