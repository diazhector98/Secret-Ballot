package com.example.hectordiazaceves.secretballot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native metho

        TextView qInfo = (TextView) findViewById(R.id.tvQuestion);

        Button btnOption1 = (Button) findViewById(R.id.btnOption1);
        Button btnOption2 = (Button) findViewById(R.id.btnOption2);
        Button btnOption3 = (Button) findViewById(R.id.btnOption3);




        Question q = new Question();
        q.setQuestion("Who is the president?");

        String[] sArr = {"Obama", "Trump", "Rihanna"};

        q.setOptions(sArr);

        qInfo.setText(q.getQuestion());

        btnOption1.setText(sArr[0]);
        btnOption2.setText(sArr[1]);
        btnOption3.setText(sArr[2]);





    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
