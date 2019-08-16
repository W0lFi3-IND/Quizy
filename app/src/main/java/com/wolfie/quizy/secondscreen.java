package com.wolfie.quizy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class secondscreen extends AppCompatActivity {
SharedPreferences mSharedPreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);

        mSharedPreferences=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        String name =mSharedPreferences.getString("Name","");
        Toast.makeText(this,"Welcome "+name,Toast.LENGTH_LONG).show();
    }
}
