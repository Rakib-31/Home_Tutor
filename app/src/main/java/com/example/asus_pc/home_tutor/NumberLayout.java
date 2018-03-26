package com.example.asus_pc.home_tutor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.lang.reflect.Array;

public class NumberLayout extends AppCompatActivity implements View.OnClickListener{

    private Button zerotonineButton, sunnotonoyButton , pronouncationButton,numberplaceButton;
    private ImageButton nextButton,previousButton;

    int p = 0,i = 0, j = 0;
    boolean test;

    String[] banglaNumberArray = {"১","২","৩","৪","৫","৬","৭","৮","৯","১০"};
    String[] englishaNumberArray = {"1","2","3","4","5","6","7","8","9","10"};


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
            test = true;
            i = 0;

        }

        else if (v.getId () == R.id.sunnotonoyButtonId)
        {
            numberplaceButton.setText ( "০" );
            test = false;
            j = 0;

        }

        else if(v.getId () == R.id.nextButtonId)
        {


           if (test)
           {
               numberplaceButton.setText ( englishaNumberArray[i] );

               if (i==9)
               {
                 i = -1;
               }
               i++;
           }

           else
           {
               numberplaceButton.setText ( banglaNumberArray[j] );
               if (j==9)
               {
                   j = -1;
               }
               j++;

           }


        }


         else if(v.getId () == R.id.prviousButtonId)
        {

            if (test)
            {
                if (i== 0)
                {
                    i = 10;
                }

                i--;
                numberplaceButton.setText ( englishaNumberArray[i] );

            }

            else
            {
                if (j== 0)
                {
                    j = 10;
                }

                j--;
                numberplaceButton.setText ( banglaNumberArray[j] );


            }

        }






    }


}
