package com.visheshpandey.gameofluck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView textViewScore ;
    TextView textViewResult ;

    ImageView imageView1 ;
    ImageView imageView2 ;
    ImageView imageView3 ;

    ImageView imageView6 ;
    ImageView imageView7 ;
    ImageView imageView8 ;

    ImageView imageView9 ;
    ImageView imageView10 ;
    ImageView imageView11 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewScore = findViewById(R.id.textViewScore) ;
        textViewResult = findViewById(R.id.textViewResult) ;

        imageView1 = findViewById(R.id.imageView1) ;
        imageView2 = findViewById(R.id.imageView2) ;
        imageView3 = findViewById(R.id.imageView3) ;

        imageView6 = findViewById(R.id.imageView6) ;
        imageView7 = findViewById(R.id.imageView7) ;
        imageView8 = findViewById(R.id.imageView8) ;

        imageView9 = findViewById(R.id.imageView9) ;
        imageView10 = findViewById(R.id.imageView10) ;
        imageView11= findViewById(R.id.imageView11) ;

        //Creating random number to get the different situations of the game
        ArrayList numbers = new ArrayList() ;
        for ( int i = 1 ; i < 10 ; i++ ){
            numbers.add(i) ;
        }

        Collections.shuffle(numbers);

        ArrayList randomNumbers = new ArrayList() ;

        for ( int i = 0 ; i < 5 ; i++ ){
            randomNumbers.add(numbers.get(i)) ;

        }

        // Creating boolean values for different ImageViews to get 5 lucky viewImages

        boolean randomImageView1 = randomNumbers.contains(1) ;
        boolean randomImageView2 = randomNumbers.contains(2) ;
        boolean randomImageView3 = randomNumbers.contains(3) ;
        boolean randomImageView6 = randomNumbers.contains(4) ;
        boolean randomImageView7 = randomNumbers.contains(5) ;
        boolean randomImageView8 = randomNumbers.contains(6) ;
        boolean randomImageView9 = randomNumbers.contains(7) ;
        boolean randomImageView10 = randomNumbers.contains(8) ;
        boolean randomImageView11 = randomNumbers.contains(9) ;

        final int[] score = {0};


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView1){
                    imageView1.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView1.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView2){
                    imageView2.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView2.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView3){
                    imageView3.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView3.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });



        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView6){
                    imageView6.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView6.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView7){
                    imageView7.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView7.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView8){
                    imageView8.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView8.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });



        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView9){
                    imageView9.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView9.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView10){
                    imageView10.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView10.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( randomImageView11){
                    imageView11.setImageResource(R.drawable.thumbup);
                    score[0]++ ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] >= 5 ){
                        textViewResult.setText("You Won");
                    }
                }
                else{
                    imageView11.setImageResource(R.drawable.thumbdown);
                    score[0]-- ;
                    textViewScore.setText(""+score[0]);
                    if ( score[0] < 0 ){
                        textViewResult.setText("You Loose") ;
                    }
                }
            }
        });
    }

    public void gameRestart(View v ){
        finish();
        startActivity(getIntent());
        // this basically provides animation
        overridePendingTransition(0, 0);
        String time = System.currentTimeMillis() + "";
        Toast.makeText(this, "Best of Luck", Toast.LENGTH_SHORT).show();

    }
}