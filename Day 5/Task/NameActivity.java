package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    TextView tvname1,tvname2,tvname3,tvname4,tvname5,tvname6,tvname7,tvname8,tvname9,tvname10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        tvname1 = findViewById(R.id.tvname1);
        tvname2 = findViewById(R.id.tvname2);
        tvname3 = findViewById(R.id.tvname3);
        tvname4 = findViewById(R.id.tvname4);
        tvname5 = findViewById(R.id.tvname5);
        tvname6 = findViewById(R.id.tvname6);
        tvname7 = findViewById(R.id.tvname7);
        tvname8 = findViewById(R.id.tvname8);
        tvname9 = findViewById(R.id.tvname9);
        tvname10 = findViewById(R.id.tvname10);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");
        String phone = intent.getStringExtra("Phone");
        String gender = intent.getStringExtra("Gender");
        String pass = intent.getStringExtra("Password");
        String Hobb1 = intent.getStringExtra("Hobby 1");
        String Hobb2 = intent.getStringExtra("Hobby 2");
        String Hobb3 = intent.getStringExtra("Hobby 3");
        String Hobb4 = intent.getStringExtra("Hobby 4");

        tvname1.setText("Welcome: "+name);
        tvname2.setText("Gender: "+gender);
        tvname3.setText("Email: "+email);
        tvname4.setText("Phone:"+phone);
        tvname5.setText("Password:"+pass);
        tvname6.setText("Hobbies are:");
        tvname7.setText(Hobb1);
        tvname8.setText(Hobb2);
        tvname9.setText(Hobb3);
        tvname10.setText(Hobb4);
    }
}