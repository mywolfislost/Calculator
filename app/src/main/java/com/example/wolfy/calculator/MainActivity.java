package com.example.wolfy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button clear;
    private Button point;
    private Button answer;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION ='*';
    private final char DIVISION = '/';
    private double val1 = Double.NaN;
    private double val2 ;
    private char ACTION;
    private final char EQU = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIviews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                // 5 + 4 = 9
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });


















    }

    private void setupUIviews() {

        one = (Button)findViewById(R.id.b1);
        two = (Button)findViewById(R.id.b2);
        three =(Button)findViewById(R.id.b3);
        four = (Button)findViewById(R.id.b4);
        five = (Button)findViewById(R.id.b5);
        six = (Button)findViewById(R.id.b6);
        seven = (Button)findViewById(R.id.b7);
        eight = (Button)findViewById(R.id.b8);
        nine = (Button)findViewById(R.id.b9);
        zero = (Button)findViewById(R.id.b0);
        add = (Button)findViewById(R.id.badd);
        sub = (Button)findViewById(R.id.bsub);
        mul = (Button)findViewById(R.id.bmul);
        div = (Button)findViewById(R.id.bdiv);
        point = (Button)findViewById(R.id.bdot);
        answer = (Button)findViewById(R.id.bans);
        info = (TextView)findViewById(R.id.tvcontrol);
        result = (TextView)findViewById(R.id.tvdisplay);
        clear = (Button)findViewById(R.id.bclr);

    }
     private void compute() {
     if(!Double.isNaN(val1)) {
        val2 = Double.parseDouble(info.getText().toString());

         switch(ACTION){
             case ADDITION:
                 val1=val1+val2;
                 break;
                 case SUBTRACTION:
                     val1=val1-val2;
                     break;
                     case DIVISION:
                         val1=val1/val2;
                         break;
                         case MULTIPLICATION:
                             val1 = val1 * val2;
                             break;
                         case EQU:
                             break;
                     }
                     }
        else {

                     val1 = Double.parseDouble(info.getText().toString());



                 }
             }


}

