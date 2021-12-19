package com.example.ha_lab_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button dial;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dial = (Button) findViewById(R.id.dial_button);
        num = (EditText) findViewById(R.id.number);
        dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = num.getText().toString();
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + num1));
                startActivity(i);
            }
        });
    }
}