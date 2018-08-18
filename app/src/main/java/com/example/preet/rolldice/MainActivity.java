package com.example.preet.rolldice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button rollButton;
    private TextView result;
    int low = 1;
    int high = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textView);
        rollButton = findViewById(R.id.rollButton);

        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int Result = r.nextInt(high-low)+ low;
                result.setText(Integer.toString(Result));


            }
        };

        rollButton.setOnClickListener(myOnClickListener);

    }
}
