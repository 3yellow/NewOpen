package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class theme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
    }
    public void W(View v){
        Intent i=new Intent(theme.this,Wtheme.class);
        startActivity(i);
    }
    public void V(View v){
        Intent i=new Intent(theme.this,Vtheme.class);
        startActivity(i);
    }
    }

