package com.example.busapp;

import android.provider.BaseColumns;

public final class AppContract {
    private AppContract() {}

    public static class Usuario implements BaseColumns {
        public static final String TABLE_NAME= "Usuario";
        public static final String COLUNA_NOME= "Nome";
        public static final String COLUNA_MATRICULA= "Matricula";
        public static final String COLUNA_SENHA= "Senha";
        public static final String COLUNA_TELEFONE= "Telefone";
        public static final String COLUNA_ENDEREÇO= "Endereço";
    }

    public static class Noticias implements BaseColumns {
        public static final String TABLE_NAME= "Noticias";
        public static final String COLUNA_NOTICIA= "Conteúdo";

    }
}
