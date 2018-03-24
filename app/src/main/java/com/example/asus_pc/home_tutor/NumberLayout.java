package com.example.asus_pc.home_tutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NumberLayout extends AppCompatActivity implements View.OnClickListener{

    private Button zerotonineButton, sunnotonoyButton , pronouncationButton,numberplaceButton;
    private ImageButton nextButton,previousButton;
    int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_number_layout );

        zerotonineButton = ( Button ) findViewById ( R.id.zerotonineButtonId );
        sunnotonoyButton = ( Button ) findViewById ( R.id.sunnotonoyButtonId);
        numberplaceButton = ( Button ) findViewById ( R.id.numberplaceId );
        pronouncationButton = ( Button ) findViewById ( R.id.pronouncationButtonId );
        nextButton = ( ImageButton ) findViewById ( R.id.nextButtonId );
        previousButton = ( ImageButton ) findViewById ( R.id.prviousButtonId );


        zerotonineButton.setOnClickListener ( this );
        sunnotonoyButton.setOnClickListener ( this );
        pronouncationButton.setOnClickListener ( this );
        nextButton.setOnClickListener ( this );
        previousButton.setOnClickListener ( this );

    }

    @Override
    public void onClick(View v) {



        if(v.getId () == R.id.zerotonineButtonId)
        {

            numberplaceButton.setText ( "0" );
        }

       else if(v.getId () == R.id.nextButtonId)
        {
            p++;
            if (p == 100)
            {
                p = 0;
            }
            String str = String.valueOf ( p );

            numberplaceButton.setText ( str );

        }

    }


}
