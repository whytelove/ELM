package com.example.piper.elm;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import uk.co.senab.photoview.PhotoViewAttacher;


/**
 * Created by Piper on 06/12/2017.
 */

public class MapFragment extends Fragment {
    private static final String TAG = "MapFragment";
    SeekBar seekBar; // seekBar pour le choix de l'UC du jour
    TextView uc ; // Text UC
    int progress = 1;



    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map_fragment,container,false);


        seekBar = (SeekBar) view.findViewById(R.id.seekBar3);
        uc = (TextView) view.findViewById(R.id.textview_uc);
        uc.setText("H"+progress);
        uc.setTextSize(20);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i +1;
                uc.setText("H"+progress);
                uc.setTextSize(20);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        return view;
    }
}
//"Research"