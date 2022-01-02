package com.example.ha_lab_6;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myList;
        String countryList[];

        myList = findViewById(R.id.list) ;
        countryList = getResources().getStringArray(R.array.country) ;

        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, R.layout.textview_layout, countryList);

        myList.setAdapter(arrayAdapter);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, "You have clicked:"+parent.getItemAtPosition(position),
            Toast.LENGTH_SHORT).show();
        }
        });
    }
}