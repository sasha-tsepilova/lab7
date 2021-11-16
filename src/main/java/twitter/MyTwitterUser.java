package twitter;

import user.User;

import java.util.Date;

public class MyTwitterUser implements User {
    public TwitterUser user;
    public MyTwitterUser (TwitterUser user){
        this.user = user;
    }

    public String getEmail() {
        return user.getUserMail();
    }

    public String getCountry() {
        return user.getCountry();
    }

    public Date getTime() {
        return user.getLastActiveTime();
    }
}
