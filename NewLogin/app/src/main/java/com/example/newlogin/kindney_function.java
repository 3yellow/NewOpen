package com.example.newlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kindney_function extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kindney_function);
    }
    public void tofronttest(View v){
        Intent i=new Intent(kindney_function.this,fronttest.class);
        startActivity(i);
    }
}
