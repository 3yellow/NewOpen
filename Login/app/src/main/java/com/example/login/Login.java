package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity  {

    Button btn_sign;
    EditText edt_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       btn_sign=findViewById(R.id.btn_sign);
       btn_sign.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                   if (edt_password.length()>0){

                       Intent i=new Intent(Login.this,MainActivity.class);
                       startActivity(i);
                   }
                   /*else if(edt_password.length()<0){
                       btn_sign.setEnabled(false);
                   }*/

           }
       });

       edt_password=findViewById(R.id.edt_password);
       }
      /* public  void  onclick(View v){
           if (edt_password.length()>0){
               btn_sign.setEnabled(true);
               Intent i=new Intent(Login.this,MainActivity.class);
               startActivity(i);
           }
           else {
               btn_sign.setEnabled(false);
           }
       }*/
}

