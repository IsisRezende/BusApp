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

    EditText et;
    Button btAdd;
    Button btRemove;
    ListView list;
    ArrayList<String> lista;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listagem);

        et= findViewById(R.id.novo_nome);
        btAdd= findViewById(R.id.bt_add);
        btRemove= findViewById(R.id.bt_remove);
        list = findViewById(R.id.lv);

        lista= new ArrayList<String>();
        ArrayAdapter<Integer> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,lista);
        list.setAdapter(adapter);

        btAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void add(View view){
                    String nome= Interger.parseString(et.getText().toString());
                lista.add(nome);
                adapter.notifyDataSetChanged();

            }
        });

        btRemove.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void remove(View view){
               String nome= Interger.parseString(et.getText().toString());
                lista.remove(nome);
                adapter.notifyDataSetChanged();

            }
        });

    }
}
}