package com.example.asus_pc.home_tutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MathPractice extends AppCompatActivity implements View.OnClickListener {

    private Button firstButton, secondButton, thirdButton;
    private TextView firstPlaceText, symbolPlaceText, secondPlaceText,score,wrong;

    String firstNumber, symbol,secondNumber,firstButtonPlace,secondButtonPlace,thirdButtonPlace,scoreNumber,wrongNumber;
    int firstIntNumber, secondIntNumber, sum , firstIntButton,secondIntButton,thirdIntButton,scoreCount,wrongCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_math_practice );

        firstButton = ( Button ) findViewById ( R.id.FirstButtonId );
        secondButton = ( Button ) findViewById ( R.id.SecondButtonId );
        thirdButton = ( Button ) findViewById ( R.id.ThirdButtonId );

        firstPlaceText = ( TextView ) findViewById ( R.id.FirstNumberTextId );
        secondPlaceText = ( TextView ) findViewById ( R.id.SecondNumberTextId );
        symbolPlaceText = ( TextView ) findViewById ( R.id.SymbolTextId );
        score = ( TextView ) findViewById ( R.id.ScoreNumberId );
        wrong = ( TextView ) findViewById ( R.id.WrongNumberId);


        firstButton.setOnClickListener ( this );
        secondButton.setOnClickListener ( this );
        thirdButton.setOnClickListener ( this );



    }

    @Override
    public void onClick(View v) {

        sum = 0;

        firstNumber = firstPlaceText.getText ().toString ();
        symbol = symbolPlaceText.getText ().toString ();
        secondNumber = secondPlaceText.getText ().toString ();

        scoreNumber = score.getText ().toString ();
        wrongNumber = wrong.getText ().toString ();

        firstButtonPlace = firstButton.getText ().toString ();
        secondButtonPlace = secondButton.getText ().toString ();
        thirdButtonPlace= thirdButton.getText ().toString ();

        firstIntNumber = Integer.parseInt ( firstNumber );
        secondIntNumber = Integer.parseInt ( secondNumber );

        firstIntButton = Integer.parseInt ( firstButtonPlace );
        secondIntButton = Integer.parseInt ( secondButtonPlace );
        thirdIntButton = Integer.parseInt ( thirdButtonPlace );

        scoreCount = Integer.parseInt ( scoreNumber );
        wrongCount = Integer.parseInt ( wrongNumber );


        if(symbol == "+")
        {
            sum = firstIntNumber + secondIntNumber;
        }

        if (v.getId () == R.id.FirstButtonId)
        {
            if (sum == firstIntButton){

                scoreCount++;
            }

            else
                wrongCount++;

        }

        else if (v.getId () == R.id.SecondButtonId)
        {
            if (sum == secondIntButton){

                scoreCount++;
            }

            else
                wrongCount++;

        }

        else if (v.getId () == R.id.ThirdButtonId)
        {
            if (sum == thirdIntButton){

                scoreCount++;
            }

            else
                wrongCount++;

        }

        String scoreCo = String.valueOf ( scoreCount );
        String wrongCo = String.valueOf ( wrongCount );

        score.setText ( scoreCo );
        wrong.setText ( wrongCo );
        //update


    }
}
