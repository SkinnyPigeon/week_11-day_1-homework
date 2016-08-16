package com.example.user.hellotinman;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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

        mFaceButton = (Button)findViewById(R.id.face);

        mFaceButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick( View view ) {

                Random rand = new Random();
                int index = rand.nextInt( images.length );

                final int words = texts[ index ];
                final int faces = images[ index ];

                Intent intent = new Intent( HelloTinMan.this, FaceActivity.class );
                intent.putExtra( "words", words );
                intent.putExtra( "faces", faces);
                Log.d("Eightball: ", "passing through '" + words + "'");
                startActivity( intent );
            }
        });
    }
}

//}
