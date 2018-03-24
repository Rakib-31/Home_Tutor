package com.example.asus_pc.home_tutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bangla,english,number,write,math,draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangla = (Button) findViewById(R.id.bangla);
        english = (Button) findViewById(R.id.english);
        number = (Button) findViewById(R.id.number);
        write = (Button) findViewById(R.id.write);
        math = (Button) findViewById(R.id.math);
        draw = (Button) findViewById(R.id.draw);

        bangla.setOnClickListener(this);
        english.setOnClickListener(this);
        number.setOnClickListener(this);
        write.setOnClickListener(this);
        math.setOnClickListener(this);
        draw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.bangla){
            Intent inten = new Intent(MainActivity.this, EnglishActivity.class);
            startActivity(inten);
        }

        else if(v.getId() == R.id.english){
            Intent inten = new Intent(MainActivity.this, EnglishActivity.class);
            startActivity(inten);
        }

    }
}
