package com.example.busapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Cadastro extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        AppCompatButton bt_cadastro=findViewById(R.id.bt_cadastrar);

        bt_cadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ControleBanco crud= new ControleBanco(getBaseContext());
                EditText nome= findViewById(R.id.ed_nome);
                EditText login=findViewById(R.id.edit_login);
                EditText senha=findViewById(R.id.edit_senha);
                String stringnome= nome.getText().toString();
                Int intlogin=login.getText().toInt();
                Int intsenha=senha.getText().toInt();
                String resultado;

                resultado= crud.Cadastro(stringnome,intlogin,intsenha);

                Toast.makeText(getApplicationContext(),resultado,Toast.LENGTH_LONG.SHOW());


            }


    }
}
