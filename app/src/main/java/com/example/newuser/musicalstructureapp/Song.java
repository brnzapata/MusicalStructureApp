package com.example.newuser.musicalstructureapp;

public class Song {
    //Name of the song
    private String mSongTitle;
    //Name of the Album
    private String mSongAlbum;

    public Song(String songTitle, String songAlbum){
        mSongTitle = songTitle;
        mSongAlbum = songAlbum;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSongAlbum() {
        return mSongAlbum;
    }
}
