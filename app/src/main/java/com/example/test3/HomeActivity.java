package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.lang.reflect.Type;

public class HomeActivity extends AppCompatActivity {
   private TextView textView;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button buttonn = (Button) findViewById(R.id.buttonn1);
        Button buttonn2 = (Button) findViewById(R.id.buttonn2);
        Button buttonn3 = (Button) findViewById(R.id.buttonn3);
        Button buttonn4 = (Button) findViewById(R.id.buttonn4);



        buttonn.setOnClickListener(v -> {
        Intent intent = new Intent(this,WaterActivity.class);
        startActivity(intent);
        });

        buttonn2.setOnClickListener(v -> {
            Intent intent = new Intent(this,Bodybuilding.class);
            startActivity(intent);
        });

        buttonn3.setOnClickListener(v -> {
            Intent intent = new Intent(this,yoga_testpage.class);
            startActivity(intent);
        });

        buttonn4.setOnClickListener(v -> {
            Intent intent = new Intent(this,yoga3.class);
            startActivity(intent);
        });


    }
}