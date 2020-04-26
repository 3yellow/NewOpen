package com.example.newlogin;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class Searchlogin extends AppCompatActivity {

    Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchlogin);

        TextView user=(TextView)findViewById(R.id.textView);
        String name=getIntent().getStringExtra("name").toString();
        user.setText(name+"登入中...");


        ListView listView = (ListView) findViewById(R.id.ListView01);

        // 定义一个List集合
        final List<String> components = new ArrayList<>();
        components.add("TextView");
        components.add("EditText");
        components.add("Button");
        components.add("CheckBox");
        components.add("RadioButton");
        components.add("ToggleButton");
        components.add("ImageView");

        // 将List包装成ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.custom_item, R.id.content_tv, components);

        // 为ListView设置Adapter
        listView.setAdapter(adapter);

        // 为ListView列表项绑定点击事件监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(Searchlogin.this, components.get(position),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void insertpaient(View v){
        intent.setClass(this,Newdata.class);
        startActivity(intent);
    }

}
