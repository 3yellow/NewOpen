package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class kidney_function_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidney_function_1);
        PDFView pdf=findViewById(R.id.pdfView);
        pdf.fromAsset("壹．腎臟功能簡介.doc.pdf").load();
    }
    public void onClick(View v){
        Intent i=new Intent(kidney_function_1.this,Question_1.class);
        startActivity(i);
        finish();
    }
}
