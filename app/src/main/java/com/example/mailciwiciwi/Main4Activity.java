package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.upndepan, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        ImageView pindah = (ImageView) findViewById(R.id.imageView9);
        pindah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(i);
            }
        });
        ImageView pindah1 = (ImageView) findViewById(R.id.imageView10);
        pindah1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(i);
            }
        });
        ImageView pindah2 = (ImageView) findViewById(R.id.imageView11);
        pindah2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(i);
            }
        });
        ImageView pindah3 = (ImageView) findViewById(R.id.imageView8);
        pindah3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main6Activityprofile.class);
                startActivity(i);
            }
        });
        ImageView pindah4 = (ImageView) findViewById(R.id.imageView12);
        pindah4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main6Activitysend.class);
                startActivity(i);
            }
        });
        ImageView pindah5 = (ImageView) findViewById(R.id.imageView15);
        pindah5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main7Activity.class);
                startActivity(i);
            }
        });
        ImageView pindah6 = (ImageView) findViewById(R.id.imageView16);
        pindah6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(Main4Activity.this, "Reload Berhasil", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView pindah7 = (ImageView) findViewById(R.id.imageView6);
        pindah7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main4Activity.this, Main10Activity.class);
                startActivity(i);
            }
        });

    }
        @Override
        public void onItemSelected (AdapterView < ? > adapterView, View view,int i, long l){

        }

        @Override
        public void onNothingSelected (AdapterView < ? > adapterView){

        }
    }
