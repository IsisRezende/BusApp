package com.example.busapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ControleBanco {
    private SQLiteDatabase db;
    private AppHelper banco;

    public ControleBanco(Context context){
        banco= new AppHelper(context);
    }


}
