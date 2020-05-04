package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class kidney_function extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_function);
    }
    public void fun(View v){
        Intent i=new Intent(kidney_function.this,kidney_function_1.class);
        startActivity(i);
        finish();
    }
    public void rea(View v){
        Intent i=new Intent(kidney_function.this,kidney_reason.class);
        startActivity(i);
        finish();
    }
    public void V(View v){
        Intent i=new Intent(kidney_function.this,Vtheme.class);
        startActivity(i);
        finish();
    }
}
