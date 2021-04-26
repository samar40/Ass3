package com.example.assg3_mob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class saveActivity extends AppCompatActivity {

    ImageView back,save;
    SharedPreferences shrd;
    EditText Name,Email,Addras,DOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        shrd=getSharedPreferences("demo",MODE_PRIVATE);

        Name=findViewById(R.id.NameS);
        Email= findViewById(R.id.EmailS);
        Addras=findViewById(R.id.Addres);
        DOB=findViewById(R.id.DOB);


        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(saveActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        save =findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(saveActivity.this, "Info Saver", Toast.LENGTH_SHORT).show();
                String sName = Name.getText().toString();
                String sEmail = Email.getText().toString();
                String saddras = Addras.getText().toString();
                String sDOB = DOB.getText().toString();
                SharedPreferences.Editor editor = shrd.edit();
                editor.putString("str",sName);
                editor.putString("str2",sEmail);
                editor.putString("str3",saddras);
                editor.putString("str4",sDOB);
                editor.apply();
                Name.setText(sName);
                Email.setText(sEmail);
                Addras.setText(saddras);
                DOB.setText(sDOB);
            }
        });
        String value = shrd.getString("str","");

        String value2 = shrd.getString("str2","");
        String value3 = shrd.getString("str3","");
        String value4 = shrd.getString("str4","");

        Name.setText(value);
        Email.setText(value2);
        Addras.setText(value3);
        DOB.setText(value4);


    }





    }
