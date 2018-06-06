package com.example.newuser.musicalstructureapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TheWeekndPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_page);

        ImageView artistImage = findViewById(R.id.artist_image);
        artistImage.setImageResource(R.drawable.the_weeknd);

        TextView nameOfArtist = findViewById(R.id.name_of_artist);
        nameOfArtist.setText(R.string.the_weeknd);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Call Out My Name", "My Dear Melancholy"));
        songs.add(new Song("Often", "Beauty Behind the Madness"));
        songs.add(new Song("Die for You", "Starboy"));
        songs.add(new Song("Earned It", "Fifty Shades of Grey"));
        songs.add(new Song("Can't Feel My Face", "Beauty Behind the Madness"));
        songs.add(new Song("Wicked Games", "House of Balloons"));
        songs.add(new Song("I Feel it Coming", "Starboy"));
        songs.add(new Song("Wasted Times", "My Dear Melancholy"));
        songs.add(new Song("Twenty Eight", "House of Balloons"));
        songs.add(new Song("Sidewalks", "Starboy"));

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
