package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String userMail;
    private String country;
    private Date lastActiveTime;
}