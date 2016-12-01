package model;

import java.util.Arrays;

/**
 * Created by Nick_Shapkin on 24.11.2016.
 */
public class Artist {
    private String name;
    private String about;

    private Director director;
    private Manager manager;

    private Album [] album;


    public Artist (){

    }

    public void setName (String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


    public String getName() {
        return this.name;
    }
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Album[] getAlbum() {
        return album;
    }
     public void setAlbum(Album... albums) {
         this.album = album;
     }


//    public void setAlbum(Album[] album) {
//        this.album = album;



    public String toString () {
    return "Artist: " + name + "\n"
            + director + "\n"
            +manager  + "\n"
            + Arrays.toString(album);
    }
}

