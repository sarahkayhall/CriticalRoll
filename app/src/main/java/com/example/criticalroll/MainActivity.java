package com.example.criticalroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //private static int splash_time_out = 2000;

    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView text1;
    MediaPlayer dicerollMP;
    MediaPlayer dicehitMP;
    MediaPlayer dicemissMP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //new Handler().postDelayed(new Runnable() {
           // @Override
            //public void run(){
                //Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                        //startActivity(homeIntent);
                        //finish();


            //}
                                  //}, splash_time_out);



//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
//                //startActivity(homeIntent);
//                //homeIntent.hide(homeIntent);
//            }
//        } ,3000);




        text1 = findViewById(R.id.text1);
        dicerollMP = MediaPlayer.create(this, R.raw.diceroll);
        dicehitMP = MediaPlayer.create(this, R.raw.hit);
        dicemissMP = MediaPlayer.create(this, R.raw.miss);

        //final MediaPlayer dicerollMP = MediaPlayer.create(this, R.raw.diceroll);


        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();


                //dicerollMP.start();
            }
                                         }



        );

        //Critical Hit/Hecka Miss
            //super.onCreate(savedInstanceState);
            //setContentView(R.layout.activity_main);




    }


    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                dicemissMP.start();
                //getString(@string/).setText("Hey, one more TextView");
                text1.setText("Critical Miss!");
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                dicerollMP.start();
                text1.setText("");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                dicerollMP.start();
                text1.setText("");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                dicerollMP.start();
                text1.setText("");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                dicerollMP.start();
                text1.setText("");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                dicerollMP.start();
                text1.setText("");
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                dicerollMP.start();
                text1.setText("");
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                dicerollMP.start();
                text1.setText("");
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                dicerollMP.start();
                text1.setText("");
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                dicerollMP.start();
                text1.setText("");
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                dicerollMP.start();
                text1.setText("");
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                dicerollMP.start();
                text1.setText("");
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                dicerollMP.start();
                text1.setText("");
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                dicerollMP.start();
                text1.setText("");
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                dicerollMP.start();
                text1.setText("");
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                dicerollMP.start();
                text1.setText("");
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                dicerollMP.start();
                text1.setText("");
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                dicerollMP.start();
                text1.setText("");
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                dicerollMP.start();
                text1.setText("");
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                dicehitMP.start();
                text1.setText("Critical Hit!");
                break;

        }
    }


}
