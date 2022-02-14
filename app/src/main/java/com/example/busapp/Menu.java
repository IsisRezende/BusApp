package com.example.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Menu<Instance> extends AppCompatActivity {

    public AppCompatButton bt_perfil;
    public AppCompatButton bt_lista;
    public AppCompatButton bt_info;
    public AppCompatButton bt_noticias;
    public AppCompatButton bt_sair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        bt_perfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent= new Intent(Menu.this,Perfil.class);
                startActivity(Intent);
            }
        });

        bt_lista.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent= new Intent(Menu.this,Listagem.class);
                startActivity(Intent);
            }
        });

        bt_info.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent= new Intent(Menu.this,Info.class);
                startActivity(Intent);
            }
        });

        bt_noticias.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent= new Intent(Menu.this,Noticias.class);
                startActivity(Intent);
            }
        });
        bt_sair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent Intent= new Intent(Menu.this, MainActivity.class);
               startActivity(Intent);
            }
        });
    }

    public void IniciarComponentes(){

        bt_perfil=findViewById(R.id.bt_usuario);
        bt_lista=findViewById(R.id.bt_list);
        bt_info=findViewById(R.id.bt_info);
        bt_noticias=findViewById(R.id.bt_noticias);
        bt_sair=findViewById(R.id.bt_sair);
    }

}

