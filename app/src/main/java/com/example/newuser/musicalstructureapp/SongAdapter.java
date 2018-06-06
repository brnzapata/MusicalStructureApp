package com.example.newuser.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView songTitleTextView = listItemView.findViewById(R.id.songTitle);
        songTitleTextView.setText(currentSong.getSongTitle());

        TextView songAlbumTextView = listItemView.findViewById(R.id.songAlbum);
        songAlbumTextView.setText(currentSong.getSongAlbum());

        return listItemView;
    }
}
