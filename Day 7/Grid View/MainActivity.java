package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gv1;
    String course[]={"PHP","Android","IOS","C","IONIC","ANGULAR","WORDPRESS","JAVA","C#","HTML","FIREBASE","C++","NODE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv1 = findViewById(R.id.gv1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_gallery_item,course);
        gv1.setAdapter(arrayAdapter);

        gv1.setOnItemClickListener((parent, view, position, id) ->{
            Toast.makeText(getApplicationContext(),course[position],Toast.LENGTH_SHORT).show();
        } );
    }
}