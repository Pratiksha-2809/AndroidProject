package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TAG","onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG","onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TAG","onPause called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TAG","onRestart called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TAG","onDestroy called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("TAG","onCreate called");
    }
}