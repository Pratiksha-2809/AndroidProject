package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView ivimage;
    TextView tvnamedetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ivimage=findViewById(R.id.ivimage);
        tvnamedetail=findViewById(R.id.tvnamedetail);
        Intent intent = getIntent();
        int image = intent.getIntExtra("image",R.drawable.image1);
        ivimage.setImageResource(image);
        String name = intent.getStringExtra("name");
        tvnamedetail.setText(name);
    }
}