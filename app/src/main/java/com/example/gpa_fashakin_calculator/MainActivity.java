package com.example.gpa_fashakin_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables for the grades
    private EditText g1, g2, g3, g4, g5;
    private TextView gpaDisplay;
    private double n1, n2, n3, n4, n5;
    private LinearLayout app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (LinearLayout) findViewById(R.id.container);

        g1 = (EditText) findViewById(R.id.et1);
        g2 = (EditText) findViewById(R.id.et2);
        g3 = (EditText) findViewById(R.id.et3);
        g4 = (EditText) findViewById(R.id.et4);
        g5 = (EditText) findViewById(R.id.et5);

        n1 = Double.parseDouble(g1.getText().toString());
        n2 = Double.parseDouble(g2.getText().toString());
        n3 = Double.parseDouble(g3.getText().toString());
        n4 = Double.parseDouble(g4.getText().toString());
        n5 = Double.parseDouble(g5.getText().toString());

        gpaDisplay = (TextView) findViewById(R.id.tv6);

    }


    public void doManyThings(View view) {

        if(g1.getText().toString().isEmpty() || n1 > 100 || n1 < 0){
            g1.setText(R.string.error);
            g1.setBackgroundColor(Color.RED);
        }
        else if(g2.getText().toString().isEmpty() || n2 > 100 || n2 < 0){
            g2.setText(R.string.error);
        }
        else if(g3.getText().toString().isEmpty() || n3 > 100 || n3 < 0){
            g3.setText(R.string.error);
        }
        else if(g4.getText().toString().isEmpty() || n4 > 100 || n4 < 0){
            g4.setText(R.string.error);
        }
        else if(g5.getText().toString().isEmpty() || n5 > 100 || n5 < 0){
            g5.setText(R.string.error);
        }
        else{
            double total, gpa;
            total = n1 + n2 + n3 + n4 + n5;
            gpa = total/5.0;

            gpaDisplay.setText(String.valueOf(gpa));

            if(gpa > 79){
                app.setBackgroundColor(Color.GREEN);}
            else if (gpa > 59 ){
                app.setBackgroundColor(Color.YELLOW);}
            else {
                app.setBackgroundColor(Color.RED);}



        }
    }
}