package com.example.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//              //  Toast.makeText(MainActivity.this, "hello you are click in right place", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205*kg;
//                textview.setText("the corresponding value is in pound is "+pound);
//            }
//        });
    }
    public void calculate(View View){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205*kg;
        textview.setText("the corresponding value is in pound is "+pound);

    }
}
