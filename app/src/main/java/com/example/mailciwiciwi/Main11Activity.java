package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        Button pindah = (Button) findViewById(R.id.butom0);
        pindah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main11Activity.this, Main3Activity.class);
                Toast.makeText(Main11Activity.this, "Anda Berhasil Registrasi", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
    }
}
