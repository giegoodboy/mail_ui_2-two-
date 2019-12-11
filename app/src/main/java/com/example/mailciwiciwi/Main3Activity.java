package com.example.mailciwiciwi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btn1 = (Button) findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
            }
        });

        TextView pindah = (TextView) findViewById(R.id.textView5);
        pindah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main3Activity.this, Main11Activity.class);
                startActivity(i);
            }
        });
    }
}
