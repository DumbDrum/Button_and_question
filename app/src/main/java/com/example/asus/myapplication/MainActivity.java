package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TrueFalse [] arr ={
           new TrueFalse ("Желе или не желе ты?",true),
            new TrueFalse("Is oblivion a good game",true),
             new TrueFalse("Is it a cat",false)

    };
    TrueFalse uslv;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView tw;
    int mPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        tw = (TextView) findViewById(R.id.tw);
        tw.setText(arr[mPos].getQuestionText());
        mPos = 0;
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPos++;
                if (mPos>arr.length){
                    mPos=0;
                }
                tw.setText(arr[mPos].getQuestionText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPos--;
                if (mPos<0){
                    mPos=mPos+arr.length;
                }
                tw.setText(arr[mPos].getQuestionText());
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arr[mPos].getTrue()==true){
                    Toast.makeText(MainActivity.this,R.string.toast1,Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,R.string.toast2,Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arr[mPos].getTrue()==false){
                    Toast.makeText(MainActivity.this,R.string.toast1,Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,R.string.toast2,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
