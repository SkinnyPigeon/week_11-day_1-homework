package com.example.user.hellotinman;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 15/08/2016.
 */

public class HelloTinMan extends AppCompatActivity {

//    private ImageView findImageViewPic;
//    private TextView findTextView;
//    private Button nextButton, backButton;
    private Button mFaceButton;

    private int currentImage = 0;
    private int currentText = 0;
    int[] images = { R.drawable.biblethump, R.drawable.dansgame, R.drawable.kappa, R.drawable.pogchamp };
    int[] texts = { R.string.bible_thump, R.string.dans_game, R.string.kappa, R.string.pog_champ };

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        backButton = (Button) findViewById(R.id.back);
//        nextButton = (Button) findViewById(R.id.next);
        mFaceButton = (Button)findViewById(R.id.face);

//        backButton.setOnClickListener(backButtonChangeImageListener);
//        nextButton.setOnClickListener(nextButtonChangeImageListener);
        mFaceButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick( View view ) {
                
            }
        });
    }
    View.OnClickListener nextButtonChangeImageListener = new View.OnClickListener() {

        public void onClick(View v) {

            currentImage++;
            currentImage = currentImage % images.length;
            currentText++;
            currentText = currentText % texts.length;

//            findImageViewPic.setImageResource(images[currentImage]);
//            findTextView.setText(texts[currentText]);

        }
    };

    View.OnClickListener backButtonChangeImageListener = new View.OnClickListener() {

        public void onClick(View v) {
            currentImage--;
            currentImage = (currentImage + images.length) % images.length;
            currentText--;
            currentText = ( currentText + texts.length) % texts.length;


//            findImageViewPic.setImageResource(images[currentImage]);
//            findTextView.setText(texts[currentText]);

        }
    };
}

//}
