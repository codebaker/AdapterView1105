package com.codebakery.joan.adapterview1105;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Data
        ArrayList<String> data = new ArrayList<>();
        for (int i=0; i<30; i++) {
            data.add("data " + i);
        }

        //Adapter
        MyBaseAdapter adapter = new MyBaseAdapter(data);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this, i + " 번째 아이템 선택", Toast.LENGTH_SHORT).show();
    }
}
