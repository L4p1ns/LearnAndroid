package com.iam.myapplication.databases;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class EtudiantDAO extends DAOBase {
    public SQLiteDatabase sqliteDatabase;

    public EtudiantDAO(SQLiteDatabase sqlDb, DatabaseIAM dbIam) {
        super(sqlDb, dbIam);
    }

    @Override
    public SQLiteDatabase open() {
        return super.open();
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public SQLiteDatabase getSqLiteDatabase() {
        return super.getSqLiteDatabase();
    }


    public void ajouterEtudiant(Etudiant etudiant) {
        ContentValues values = new ContentValues();

        values.put(DatabaseIAM.NOM, etudiant.getNom());
        values.put(DatabaseIAM.PRENOM, etudiant.getPrenom());
        values.put(DatabaseIAM.AGE, etudiant.getAge());
        sqliteDatabase = this.open();

        sqliteDatabase.insert(DatabaseIAM.TableEtudiant, null, values);
        sqliteDatabase.close();
    }

    public void modifierEtudiant(Etudiant etudiant) {
        ContentValues values = new ContentValues();

        values.put(DatabaseIAM.NOM, etudiant.getNom());
        values.put(DatabaseIAM.PRENOM, etudiant.getPrenom());
        values.put(DatabaseIAM.AGE, etudiant.getAge());
        sqliteDatabase = this.open();

        sqliteDatabase.update(DatabaseIAM.TableEtudiant, values, DatabaseIAM.ID + " = " + etudiant.getIdEtudiant(), null);
        sqliteDatabase.close();
    }

    public void supprimerEtudiant(Long idEtudiant) {
        sqliteDatabase = this.open();
        sqliteDatabase.delete(DatabaseIAM.TableEtudiant, DatabaseIAM.ID + " = " + idEtudiant, null);
        sqliteDatabase.close();
    }

    public Etudiant selectionnerEtudiant(long id) {
//        SQLiteDatabase db = this.dbIam;
        return null;
    }

    /*
    * public Etudiant selectionnerEtudiant(long id) { SQLiteDatabase db = this.open();
Cursor cursor = db.query(DatabaseIAM.ETUDIANT_TABLE_NAME, new String[] { DatabaseIAM.ETUDIANT_KEY, DatabaseIAM.ETUDIANT_NOM, DatabaseIAM.ETUDIANT_PRENOM, DatabaseIAM.ETUDIANT_AGE }, DatabaseIAM.ETUDIANT_KEY+ "=?", new String[] { String.valueOf(id) }, null, null, null, null); if (cursor != null) cursor.moveToFirst();
Etudiant etudiant = new Etudiant(Long.parseLong(cursor.getString(0)), cursor.getString(1), cursor.getString(2), Integer.parseInt(cursor.getString(3)));
return etudiant;
}*/
}

