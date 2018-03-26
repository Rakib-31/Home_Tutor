package com.example.asus_pc.home_tutor;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Locale;

public class Alphabet extends AppCompatActivity implements View.OnClickListener{

    private Button small,capital,pronunciation;
    private Button letter;
    private ImageButton leftarrow,rightarrow;
    TextToSpeech toSpeech;
    int result;
    boolean test = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        toSpeech = new TextToSpeech(Alphabet.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    result = toSpeech.setLanguage(Locale.UK);
                }
            }
        });

        small = (Button) findViewById(R.id.small);
        capital = (Button) findViewById(R.id.capital);
        pronunciation = (Button) findViewById(R.id.pronunciation);
        letter = (Button) findViewById(R.id.letter);
        leftarrow = (ImageButton) findViewById(R.id.leftarrow);
        rightarrow = (ImageButton) findViewById(R.id.rightarrow);

        small.setOnClickListener(this);
        capital.setOnClickListener(this);
        pronunciation.setOnClickListener(this);
        leftarrow.setOnClickListener(this);
        rightarrow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.small){
            letter.setText("a");
            test = false;
        }
        else if(v.getId() == R.id.capital){
            letter.setText("A");
            test = false;
        }
        else if(v.getId() == R.id.leftarrow){
            if(test)
                letter.setText(" ");
            else {
                String put = letter.getText().toString();
                char p = put.charAt(0);
                if (p == 'A')
                    p = 91;
                else if (p == 'a')
                    p = 123;
                char p1 = (char) (p - 1);
                String p2 = String.valueOf(p1);
                letter.setText(p2);
            }
        }

        else if(v.getId() == R.id.rightarrow){
            if(test)
                letter.setText(" ");
            else {
                String put = letter.getText().toString();
                char p = put.charAt(0);
                if (p == 'Z')
                    p = 64;
                else if (p == 'z')
                    p = 96;
                char p1 = (char) (p + 1);
                String p2 = String.valueOf(p1);
                letter.setText(p2);
            }
        }

        else if(v.getId() == R.id.pronunciation){
            String text = letter.getText().toString();
            toSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
        }
    }
}
