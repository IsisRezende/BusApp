package com.example.busapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Listagem extends AppCompatActivity {

    EditText et_nome;
    Button btAdd;
    Button btRemove;
    ListView list;
    ArrayList<String> lista;

    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listagem);

        et_nome= findViewById(R.id.ed_nome);
        btAdd= findViewById(R.id.bt_add);
        btRemove= findViewById(R.id.bt_remove);
        list = findViewById(R.id.lv);

        lista= new ArrayList<String>();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Listagem.this,R.layout.listagem,lista);
        list.setAdapter(adapter);

        btAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nome=et_nome.getText().toString();
                lista.add(nome);
                adapter.notifyDataSetChanged();
            }
        });

        btRemove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String nome=et_nome.getText().toString();
                lista.remove(nome);
                adapter.notifyDataSetChanged();
            }
        });
    }
    public void IniciarComponentes(){
        et_nome= findViewById(R.id.ed_nome);
        btAdd= findViewById(R.id.bt_add);
        btRemove= findViewById(R.id.bt_remove);
        list = findViewById(R.id.lv);
    }
}
