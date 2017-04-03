package imonitor.oval.hdfcergo.com.recycleview.Model;

import android.content.Context;

import imonitor.oval.hdfcergo.com.recycleview.MainActivity;

/**
 * Created by Zafar.Hussain on 03/04/2017.
 */

public class Movie {
    private String title, genre, year;



    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
