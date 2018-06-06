package com.example.newuser.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DrakeArtistPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_page);

        ImageView artistImage = findViewById(R.id.artist_image);
        artistImage.setImageResource(R.drawable.drake);

        TextView nameOfArtist = findViewById(R.id.name_of_artist);
        nameOfArtist.setText(R.string.artist_drake);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("One Dance", "Views"));
        songs.add(new Song("From Time", "Nothing Was The Same"));
        songs.add(new Song("Passionfruit", "More Life"));
        songs.add(new Song("Unforgettable", "Thank Me later"));
        songs.add(new Song("Crew Love", "Take Care"));
        songs.add(new Song("Free Smoke", "More Life"));
        songs.add(new Song("Take Care", "Take Care"));
        songs.add(new Song("Still Here", "Views"));
        songs.add(new Song("Up All Night", "Thank Me Later"));
        songs.add(new Song("I'm Going In", "So Far Gone"));

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list_of_songs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Context context = getApplicationContext();
                int message = R.string.now_playing_message;
                int duration = Toast.LENGTH_LONG;

                Toast playMessage = Toast.makeText(context, message, duration);
                playMessage.show();
            }
        });
    }
}
