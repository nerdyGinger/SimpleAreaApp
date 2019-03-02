package com.nerdyGinger.simpleareaapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void calculateClick(View view) {
        EditText heightBox = findViewById(R.id.hBox);
        EditText widthBox = findViewById(R.id.wBox);
        int area = 0;

        try {
            Integer height = Integer.parseInt(heightBox.getText().toString());
            Integer width = Integer.parseInt(widthBox.getText().toString());
            area = height * width;
        } catch (Exception ex) {
            Toast.makeText(this, "Please enter actual numbers", Toast.LENGTH_SHORT).show();
        }

        TextView areaBox = findViewById(R.id.areaBox);
        areaBox.setText("Area = " + Integer.toString(area));
    }

}
