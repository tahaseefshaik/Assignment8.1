package com.example.tahas.sortinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    Button ascending;
    Button descending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialize the button object

        ascending =(Button)findViewById(R.id.button6);
        descending =(Button)findViewById(R.id.button7);

        // create list of array

        final String arrayItems[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        final ListView listView=(ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,arrayItems);
        listView.setAdapter(arrayAdapter);

        // perofrm the action button
        ascending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Iterate over the Ascending order sorted array

                Arrays.sort(arrayItems);
                for (int i=0;i<arrayItems.length;i++) {
                    listView.setAdapter(listView.getAdapter());
                }

            }
        });

        descending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Iterate over the Descending order sorted array

                Arrays.sort(arrayItems, Collections.<String>reverseOrder());
                for (int i=0;i<arrayItems.length;i++)
                listView.setAdapter(listView.getAdapter());

            }
        });
    }
}
