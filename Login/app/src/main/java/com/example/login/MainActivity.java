package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void nwedata(View v){
        Intent i=new Intent(MainActivity.this,Newdata.class);
        startActivity(i);
    }
    public void test(View v){
        Intent i=new Intent(MainActivity.this,Test.class);
        startActivity(i);
    }
}
