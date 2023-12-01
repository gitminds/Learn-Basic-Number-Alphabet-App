package com.training.kidworldapp10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private ImageButton imagebtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        imagebtn = (ImageButton) findViewById(R.id.imageButton1);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);
            }
        };
        imagebtn.setOnClickListener(listener);
    }
}
