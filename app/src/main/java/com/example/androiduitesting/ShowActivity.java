package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity{
    EditText editCityName;
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        editCityName = findViewById(R.id.city_name);
        Intent intent = getIntent();

        String cityName = intent.getStringExtra("CITY_NAME");
        editCityName.setText(cityName);

        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
