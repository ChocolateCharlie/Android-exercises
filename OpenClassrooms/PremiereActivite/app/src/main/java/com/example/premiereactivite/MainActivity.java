package com.example.premiereactivite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView monTexte = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monTexte = (TextView)findViewById(R.id.text);
        monTexte.setText("Le texte de notre TextView");
        monTexte.setPadding(50, 60, 70, 90);
    }
}
