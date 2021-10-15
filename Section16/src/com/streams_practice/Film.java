package com.streams_practice;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private final String title;
    private final int duration;
    private final double imdbRate;
    private final String genre;
    private final List<String> searchKeywords;

    public Film(String title, int duration, double imdbRate, String genre, List<String> searchKeywords) {
        this.title = title;
        this.duration = duration;
        this.imdbRate = imdbRate;
        this.genre = genre;
        this.searchKeywords= searchKeywords;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getImdbRate() {
        return imdbRate;
    }

    public String getGenre() {
        return genre;
    }

    public List<String> getSearchKeywords() {
        return searchKeywords;
    }

    @Override
    public String toString() {
        return title;
    }
}
