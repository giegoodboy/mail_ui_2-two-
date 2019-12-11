package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        ImageView pindah5 = (ImageView) findViewById(R.id.imageView35);
        pindah5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main8Activity.this,Main2Activity.class);
                Toast.makeText(Main8Activity.this, "Anda Sudah Log Out", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        ImageView pindah6 = (ImageView) findViewById(R.id.imageView36);
        pindah6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main8Activity.this,Main6Activityprofile.class);
                startActivity(i);
            }
        });
    }
}
