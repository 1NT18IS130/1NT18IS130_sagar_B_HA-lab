package com.example.ha_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NewResult extends AppCompatActivity {

    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result = (TextView) findViewById(R.id.result_text);
        Bundle extras = getIntent().getExtras();
        String ans = extras.getString("Result");
        Toast.makeText(getApplicationContext(),ans,Toast.LENGTH_SHORT).show();
        result.setText("Result = " + ans);
    }
}
