package facebook;

import user.User;

import java.util.Date;

public class MyFacebookUser implements User {
    public FacebookUser user;
    public MyFacebookUser (FacebookUser user){
        this.user = user;
    }

    public String getEmail() {
        return user.getEmail();
    }

    public String getCountry() {
        return user.getUserCountry();
    }

    public Date getTime() {
        return user.getUserActiveTime();
    }
}
