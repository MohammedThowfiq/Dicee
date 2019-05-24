package com.mohammedthowfiq.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Roll= (Button) findViewById(R.id.btn_roll);

        final ImageView leftDice= (ImageView) findViewById(R.id.image_leftdice);
        final ImageView rightDice= (ImageView) findViewById(R.id.image_rightdice);


        final int [] diceArray = {R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};


        Roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("TestMessage","Button has been pressed");

                Random RandomGenerator= new Random();

                int number= RandomGenerator.nextInt(6);

                Log.d("TestMessage","The random number is:"+number);

                leftDice.setImageResource(diceArray[number]);

                number= RandomGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number]);



            }
        });


    }
}
