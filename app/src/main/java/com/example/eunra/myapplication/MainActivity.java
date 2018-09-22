package com.example.eunra.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        ArrayList<country> objects;
        ListView lv;
        CountryAdapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv =findViewById(R.id.lv);

        objects = new ArrayList<>();
        objects.add(new country("USA", 1, R.mipmap.ic_launcher));
        objects.add(new country("USA", 1, R.drawable.qtql));

        adt = new CountryAdapter(MainActivity.this, R.layout.country_item, objects);

        lv.setAdapter(adt);


    }

}
