package model;

import java.util.Date;

/**
 * Created by Nick_Shapkin on 24.11.2016.
 */
public class Album {
    private String title;
    private Date relleased;
    private Date relleasAt;
    private String relleasedAt;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRelleased() {
        return relleased;
    }

    public void setRelleasAt(Date relleasAt) {

//        this.relleasAt = relleasAt;

    }
    public void setRelleasAt(String relleasAt) {
//        this.relleasAt = relleasAt;

    }
    public String toString() {
        return "Album: " + title + ", " + relleasedAt;

    }


    public void setReleasedAt(Date date) {
    }
}
