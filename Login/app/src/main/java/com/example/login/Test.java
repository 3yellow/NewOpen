package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class Test extends AppCompatActivity {
    static final String db_patient = "patientDB";
    static final String tb_patient = "patient";
    SQLiteDatabase db;

    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        db=openOrCreateDatabase(db_patient, Context.MODE_PRIVATE,null);
        Cursor c=db.rawQuery("SELECT * FROM "+tb_patient,null);

        if (c.getCount()==0){
            str="查無資料\n";
        }

        if (c.moveToFirst()){
        str="總共有"+c.getCount()+"筆資料\n";
        str+="---------------------------------\n\n";
        do {
            str+="name:"+c.getString(0)+"\n";
            str+="id:"+c.getString(1)+"\n";
            str+="age:"+c.getString(2)+"\n";
            str+="gender:"+c.getString(3)+"\n";
            str+="date:"+c.getString(4)+"\n";
        }while (c.moveToNext());
        }
        TextView textView6 =findViewById(R.id.textView6);
        textView6.setText(str);

        db.close();
    }

}
