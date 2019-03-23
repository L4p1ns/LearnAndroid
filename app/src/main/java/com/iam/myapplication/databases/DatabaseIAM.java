package com.iam.myapplication.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseIAM extends SQLiteOpenHelper {
    public static final String TableEtudiant = "Etudiant";
    public static final String ID = "id";
    public static final String NOM = "nom";
    public static final String PRENOM = "prenom";
    public static final String AGE = "age";
    public static final String REQUETE = "CREATE TABLE " + TableEtudiant + "("
            + ID + "Integer PRIMARY KEY,"
            + NOM + "TEXT NOT NULL,"
            + PRENOM + " TEXT NOT NULL," + AGE + " INTEGER  )";


    public DatabaseIAM(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(REQUETE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
