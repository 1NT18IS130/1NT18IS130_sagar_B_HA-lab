package com.example.ha_lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView songtitle;
    Button play, stop, pause, rewind, forward, reset;
    int starttime = 0 ; // startime is 0s
    int stopttime = 0; // stoptime is 0s by default
    int forwardtime = 5000 ; // 5s for forward
    int backwardtime = 5000 ; // 5s for backwardtime

    MediaPlayer createMediaObject() {
        MediaPlayer mediap = MediaPlayer.create(this, R.raw.enemy);
        return mediap;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = createMediaObject();

        songtitle = (TextView) findViewById(R.id.songs);
        songtitle.setText("enemy.mp3");

        play = (Button) findViewById(R.id.play);
        stop = (Button) findViewById(R.id.stop);
        pause = (Button) findViewById(R.id.pause);
        reset = (Button) findViewById(R.id.reset);
        forward = (Button) findViewById(R.id.forward);
        rewind = (Button) findViewById(R.id.rewind);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Playing media now", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Playing media now", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Stopping media now", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
                mediaPlayer = createMediaObject();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Stopping media now", Toast.LENGTH_SHORT).show();
                mediaPlayer.reset();
                mediaPlayer = createMediaObject();
                mediaPlayer.start();
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Stopping media now", Toast.LENGTH_SHORT).show();
                mediaPlayer.seekTo(mediaPlayer.getCurrentPosition()+forwardtime);
            }
        });

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Stopping media now", Toast.LENGTH_SHORT).show();
                mediaPlayer.seekTo(mediaPlayer.getCurrentPosition()-backwardtime);
            }
        });



    }
}