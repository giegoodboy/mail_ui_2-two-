package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ImageView pindah = (ImageView) findViewById(R.id.imageView22);
        pindah.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main5Activity.this,Main9Activity.class);
                Toast.makeText(Main5Activity.this, "Replay Pesan", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
