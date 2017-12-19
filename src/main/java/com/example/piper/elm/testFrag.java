package com.example.piper.elm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import java.lang.String;
import java.util.Map;

/**
 * Created by Piper on 06/12/2017.
 */

public class testFrag extends Fragment {
    private static final String TAG = "MapFragment";


    private TextView mretDate;
    private TextView mretH1,mretH2,mretH3,mretH4,mretH5,mretH6;
    private TextView mretH1Course,mretH2Course,mretH3Course,mretH4Course,mretH5Course,mretH6Course;

    private Firebase nRootRef;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_fragment,container,false);

        nRootRef = new Firebase("https://eniblivemap.firebaseio.com/");

        mretDate= view.findViewById(R.id.retDate);

        mretH1 = view.findViewById(R.id.retH1);
        mretH2 = view.findViewById(R.id.retH2);
        mretH3 = view.findViewById(R.id.retH3);
        mretH4 = view.findViewById(R.id.retH4);
        mretH5 = view.findViewById(R.id.retH5);
        mretH6 = view.findViewById(R.id.retH6);

        mretH1Course = view.findViewById(R.id.retH1Course);
        mretH2Course = view.findViewById(R.id.retH2Course);
        mretH3Course = view.findViewById(R.id.retH3Course);
        mretH4Course = view.findViewById(R.id.retH4Course);
        mretH5Course = view.findViewById(R.id.retH5Course);
        mretH6Course = view.findViewById(R.id.retH6Course);


        nRootRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                Map <String, String> map = dataSnapshot.getValue(Map.class);

               /* String Date = map.get("Jean");
                String H1Course = map.get("H1");
                String H2Course = map.get("H2");
                String H3Course = map.get("H3");
                String H4Course = map.get("H4");
                String H5Course = map.get("H5");
                String H6Course = map.get("H6");

                */
                mretDate.setText(map.get("Age"));

               // mretH1Course.setText("ELEC");
                /*mretH2Course.setText(H2Course);
                mretH3Course.setText(H3Course);
                mretH4Course.setText(H4Course);
                mretH5Course.setText(H5Course);
                mretH6Course.setText(H6Course);
*/

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });




        return view;
    }
}
