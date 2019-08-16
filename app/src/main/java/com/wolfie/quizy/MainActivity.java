package com.wolfie.quizy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Animation frombuttom,mAnimation;
ImageView mImageView,mImageView2;
EditText mEditText;
String name;
SharedPreferences mSharedPreferences;
    public static String MyPREFERENCES = "MyPrefs" ;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=findViewById(R.id.logo);
        mImageView2=findViewById(R.id.imageView3);
        frombuttom= AnimationUtils.loadAnimation(this,R.anim.frombuttom);
        mAnimation=AnimationUtils.loadAnimation(this,R.anim.rotate);
        mImageView.setAnimation(frombuttom);
        mImageView2.setAnimation(mAnimation);

                mSharedPreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditText=findViewById(R.id.name);
          name=mEditText.getText().toString();
          SharedPreferences.Editor editor = mSharedPreferences.edit();
          editor.putString("Name",name) ;
          editor.commit();
          Intent i = new Intent(getApplicationContext(),secondscreen.class);
                startActivity(i);
            }
        });
    }
}
