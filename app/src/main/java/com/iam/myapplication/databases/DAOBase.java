package com.iam.myapplication.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DAOBase {
    protected SQLiteDatabase sqLiteDatabase;
    protected DatabaseIAM dbIam;

    /*public DAOBase(SQLiteDatabase sqLiteDatabase, DatabaseIAM dbIam) {
        this.dbIam = dbIam;
        this.sqLiteDatabase = sqLiteDatabase;
    }*/
    public DAOBase(Context pcontext){
        this.dbIam = new DatabaseIAM(pcontext);
    }

    public SQLiteDatabase open() {
        sqLiteDatabase = dbIam.getReadableDatabase();
        return sqLiteDatabase;
    }

    public void close() {
        sqLiteDatabase.close();
    }

    public SQLiteDatabase getSqLiteDatabase() {
        return sqLiteDatabase;
    }

}
