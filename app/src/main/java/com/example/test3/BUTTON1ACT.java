package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BUTTON1ACT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        Button buttonn1 = (Button) findViewById(R.id.buttonn1);
        Button buttonn2 = (Button) findViewById(R.id.buttonn2);
        Button buttonn3 = (Button) findViewById(R.id.buttonn3);
        Button buttonn4 = (Button) findViewById(R.id.buttonn4);



        buttonn1.setOnClickListener(v -> {
            Intent intent = new Intent(this,HomeActivity.class);
            startActivity(intent);
        });

        buttonn2.setOnClickListener(v -> {
            Intent intent = new Intent(this,cardio2.class);
            startActivity(intent);
        });

        buttonn3.setOnClickListener(v -> {
            Intent intent = new Intent(this,aboutUS.class);
            startActivity(intent);
        });


        // on below line we are adding click listener for our button
        buttonn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // on below line we are finishing activity.
                BUTTON1ACT.this.finish();

                // on below line we are exiting our activity
                System.exit(0);

            }
        });
    }
}