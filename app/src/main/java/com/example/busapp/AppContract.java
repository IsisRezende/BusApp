package com.example.busapp;

import android.provider.BaseColumns;

public final class AppContract {
    private AppContract() {}

    public static class Usuario implements BaseColumns {
        public static final String TABLE_NAME= "Usuario";
        public static final String TABLE_MATRICULA= "Matricula";
        public static final String TABLE_SENHA= "Senha";
        public static final String TABLE_TELEFONE= "Telefone";
        public static final String TABLE_ENDEREÇO= "Endereço";
    }

    public static class Noticias implements BaseColumns {
        public static final String TABLE_NOTICIAS= "Noticias";

    }
}
