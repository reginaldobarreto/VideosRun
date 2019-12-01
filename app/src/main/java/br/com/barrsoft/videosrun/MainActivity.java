package br.com.barrsoft.videosrun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageViewPlay)
    ImageView imageViewPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }


    @OnClick(R.id.imageViewPlay)
    public void imageViewPlay(View view){
        Intent intent = new Intent(this,MovieActivity.class);
        startActivity(intent);
    }
}
