package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main6Activityprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_activityprofile);

        ImageView pindah5 = (ImageView) findViewById(R.id.imageView8);
        pindah5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main6Activityprofile.this,Main8Activity.class);
                startActivity(i);
            }
        });
    }
}
