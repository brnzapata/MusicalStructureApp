package com.example.newuser.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view that shows Drake
        Button drake = findViewById(R.id.drake_textview);
        drake.setText(R.string.artist_drake);
        //set a click listener on the view
        drake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create a drakeIntent to open the {@link DrakeArtistPage}
                Intent drakeIntent = new Intent(MainActivity.this, DrakeArtistPage.class);
                //start the activity
                startActivity(drakeIntent);
            }
        });

        Button theWeeknd = findViewById(R.id.the_weeknd_textview);
        theWeeknd.setText(R.string.the_weeknd);

        theWeeknd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theWeekndIntent = new Intent(MainActivity.this, TheWeekndPage.class);
                startActivity(theWeekndIntent);
            }
        });
    }
}
