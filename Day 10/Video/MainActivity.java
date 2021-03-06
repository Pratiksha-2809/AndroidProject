package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView1 = findViewById(R.id.videoView1);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);
        videoView1.setMediaController(mediaController);

        videoView1.setVideoURI(uri);

        videoView1.requestFocus();
        videoView1.start();

        videoView1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this,"Thank you...",Toast.LENGTH_SHORT).show();
            }
        });

        videoView1.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mp, int what, int extra) {
                Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                return false;

            }
        });
    }
}