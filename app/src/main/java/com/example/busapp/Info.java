package com.example.busapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    EditText local;
    EditText tel;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
    }
    public void verLocal (View view){
        local= findViewById(R.id.info_ender);
        String localMap = local.getText().toString();

        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(localMap));

        startActivity(intent);
    }
    public void Ligar (View view){
        tel= findViewById(R.id.info_tel);
        String fazerChamada = tel.getText().toString();

        Intent intent= new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse(fazerChamada));

        startActivity(intent);
    }
    public void enviarEmail (View view){
        email= findViewById(R.id.info_email);
        String enviar = email.getText().toString();

        Intent intent= new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse(enviar));

        startActivity(intent);
    }
}
