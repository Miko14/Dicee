package com.example.xslezakm1.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.example.xslezakm1.dicee.R.id.rollButton;

public class MainActivity extends AppCompatActivity {

    private static final String MYTAG = "MYTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerated = new Random();

                //Random number between 0 and 5
                int number = randomNumberGenerated.nextInt(6);

                // +1 because starting index is 0 and number of dots on dices are from 1 to 6 and not from 0 to 5 =)
                Log.d("Dicee","Left dice number is: "+ (int)(number+1));
                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerated.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
                Log.d("Dicee","Right dice number is: "+ (int)(number+1));

            }
        });

    }
}
