package com.example.asus_pc.home_tutor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnglishActivity extends AppCompatActivity implements View.OnClickListener {

    private Button alphabet,vowel,consonant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        alphabet = (Button) findViewById(R.id.Alphabet);
        vowel = (Button) findViewById(R.id.vowel);
        consonant = (Button) findViewById(R.id.consonant);

        alphabet.setOnClickListener(this);
        vowel.setOnClickListener(this);
        consonant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.Alphabet){
            Intent inten = new Intent(EnglishActivity.this, Alphabet.class);
            startActivity(inten);
        }
        else if(v.getId() == R.id.vowel){
            Intent inten = new Intent(EnglishActivity.this, Vowel.class);
            startActivity(inten);
        }
        else if(v.getId() == R.id.consonant){
            Intent inten = new Intent(EnglishActivity.this, Consonant.class);
            startActivity(inten);
        }
    }
}
