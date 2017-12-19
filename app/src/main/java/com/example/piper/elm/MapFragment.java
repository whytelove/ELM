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

import java.io.File;
import java.util.Scanner;

import uk.co.senab.photoview.PhotoViewAttacher;


/**
 * Created by Piper on 06/12/2017.
 */

public class MapFragment extends Fragment {

    private static final String TAG = "MapFragment";
    SeekBar seekBar; // seekBar pour le choix de l'UC du jour
    TextView uc_std ; // Text UC
    TextView course ; // Text Cours
    int progress = 1;
    String[] uc = {""};
    String[] cours = {""};
    String word;
    File file = new File("C:\\Users\\dorian\\Documents\\ELM\\app\\src\\main\\res\\d4quilfe.ics");



    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map_fragment,container,false);


        System.out.print(cours[0]);
        System.out.print(uc[0]);
        seekBar = (SeekBar) view.findViewById(R.id.seekBar3);
        uc_std = (TextView) view.findViewById(R.id.textview_uc);
        course = (TextView) view.findViewById(R.id.course);

        uc_std.setTextSize(20);
        System.out.print(uc_std.getText().toString());
        uc_std.setText("H1");
        if (uc_std.getText().toString() == "H1") course.setText("Labo Ang");


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                progress = i +1;
                if (progress == 2) uc_std.setText("H2");
                else if (progress == 3) uc_std.setText("H3");
                else if (progress == 4) uc_std.setText("H4");
                else if (progress == 5) uc_std.setText("H5");
                else if (progress == 6) uc_std.setText("H6");
                else if (progress == 7) uc_std.setText("H7");
                uc_std.setTextSize(20);
                if (uc_std.getText().toString() == "H2") course.setText("Bdd");
                else if(uc_std.getText().toString() == "H3") course.setText("Poo");
                else if(uc_std.getText().toString() == "H4") course.setText("Pause midi");
                else if(uc_std.getText().toString() == "H5") course.setText("ASN");
                else if(uc_std.getText().toString() == "H6") course.setText("SHI");
                else if(uc_std.getText().toString() == "H7") course.setText("Pas cours");


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        }
        );



        return view;
    }
}
//"Research"