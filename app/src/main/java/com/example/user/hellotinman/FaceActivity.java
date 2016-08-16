package com.example.user.hellotinman;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class FaceActivity extends AppCompatActivity {

    TextView mTextView;
    ImageView mImageView;

    @Override
    public void onCreate( Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_face);

        mTextView = (TextView)findViewById(R.id.idTextView);
        mImageView = (ImageView)findViewById(R.id.idImageViewPic);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int words = extras.getInt("words");
        int faces = extras.getInt( "faces" );

        mTextView.setText( words );
        mImageView.setImageResource( faces );

    }
}
