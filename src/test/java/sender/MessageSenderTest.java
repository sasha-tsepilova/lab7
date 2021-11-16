package sender;

import facebook.FacebookUser;
import facebook.MyFacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.MyTwitterUser;
import twitter.TwitterUser;
import user.User;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    MessageSender sender;
    User to_send1;
    User to_send2;
    @BeforeEach
    void setUp() {
        sender = new MessageSender();
        FacebookUser us1 = new FacebookUser("firstuser@gmail.com", "Ukraine", new Date());
        to_send1 = new MyFacebookUser(us1);
        TwitterUser us2 = new TwitterUser("seconduser@gmail.com", "Ukraine", new Date());
        to_send2= new MyTwitterUser(us2);

    }

    @Test
    void send() {
        assertFalse(sender.send("Hello!", to_send1, "China"));
        assertTrue(sender.send("Hello!", to_send2, "Ukraine"));
    }
}