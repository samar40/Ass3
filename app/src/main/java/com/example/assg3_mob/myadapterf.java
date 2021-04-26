package com.example.assg3_mob;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class myadapterf extends ArrayAdapter<String> {
    Context context;
    String Name[];
    int img[];


    myadapterf(Context c, String Name[], int img[]){
        super(c,R.layout.favourit_contact,R.id.Namee,Name);
        context=c;
        this.Name=Name;
        this.img=img;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.favourit_contact,parent,false);

        ImageView imgg = row.findViewById(R.id.simpleimg);
        TextView Namee=row.findViewById(R.id.Namee);

        imgg.setImageResource(img[position]);
        Namee.setText(Name[position]);
        return row;
    }

}

