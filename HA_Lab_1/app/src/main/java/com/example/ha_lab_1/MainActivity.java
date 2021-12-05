package com.example.ha_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toast;
    EditText num1;
    EditText num2;
    Button submit;
    TextView result;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        submit = (Button) findViewById(R.id.submit_button);
        toast = (Button) findViewById(R.id.toast_button);

        result = (TextView) findViewById(R.id.result);

        toast.setOnClickListener(new View.OnClickListener() {
//            @Override
            public void onClick(View view) {
                Toast myToast = Toast.makeText(getApplicationContext(), "Hello!", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());

                sum = a + b;
                result.setText("The sum is: " + Integer.toString(sum));
                Intent i = new Intent(getApplicationContext(), NewResult.class);
                i.putExtra("Result", Integer.toString(sum));
                startActivity(i);
            }
        });

    }
}