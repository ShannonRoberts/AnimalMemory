package com.shannonroberts.memorygame;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.widget.Toast;

import java.util.Random;


public class Game extends Activity{
    //first number means row, second number is column
    ImageView iv_11, iv_12, iv_13, iv_14,
            iv_21, iv_22, iv_23, iv_24,
            iv_31, iv_32, iv_33, iv_34,
            iv_41, iv_42, iv_43, iv_44,
            iv_51, iv_52, iv_53, iv_54;

    TextView timer_textview, score_textview;

    boolean firstImageClicked = false;
    boolean secondImageClicked = false;

    boolean matchfound = false;

    //game modes
    boolean allAnimals = false;
    boolean dogs = true;//change back!!!
    boolean cats = false;
    boolean funnyAnimals = false;
    boolean wildAnimals = false;

    //array of all imageview boxes to display in game
    ImageView[] iv_images = {iv_11,iv_12,iv_13,iv_14,iv_21,iv_22, iv_24,iv_31,iv_32,iv_33,iv_34,
                            iv_41,iv_42,iv_43,iv_44, iv_51, iv_52, iv_53,iv_54};

    //images names for different game modes
    int[] allAnimalImages;
    int[] dogImages = {R.drawable.dog1_v1, R.drawable.dog2_v1, R.drawable.dog3_v1, R.drawable.dog4_v1,
            R.drawable.dog5_v1, R.drawable.dog6_v1, R.drawable.dog7_v1,
            R.drawable.dog8_v1, R.drawable.dog9_v1, R.drawable.dog10_v1,
            R.drawable.dog1_v1, R.drawable.dog2_v1, R.drawable.dog3_v1, R.drawable.dog4_v1,
            R.drawable.dog5_v1, R.drawable.dog6_v1, R.drawable.dog7_v1,
            R.drawable.dog8_v1, R.drawable.dog9_v1, R.drawable.dog10_v1};
    int[] catImages;
    int[] funnyAnimalImages;
    int[] wildAnimalImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_game);
        //row1
        iv_11 = findViewById(R.id.iv_11);
        iv_12 = findViewById(R.id.iv_12);
        iv_13 = findViewById(R.id.iv_13);
        iv_14 = findViewById(R.id.iv_14);
        //row2
        iv_21 = findViewById(R.id.iv_21);
        iv_22 = findViewById(R.id.iv_22);
        iv_23 = findViewById(R.id.iv_23);
        iv_24 = findViewById(R.id.iv_24);
        //row3
        iv_31 = findViewById(R.id.iv_31);
        iv_32 = findViewById(R.id.iv_32);
        iv_33 = findViewById(R.id.iv_33);
        iv_34 = findViewById(R.id.iv_34);
        //row4
        iv_41 = findViewById(R.id.iv_41);
        iv_42 = findViewById(R.id.iv_42);
        iv_43 = findViewById(R.id.iv_43);
        iv_44 = findViewById(R.id.iv_44);
        //row5
        iv_51 = findViewById(R.id.iv_51);
        iv_52 = findViewById(R.id.iv_52);
        iv_53 = findViewById(R.id.iv_53);
        iv_54 = findViewById(R.id.iv_54);

        timer_textview = (TextView) findViewById(R.id.timer_textview);
        score_textview = (TextView) findViewById(R.id.score_textview);
        iv_11.bringToFront();
        shuffleArray(dogImages);



        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //swap around

                setActiveImage(iv_11);
                imageClicked(iv_11);

            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_12);
                imageClicked(iv_12);

            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_13);
                imageClicked(iv_13);

            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_14);
                imageClicked(iv_14);

            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_21);
                imageClicked(iv_21);

            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_22);
                imageClicked(iv_22);

            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_23);
                imageClicked(iv_23);

            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_24);
                imageClicked(iv_24);

            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_31);
                imageClicked(iv_31);

            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_32);
                imageClicked(iv_32);

            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_33);
                imageClicked(iv_33);

            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_34);
                imageClicked(iv_34);

            }
        });

        iv_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_41);
                imageClicked(iv_41);

            }
        });
        iv_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_42);
                imageClicked(iv_42);

            }
        });
        iv_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_43);
                imageClicked(iv_43);

            }
        });
        iv_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_44);
                imageClicked(iv_44);

            }
        });

        iv_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_51);
                imageClicked(iv_51);

            }
        });
        iv_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_52);
                imageClicked(iv_52);

            }
        });
        iv_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_53);
                imageClicked(iv_53);

            }
        });
        iv_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveImage(iv_54);
                imageClicked(iv_54);

            }
        });


    }

    ImageView ivFirstClicked = null;
    ImageView ivSecondClicked = null;
    int first = -1;
    public void imageClicked(ImageView iv){

        if(firstImageClicked){
            secondImageClicked = true;
            ivSecondClicked = iv;
        }
        if(secondImageClicked){
            if(first == (Integer)iv.getTag()){ //checks if match found
                matchfound = true;
            }
            if(!matchfound){
                waitForCards();

                firstImageClicked = false;
                secondImageClicked = false;
            }
            else{
                firstImageClicked = false;
                secondImageClicked = false;
                matchfound = false;
            }
        }
        else {
            firstImageClicked = true;
            ivFirstClicked = iv;
            first = (Integer)iv.getTag();
        }
    }

    public void setActiveImage(ImageView iv){

        if(allAnimals){
            if(iv == iv_11){
                iv.setImageResource(allAnimalImages[0]);
                iv.setTag(allAnimalImages[0]);

            }
            else if(iv == iv_12){
                iv.setImageResource(allAnimalImages[1]);
            }
            else if(iv == iv_13){
                iv.setImageResource(allAnimalImages[2]);
            }
            else if(iv == iv_14){
                iv.setImageResource(allAnimalImages[3]);
            }
            else if(iv == iv_21){
                iv.setImageResource(allAnimalImages[4]);
            }
            else if(iv == iv_22){
                iv.setImageResource(allAnimalImages[5]);
            }
            else if(iv == iv_23){
                iv.setImageResource(allAnimalImages[6]);
            }
            else if(iv == iv_24){
                iv.setImageResource(allAnimalImages[7]);
            }
            else if(iv == iv_31){
                iv.setImageResource(allAnimalImages[8]);
            }
            else if(iv == iv_32){
                iv.setImageResource(allAnimalImages[9]);
            }
            else if(iv == iv_33){
                iv.setImageResource(allAnimalImages[10]);
            }
            else if(iv == iv_34){
                iv.setImageResource(allAnimalImages[11]);
            }
            else if(iv == iv_41){
                iv.setImageResource(allAnimalImages[12]);
            }
            else if(iv == iv_42){
                iv.setImageResource(allAnimalImages[13]);
            }
            else if(iv == iv_43){
                iv.setImageResource(allAnimalImages[14]);
            }
            else if(iv == iv_44){
                iv.setImageResource(allAnimalImages[15]);
            }
            else if(iv == iv_51){
                iv.setImageResource(allAnimalImages[16]);
            }
            else if(iv == iv_52){
                iv.setImageResource(allAnimalImages[17]);
            }
            else if(iv == iv_53){
                iv.setImageResource(allAnimalImages[18]);
            }
            else if(iv == iv_54){
                iv.setImageResource(allAnimalImages[19]);
            }

        }
        else if(dogs){
            if(iv == iv_11){
                iv.setImageResource(dogImages[0]);
                iv.setTag(dogImages[0]);
            }
            else if(iv == iv_12){
                iv.setImageResource(dogImages[1]);
                iv.setTag(dogImages[1]);
            }
            else if(iv == iv_13){
                iv.setImageResource(dogImages[2]);
                iv.setTag(dogImages[2]);
            }
            else if(iv == iv_14){
                iv.setImageResource(dogImages[3]);
                iv.setTag(dogImages[3]);
            }
            else if(iv == iv_21){
                iv.setImageResource(dogImages[4]);
                iv.setTag(dogImages[4]);
            }
            else if(iv == iv_22){
                iv.setImageResource(dogImages[5]);
                iv.setTag(dogImages[5]);
            }
            else if(iv == iv_23){
                iv.setImageResource(dogImages[6]);
                iv.setTag(dogImages[6]);
            }
            else if(iv == iv_24){
                iv.setImageResource(dogImages[7]);
                iv.setTag(dogImages[7]);
            }
            else if(iv == iv_31){
                iv.setImageResource(dogImages[8]);
                iv.setTag(dogImages[8]);
            }
            else if(iv == iv_32){
                iv.setImageResource(dogImages[9]);
                iv.setTag(dogImages[9]);
            }
            else if(iv == iv_33){
                iv.setImageResource(dogImages[10]);
                iv.setTag(dogImages[10]);
            }
            else if(iv == iv_34){
                iv.setImageResource(dogImages[11]);
                iv.setTag(dogImages[11]);
            }
            else if(iv == iv_41){
                iv.setImageResource(dogImages[12]);
                iv.setTag(dogImages[12]);
            }
            else if(iv == iv_42){
                iv.setImageResource(dogImages[13]);
                iv.setTag(dogImages[13]);
            }
            else if(iv == iv_43){
                iv.setImageResource(dogImages[14]);
                iv.setTag(dogImages[14]);
            }
            else if(iv == iv_44){
                iv.setImageResource(dogImages[15]);
                iv.setTag(dogImages[15]);
            }
            else if(iv == iv_51){
                iv.setImageResource(dogImages[16]);
                iv.setTag(dogImages[16]);
            }
            else if(iv == iv_52){
                iv.setImageResource(dogImages[17]);
                iv.setTag(dogImages[17]);
            }
            else if(iv == iv_53){
                iv.setImageResource(dogImages[18]);
                iv.setTag(dogImages[18]);
            }
            else if(iv == iv_54){
                iv.setImageResource(dogImages[19]);
                iv.setTag(dogImages[19]);
            }
        }
        else if(cats){
            if(iv == iv_11){
                iv.setImageResource(catImages[0]);
            }
            else if(iv == iv_12){
                iv.setImageResource(catImages[1]);
            }
            else if(iv == iv_13){
                iv.setImageResource(catImages[2]);
            }
            else if(iv == iv_14){
                iv.setImageResource(catImages[3]);
            }
            else if(iv == iv_21){
                iv.setImageResource(catImages[4]);
            }
            else if(iv == iv_22){
                iv.setImageResource(catImages[5]);
            }
            else if(iv == iv_23){
                iv.setImageResource(catImages[6]);
            }
            else if(iv == iv_24){
                iv.setImageResource(catImages[7]);
            }
            else if(iv == iv_31){
                iv.setImageResource(catImages[8]);
            }
            else if(iv == iv_32){
                iv.setImageResource(catImages[9]);
            }
            else if(iv == iv_33){
                iv.setImageResource(catImages[10]);
            }
            else if(iv == iv_34){
                iv.setImageResource(catImages[11]);
            }
            else if(iv == iv_41){
                iv.setImageResource(catImages[12]);
            }
            else if(iv == iv_42){
                iv.setImageResource(catImages[13]);
            }
            else if(iv == iv_43){
                iv.setImageResource(catImages[14]);
            }
            else if(iv == iv_44){
                iv.setImageResource(catImages[15]);
            }
            else if(iv == iv_51){
                iv.setImageResource(catImages[16]);
            }
            else if(iv == iv_52){
                iv.setImageResource(catImages[17]);
            }
            else if(iv == iv_53){
                iv.setImageResource(catImages[18]);
            }
            else if(iv == iv_54){
                iv.setImageResource(catImages[19]);
            }
        }
        else if(funnyAnimals){
            if(iv == iv_11){
                iv.setImageResource(funnyAnimalImages[0]);
            }
            else if(iv == iv_12){
                iv.setImageResource(funnyAnimalImages[1]);
            }
            else if(iv == iv_13){
                iv.setImageResource(funnyAnimalImages[2]);
            }
            else if(iv == iv_14){
                iv.setImageResource(funnyAnimalImages[3]);
            }
            else if(iv == iv_21){
                iv.setImageResource(funnyAnimalImages[4]);
            }
            else if(iv == iv_22){
                iv.setImageResource(funnyAnimalImages[5]);
            }
            else if(iv == iv_23){
                iv.setImageResource(funnyAnimalImages[6]);
            }
            else if(iv == iv_24){
                iv.setImageResource(funnyAnimalImages[7]);
            }
            else if(iv == iv_31){
                iv.setImageResource(funnyAnimalImages[8]);
            }
            else if(iv == iv_32){
                iv.setImageResource(funnyAnimalImages[9]);
            }
            else if(iv == iv_33){
                iv.setImageResource(funnyAnimalImages[10]);
            }
            else if(iv == iv_34){
                iv.setImageResource(funnyAnimalImages[11]);
            }
            else if(iv == iv_41){
                iv.setImageResource(funnyAnimalImages[12]);
            }
            else if(iv == iv_42){
                iv.setImageResource(funnyAnimalImages[13]);
            }
            else if(iv == iv_43){
                iv.setImageResource(funnyAnimalImages[14]);
            }
            else if(iv == iv_44){
                iv.setImageResource(funnyAnimalImages[15]);
            }
            else if(iv == iv_51){
                iv.setImageResource(funnyAnimalImages[16]);
            }
            else if(iv == iv_52){
                iv.setImageResource(funnyAnimalImages[17]);
            }
            else if(iv == iv_53){
                iv.setImageResource(funnyAnimalImages[18]);
            }
            else if(iv == iv_54){
                iv.setImageResource(funnyAnimalImages[19]);
            }
        }
        else if(wildAnimals){
            if(iv == iv_11){
                iv.setImageResource(wildAnimalImages[0]);
            }
            else if(iv == iv_12){
                iv.setImageResource(wildAnimalImages[1]);
            }
            else if(iv == iv_13){
                iv.setImageResource(wildAnimalImages[2]);
            }
            else if(iv == iv_14){
                iv.setImageResource(wildAnimalImages[3]);
            }
            else if(iv == iv_21){
                iv.setImageResource(wildAnimalImages[4]);
            }
            else if(iv == iv_22){
                iv.setImageResource(wildAnimalImages[5]);
            }
            else if(iv == iv_23){
                iv.setImageResource(wildAnimalImages[6]);
            }
            else if(iv == iv_24){
                iv.setImageResource(wildAnimalImages[7]);
            }
            else if(iv == iv_31){
                iv.setImageResource(wildAnimalImages[8]);
            }
            else if(iv == iv_32){
                iv.setImageResource(wildAnimalImages[9]);
            }
            else if(iv == iv_33){
                iv.setImageResource(wildAnimalImages[10]);
            }
            else if(iv == iv_34){
                iv.setImageResource(wildAnimalImages[11]);
            }
            else if(iv == iv_41){
                iv.setImageResource(wildAnimalImages[12]);
            }
            else if(iv == iv_42){
                iv.setImageResource(wildAnimalImages[13]);
            }
            else if(iv == iv_43){
                iv.setImageResource(wildAnimalImages[14]);
            }
            else if(iv == iv_44){
                iv.setImageResource(wildAnimalImages[15]);
            }
            else if(iv == iv_51){
                iv.setImageResource(wildAnimalImages[16]);
            }
            else if(iv == iv_52){
                iv.setImageResource(wildAnimalImages[17]);
            }
            else if(iv == iv_53){
                iv.setImageResource(wildAnimalImages[18]);
            }
            else if(iv == iv_54){
                iv.setImageResource(wildAnimalImages[19]);
            }
        }
    }

    public void shuffleArray(int[] imagesArray){
        Random r = new Random();
        int start = 1;
        int end = imagesArray.length;
        for (int index = 0; index < 2 * imagesArray.length; index++)
        {
            int temp = imagesArray[0];
            int randomIndex = r.nextInt(end-start) + start;
            imagesArray[0] = imagesArray[randomIndex];
            imagesArray[randomIndex] = temp;
        }
    }

    public void waitForCards(){
        new CountDownTimer(1000, 1000){
            @Override
            public void onTick(long millisUntilFinished) {
                iv_11.setClickable(false);
                iv_12.setClickable(false);
                iv_13.setClickable(false);
                iv_14.setClickable(false);
                iv_21.setClickable(false);
                iv_22.setClickable(false);
                iv_23.setClickable(false);
                iv_24.setClickable(false);
                iv_31.setClickable(false);
                iv_32.setClickable(false);
                iv_33.setClickable(false);
                iv_34.setClickable(false);
                iv_41.setClickable(false);
                iv_42.setClickable(false);
                iv_43.setClickable(false);
                iv_44.setClickable(false);
                iv_51.setClickable(false);
                iv_52.setClickable(false);
                iv_53.setClickable(false);
                iv_54.setClickable(false);
            }

            @Override
            public void onFinish() {
                ivFirstClicked.setImageResource(R.drawable.king_dog);//first clicked card
                ivSecondClicked.setImageResource(R.drawable.king_dog);//second clicked card
                iv_11.setClickable(true);
                iv_12.setClickable(true);
                iv_13.setClickable(true);
                iv_14.setClickable(true);
                iv_21.setClickable(true);
                iv_22.setClickable(true);
                iv_23.setClickable(true);
                iv_24.setClickable(true);
                iv_31.setClickable(true);
                iv_32.setClickable(true);
                iv_33.setClickable(true);
                iv_34.setClickable(true);
                iv_41.setClickable(true);
                iv_42.setClickable(true);
                iv_43.setClickable(true);
                iv_44.setClickable(true);
                iv_51.setClickable(true);
                iv_52.setClickable(true);
                iv_53.setClickable(true);
                iv_54.setClickable(true);
            }
        }.start();
    }
//redundant
    public void pickImagesForRound(){
        int num = 0;
        if(allAnimals){
            for(int index =0; index < iv_images.length; index++){
                iv_images[index].setImageResource(allAnimalImages[num]);
            }
        }
        else if(dogs){
            for(int index =0; index < iv_images.length; index++){
                iv_images[index].setImageResource(dogImages[num]);
            }
        }
        else if(cats){
            for(int index =0; index < iv_images.length; index++){
                iv_images[index].setImageResource(catImages[num]);
            }
        }
        else if(funnyAnimals){
            for(int index =0; index < iv_images.length; index++){
                iv_images[index].setImageResource(funnyAnimalImages[num]);
            }
        }
        else if(wildAnimals){
            for(int index =0; index < iv_images.length; index++){
                iv_images[index].setImageResource(wildAnimalImages[num]);
            }
        }
    }


}
