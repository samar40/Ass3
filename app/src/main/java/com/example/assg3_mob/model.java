package com.example.assg3_mob;

import android.content.Context;

public class model {



    Context context;
    String Name[]={"Samar","Areeb","Ahmad","Ali","Asad","Mudassar"};
    int img[]={R.drawable.boy,R.drawable.childpic,R.drawable.simple,R.drawable.thm,R.drawable.wert,R.drawable.qaz};

    model(Context c, String Name[], int img[]){
        context=c;
        this.Name=Name;
        this.img=img;
    }

    public void setImg(int[] img) {
        this.img = img;
    }

    public int[] getImg() {
        return img;
    }

    public void setName(String[] name) {
        Name = name;
    }

    public String[] getName() {
        return Name;
    }
}
