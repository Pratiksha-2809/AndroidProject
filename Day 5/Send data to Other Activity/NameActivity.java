package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    TextView tvname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        tvname = findViewById(R.id.tvname);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        tvname.setText("Welcome: "+name);
    }
}