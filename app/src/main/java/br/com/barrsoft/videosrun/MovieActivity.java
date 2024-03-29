package br.com.barrsoft.videosrun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieActivity extends AppCompatActivity {

    @BindView(R.id.videoView)
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        ButterKnife.bind(this);

        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
        int visibility = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(visibility);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoPath("android.resource://" + getOpPackageName() + "/" + R.raw.video);
        videoView.start();

    }

}