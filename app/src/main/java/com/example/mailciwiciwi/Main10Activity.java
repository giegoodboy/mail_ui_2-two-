package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        ImageView pindah = (ImageView) findViewById(R.id.imageView);
        pindah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main10Activity.this, "Maaf Fitur Belum Ada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
