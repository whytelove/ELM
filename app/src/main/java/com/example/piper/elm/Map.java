package com.example.piper.elm;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Map extends AppCompatActivity {

    ImageView imageView;
    PhotoViewAttacher mAttacher;
    SeekBar seekBar; // seekBar pour le choix de l'UC du jour
    TextView textView ;
    int progress = 0; // Affichage des UC en fonction de la seekbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageview);
        imageView = (ImageView) findViewById(R.id.imageView);
        mAttacher = new PhotoViewAttacher(imageView);

        // ----- seek bar -----
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText(""+progress);
        textView.setTextSize(10);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;
                textView.setText("salut"+progress);
                textView.setTextSize(10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
