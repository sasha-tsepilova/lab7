package facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    FacebookUser us1;
    MyFacebookUser us2;

    @BeforeEach
    void setUp() {
        us1 = new FacebookUser("firstuser@gmail.com", "Ukraine", new Date());
        us2 = new MyFacebookUser(us1);
    }

    @Test
    void getEmail() {
        assertTrue(us1.getEmail().equals(us2.getEmail()));
    }

    @Test
    void getCountry() {
        assertTrue(us1.getUserCountry().equals(us2.getCountry()));
    }

    @Test
    void getTime() {
        assertTrue(us1.getUserActiveTime().equals(us2.getTime()));
    }
}