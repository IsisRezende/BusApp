package com.example.busapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    public TextView textCadastro;
    public AppCompatButton bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IniciarComponentes();

        bt_entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, Menu.class);
                startActivity(Intent);
            }
        });

        textCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, Cadastro.class);
                startActivity(Intent);
            }
        });
    }

    public void IniciarComponentes(){
        textCadastro = findViewById(R.id.tela_cadastro);
        bt_entrar=findViewById(R.id.bt_entrar);
    }
}