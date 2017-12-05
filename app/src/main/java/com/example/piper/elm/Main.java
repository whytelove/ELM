package com.example.piper.elm;

        import android.content.res.Resources;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.TextView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Resources patate = getResources();
        String text = patate.getString(R.string.app_name);
        text = text.replace("bleu", "rouge");
        TextView blabla = new TextView(this);
        blabla.setText(patate.getText(R.string.HW));
        setContentView(blabla);
        setContentView(R.layout.activity_main);
    }
}
