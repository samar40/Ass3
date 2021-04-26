package com.example.assg3_mob;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton B1;
    Toolbar toolbar;
    ListView L1,L2;
    String Name[]={"Samar","Areeb","Ahmad","Ali","Asad","Mudassar"};
    String Email[]={"Sama@gmail.com","Areeb@gmail.com","Ahmad@gmail.com","Ali@gmail.com","Asad@gmail.com","Mudassar@gmail.com"};
    int img[]={R.drawable.boy,R.drawable.childpic,R.drawable.simple,R.drawable.thm,R.drawable.wert,R.drawable.qaz};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbaar);
        B1=findViewById(R.id.fab);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,saveActivity.class);
                startActivity(intent);
            }
        });
        setSupportActionBar(toolbar);



        L1 = findViewById(R.id.allcont);
        myadapter adapter = new myadapter(this,Name,Email,img);
        L1.setAdapter(adapter);

        L1.setOnItemClickListener((parent, view, position, id) ->{
            String s = L1.getItemAtPosition(position).toString();
            Toast.makeText(this,s, Toast.LENGTH_SHORT).show();
                });

        L2 = findViewById(R.id.favlist);
        myadapterf adapterr = new myadapterf(this,Name, img);
        L2.setAdapter(adapterr);

        L2.setOnItemClickListener((parent, view, position, id) ->{
            String s1 = L2.getItemAtPosition(position).toString();
            Toast.makeText(this,s1, Toast.LENGTH_SHORT).show();
        });





    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}