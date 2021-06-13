package com.example.senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone,pass,hob1,hob2,hob3,hob4;
    RadioButton male,female,other;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        pass = findViewById(R.id.pass);
        hob1 = findViewById(R.id.hob1);
        hob2 = findViewById(R.id.hob2);
        hob3 = findViewById(R.id.hob3);
        hob4 = findViewById(R.id.hob4);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        other = findViewById(R.id.other);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name = name.getText().toString();
                String Email = email.getText().toString();
                String Phone = phone.getText().toString();
                String Password = pass.getText().toString();
                String hobb1 = hob1.getText().toString();
                String hobb2 = hob2.getText().toString();
                String hobb3 = hob3.getText().toString();
                String hobb4 = hob4.getText().toString();
                String Male = "Male";
                String Female = "Female";
                String Other = "Other";
                Intent intent = new Intent(MainActivity.this,NameActivity.class);
                intent.putExtra("Name",Name);
                intent.putExtra("Email",Email);
                intent.putExtra("Phone",Phone);
                intent.putExtra("Password",Password);
                intent.putExtra("Hobby 1",hobb1);
                intent.putExtra("Hobby 2",hobb2);
                intent.putExtra("Hobby 3",hobb3);
                intent.putExtra("Hobby 4",hobb4);
                if(male.isChecked())
                {
                    intent.putExtra("Gender",Male);
                }
                if(female.isChecked())
                {
                    intent.putExtra("Gender",Female);
                }
                if(other.isChecked())
                {
                    intent.putExtra("Gender",Other);
                }
                startActivity(intent);

            }
        });
    }
}