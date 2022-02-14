package com.example.busapp;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public final class AppHelper extends SQLiteOpenHelper {

   private static final String SQL_CREATE_USUARIOS=
           "CREATE TABLE IF EXISTS"+ AppContract.Usuario.TABLE_NAME + " ("+
                   AppContract.Usuario.TABLE_MATRICULA+ " INTEGER PRIMARY KEY,"+
                   AppContract.Usuario.TABLE_SENHA+ " TEXT," +
                   AppContract.Usuario.TABLE_TELEFONE+" TEXT,"+
                   AppContract.Usuario.TABLE_ENDEREÇO+" TEXT)";

    private static final String SQL_DELETE_USUARIOS=
            "DROP TABLE IF EXISTS"+ AppContract.Usuario.TABLE_NAME ;

    private static String SQL_CREATE_NOTICIA=
            "CREATE TABLE IF EXISTS"+ AppContract.Noticias.TABLE_NOTICIAS;

    private static String SQL_DELETE_NOTICIA=
            "DROP TABLE IF EXISTS"+ AppContract.Noticias.TABLE_NOTICIAS ;

    public static final int DATABASE_VERSION= 1;
    public static final String DATABASE_NAME= "App.db";


    public AppHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(SQL_CREATE_USUARIOS);
      db.execSQL(SQL_CREATE_NOTICIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_USUARIOS);
        db.execSQL(SQL_DELETE_NOTICIA);
        onCreate(db);
    }



}
