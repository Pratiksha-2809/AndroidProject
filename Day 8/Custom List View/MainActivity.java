package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv1;
    int image[]={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5,R.drawable.image6,};
    String []name={
            "This is Image1","This is Image2","This is Image3","This is Image4","This is Image5","This is Image6"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = findViewById(R.id.lv1);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this,image,name);
        lv1.setAdapter(myAdapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        }
        );
    }
}