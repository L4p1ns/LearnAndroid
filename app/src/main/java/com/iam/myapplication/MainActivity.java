package com.iam.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = findViewById(R.id.btn1);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        button.setOnClickListener(listener);

        setContentView(R.layout.activity_main);
    }
}
