package com.example.busapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ControleBanco{
    private SQLiteDatabase db;
    private AppHelper banco;

    public ControleBanco(Context context){
        banco= new AppHelper(context);
    }
    public String Cadastro(String nome, int matricula, int senha){
        ContentValues valores;
        long resultado;

        db=banco.getWritableDatabase();

        valores= new ContentValues();
        valores.put(AppContract.Usuario.COLUNA_NOME,nome);
        valores.put(AppContract.Usuario.COLUNA_MATRICULA,matricula);
        valores.put(AppContract.Usuario.COLUNA_NOME,senha);

        resultado= db.insert(AppContract.Usuario.TABLE_NAME, null, valores);
        db.close();

        if(resultado==-1)
            return "Erro de cadastro";
        else
            return "Cadastro realizado com sucesso";
    }

    public String CriarNoticia(Context conteudo){
        ContentValues noticia;
        long resultado;

        db=banco.getWritableDatabase();

        noticia= new ContentValues();
        noticia.put(AppContract.Noticias.COLUNA_NOTICIA, String.valueOf(conteudo));


        resultado= db.insert(String.valueOf(conteudo), AppContract.Noticias.TABLE_NAME, null);
        db.close();

        if(resultado==-1)
            return "Erro ao salvar";
        else
            return "Noticia salva";
    }
    public Cursor carregarNoticias(){
        Cursor cursor;

         String[] campos= (AppContract.Noticias.COLUNA_NOTICIA,);
         cursor= db.query(AppContract.Noticias.TABLE_NAME, campos,null,null, null,null, null, null);

        if(cursor!=null){
            cursor.moveToFirst();
        }
        db.close();
    }




}
