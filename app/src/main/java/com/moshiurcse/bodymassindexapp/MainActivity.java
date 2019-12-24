package com.moshiurcse.bodymassindexapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText height,weight;
    TextView result;
    Button calculateBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height=findViewById(R.id.heightET);
        weight=findViewById(R.id.weightET);
        result=findViewById(R.id.resultTV);
    }

    public void calculateResult(View view) {

        int height1=Integer.parseInt(height.getText().toString());

        float meter= (float) ((height1*2.54)/100);
        float weight1=Float.parseFloat(weight.getText().toString());

        float bmi=weight1/(float)(meter*meter);
        if(bmi<=18.5){
            result.setText("Under weight "+bmi);
        }else if(bmi>18.5 && bmi<24.9){
            result.setText("Normal weight "+bmi);
        }else{
            result.setText("Over weight "+bmi);
        }



    }
}
