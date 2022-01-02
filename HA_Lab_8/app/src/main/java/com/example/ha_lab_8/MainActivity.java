package com.example.ha_lab_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1;
    ImageView iv;
    boolean flag;
    int images[] = {R.drawable.doggo1, R.drawable.doggo2};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.imageView);
        b1 = (Button) findViewById(R.id.button);

        flag = true;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.setImageResource(images[i]);
                i++;
                if(i==2)
                    i=0;
            }
        });
    }
}