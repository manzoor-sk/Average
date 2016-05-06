package com.example.minimac2.avg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    int[] numbers = new int[]{10,20,15,25,16,60,100};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        int sum = 0;

        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        //calculate average value
        double average = sum / numbers.length;

        text.setText(text.getText().toString()+String.valueOf(average));
    }
}
  