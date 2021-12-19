package com.example.ha_lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    String digits;
    String[] split_digits;
    float result = 0;
    int flag = 1;
    EditText display;
    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button plus, minus, multiply, divide, equal, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (EditText) findViewById(R.id.display);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        equal = (Button) findViewById(R.id.equal);
        back = (Button) findViewById(R.id.back);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("0");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("*");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("/");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = 0;
                digits = display.getText().toString();
                System.out.println(digits);
                for (int i = 0; i< digits.length(); i++) {
                    if (digits.charAt(i) == '+') {
                        split_digits = digits.split(Pattern.quote("+"), 2);
                        System.out.println(split_digits);
                        result = Integer.parseInt(split_digits[0]) + Integer.parseInt(split_digits[1]);
                    }

                    if (digits.charAt(i) == '-') {
                        split_digits = digits.split(Pattern.quote("-"), 2);
                        System.out.println(split_digits);
                        result = Integer.parseInt(split_digits[0]) - Integer.parseInt(split_digits[1]);
                    }

                    if (digits.charAt(i) == '*') {
                        split_digits = digits.split(Pattern.quote("*"), 2);
                        System.out.println(split_digits);
                        result = Integer.parseInt(split_digits[0]) * Integer.parseInt(split_digits[1]);
                    }
                    if (digits.charAt(i) == '/') {
                        split_digits = digits.split(Pattern.quote("/"), 2);
                        System.out.println(split_digits);
                        if(Integer.parseInt(split_digits[1]) == 0)
                            flag = 0;
                        try {
                            result = (float) Integer.parseInt(split_digits[0]) / (float) Integer.parseInt(split_digits[1]);
                        } catch (Exception e) {
                            System.out.println();
                        }
                    }
                }
                if (flag == 1)
                    display.setText(Float.toString(result));
                else
                    display.setText("Error!");
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("");
            }
        });
    }
}