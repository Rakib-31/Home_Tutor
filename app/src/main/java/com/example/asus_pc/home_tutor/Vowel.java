package com.example.asus_pc.home_tutor;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Locale;

public class Vowel extends AppCompatActivity implements View.OnClickListener{

    private Button small,capital,pronunciation;
    private Button letter;
    private ImageButton leftarrow,rightarrow;
    TextToSpeech toSpeech;
    int result,count = -1;
    boolean test;

    String[] smallVow = {"a","e","i","o","u"};

    String[] capitalVow = {"A","E","I","O","U"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vowel);

        toSpeech = new TextToSpeech(Vowel.this, new TextToSpeech.OnInitListener() {
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
            count = 0;
            test = true;
        }

        else if(v.getId() == R.id.capital){
            letter.setText("A");
            count = 0;
            test = false;
        }
        else if(v.getId() == R.id.leftarrow){
            if(count == -1)
                letter.setText(" ");
            else {
                if (count == 0)
                    count = 5;
                count--;
                if (test)
                    letter.setText(smallVow[count]);
                else
                    letter.setText(capitalVow[count]);
            }
        }

        else if(v.getId() == R.id.rightarrow){
            if(count == -1)
                letter.setText(" ");
            else {
                if (count == 4)
                    count = -1;
                count++;
                if (test)
                    letter.setText(smallVow[count]);
                else
                    letter.setText(capitalVow[count]);
            }
        }

        else if(v.getId() == R.id.pronunciation){
            String text = letter.getText().toString();
            toSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);
        }
    }
}
