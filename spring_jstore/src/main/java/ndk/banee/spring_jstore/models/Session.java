package ndk.banee.spring_jstore.models;

import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Session {

    @Id
    int loggedUserId;
    DateTime loggedTimeStamp;

    public Session(int loggedUserId, DateTime loggedTimeStamp) {

        this.loggedUserId = loggedUserId;
        this.loggedTimeStamp = loggedTimeStamp;
    }

    public Session() {

    }

    public int getLoggedUserId() {
        return loggedUserId;
    }

    public void setLoggedUserId(int loggedUserId) {
        this.loggedUserId = loggedUserId;
    }

    public DateTime getLoggedTimeStamp() {
        return loggedTimeStamp;
    }

    public void setLoggedTimeStamp(DateTime loggedTimeStamp) {
        this.loggedTimeStamp = loggedTimeStamp;
    }
}
