package com.iam.myapplication.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseIAM extends SQLiteOpenHelper {
    public static final Integer VERSION = 1;
    public static final String MA_BASE_DE_DONNEE = "databaseiam.db";
    public static final String TableEtudiant = "Etudiant";
    public static final String ID = "id";
    public static final String NOM = "nom";
    public static final String PRENOM = "prenom";
    public static final String AGE = "age";
    public static final String REQUETE = "CREATE TABLE " + TableEtudiant + "("
            + ID + "Integer PRIMARY KEY,"
            + NOM + "TEXT NOT NULL,"
            + PRENOM + " TEXT NOT NULL," + AGE + " Integer  )";


    public DatabaseIAM(Context context) {
        super(context, MA_BASE_DE_DONNEE, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(REQUETE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
