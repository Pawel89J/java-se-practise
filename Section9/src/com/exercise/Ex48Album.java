package com.exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex48Album {

    private String name;
    private String artist;
    private SongList songs;

    public Ex48Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs= new SongList();
    }

    public boolean addSong(String songTitle, double duration) {
        return this.songs.add(new Ex48Song(songTitle, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Ex48Song> playList) {
        Ex48Song checkedSong = songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " +trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Ex48Song> playList) {
        Ex48Song checkedSong = songs.findSong(songTitle);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " +songTitle+ " is not in this album");
        return false;
    }

    public static class SongList {
        private ArrayList<Ex48Song> songs;

        private SongList() {
            this.songs = new ArrayList<Ex48Song>();
        }

        private boolean add(Ex48Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Ex48Song findSong(String title) {
            for(Ex48Song checkedSong: this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }
        private Ex48Song findSong(int trackNumber) {
            int index = trackNumber -1;
            if ((index >= 0) && (index <= this.songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
