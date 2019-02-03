package com.example.pc.yasmine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listactivity extends AppCompatActivity {
ListView ListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactivity);
     ListView=(ListView)findViewById(R.id.ListView);
        final ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("android");
        arrayList.add("iphone");
        arrayList.add("windows");
        arrayList.add("bluckberry");
        arrayList.add("linux");
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        ListView.setAdapter(arrayAdapter);
        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(listactivity.this,"clicked item"+i+" "+arrayList.get(i).toString(),Toast.LENGTH_SHORT).show();
                Intent messageIntent = new Intent(listactivity. this, DeviceDetailActivity.class);
                startActivity(messageIntent);
            }
        });



    }
}
