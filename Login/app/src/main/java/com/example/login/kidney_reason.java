package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kidney_reason extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_reason);
    }
    public void onClick(View v){
        Intent i=new Intent(kidney_reason.this,kidney_reason_1.class);
        startActivity(i);
        finish();
    }
    public void function(View v){
        Intent i=new Intent(kidney_reason.this,kidney_function.class);
        startActivity(i);
        finish();
    }
    public void V(View v){
        Intent i=new Intent(kidney_reason.this,Vtheme.class);
        startActivity(i);
        finish();
    }
}
