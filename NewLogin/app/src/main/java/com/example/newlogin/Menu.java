package com.example.newlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }
    public void nwedata(View v){
        Intent i=new Intent(Menu.this,Newdata.class);
        startActivity(i);
    }
    public void test(View v){
        Intent i=new Intent(Menu.this,Test.class);
        startActivity(i);
    }
}