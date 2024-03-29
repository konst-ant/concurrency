package threads;

import java.util.Date;

/**
 * Created by KAntipin on 06.04.2016.
 */
public class Event {
    private String event;
    private Date date;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Event(String event, Date date) {
        this.event = event;
        this.date = date;
    }
}
