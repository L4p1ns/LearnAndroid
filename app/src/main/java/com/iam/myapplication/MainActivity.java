package com.iam.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.iam.myapplication.databases.Etudiant;
import com.iam.myapplication.databases.EtudiantDAO;

import java.nio.charset.MalformedInputException;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.btn1);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Etudiant seny = new Etudiant(null, "Seck", "Seny", 43);
                    EtudiantDAO etudiantDAO = new EtudiantDAO(MainActivity.this);
                    etudiantDAO.ajouterEtudiant(seny);
                    Toast.makeText(MainActivity.this, "Etudiant enregistrer avec succes", Toast.LENGTH_SHORT).show();
                    /*
                    Intent intent = new Intent(MainActivity.this,FirstActivity.class);
                    intent.putExtra("nom", "IAM");
                    startActivity(intent);
                    */
                } catch (Exception e) {
                    e.getMessage();
                    System.out.println(e);
                    Toast.makeText(MainActivity.this, "Erreur: " + e, Toast.LENGTH_SHORT).show();
                }

            }
        };
        button.setOnClickListener(listener);
    }
}
