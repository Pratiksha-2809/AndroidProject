ackage com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button add , mul , sub , div;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1,num2;

                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);

                int sum = a + b;

                Toast.makeText(MainActivity.this, "Sum is "+sum, Toast.LENGTH_SHORT).show();

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1,num2;

                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);

                int sum = a * b;

                Toast.makeText(MainActivity.this, "Multiplication is "+sum, Toast.LENGTH_SHORT).show();

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1,num2;

                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);

                int sum = a / b;

                Toast.makeText(MainActivity.this, "Division is "+sum, Toast.LENGTH_SHORT).show();

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num1,num2;

                num1 = n1.getText().toString();
                num2 = n2.getText().toString();

                int a = Integer.parseInt(num1);
                int b = Integer.parseInt(num2);

                int sum = a - b;

                Toast.makeText(MainActivity.this, "Substraction is "+sum, Toast.LENGTH_SHORT).show();

            }
        });
    }
}