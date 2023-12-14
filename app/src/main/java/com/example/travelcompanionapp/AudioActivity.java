package com.example.travelcompanionapp;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.widget.ImageButton;
        import androidx.appcompat.app.AppCompatActivity;

public class AudioActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private ImageButton playPauseButton;
    private ImageButton stopButton;

    @SuppressLint({"MissingInflatedId", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        playPauseButton = findViewById(R.id.playPauseButton);
        stopButton = findViewById(R.drawable.ic_stop);

        mediaPlayer = MediaPlayer.create(this, R.raw.famusaylala); // Replace with your audio file

        playPauseButton.setOnClickListener(view -> {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
                playPauseButton.setImageResource(R.drawable.ic_play_pause); // Set the play icon
            } else {
                mediaPlayer.start();
                playPauseButton.setImageResource(R.drawable.ic_stop); // Set the pause icon
            }
        });

        stopButton.setOnClickListener(view -> {
            mediaPlayer.stop();
            mediaPlayer.prepareAsync();
            playPauseButton.setImageResource(R.drawable.ic_play_pause); // Set the play icon
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
