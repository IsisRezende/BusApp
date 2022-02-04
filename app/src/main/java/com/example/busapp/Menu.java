package com.example.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
    public void Perfil(View v){
        Intent Intent= new Intent(this,Perfil.class);
        startActivity(Intent);
    }
    public void Lista(View v){
        Intent Intent= new Intent(this,Listagem.class);
        startActivity(Intent);
    }
    public void Info(View v){
        Intent Intent= new Intent(this,Info.class);
        startActivity(Intent);
    }
    public void Noticias(View v){
        Intent Intent= new Intent(this,Noticias.class);
        startActivity(Intent);
    }

}

