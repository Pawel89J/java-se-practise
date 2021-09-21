package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex46Album {

    private String name;
    private String artist;
    private ArrayList<Ex46Song> songs;

    public Ex46Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs= new ArrayList<Ex46Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Ex46Song(title, duration));
            return true;
        }
        return false;
    }

    private Ex46Song findSong(String title) {
        for(Ex46Song checkedSong: this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Ex46Song> playList) {
        int index = trackNumber -1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " +trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Ex46Song> playList) {
        Ex46Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " +title+ " is not in this album");
        return false;
    }
}
