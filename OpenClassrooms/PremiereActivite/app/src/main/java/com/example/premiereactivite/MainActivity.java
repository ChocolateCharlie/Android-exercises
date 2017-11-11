package com.example.premiereactivite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout = null;
    TextView text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Récupérer le layout par désérialisation. La méthode inflate retourne un View. */
        layout = (RelativeLayout) RelativeLayout.inflate(this, R.layout.activity_main, null);

        /* Récupérer le TextView grâce à son identifiant. */
        text = (TextView) layout.findViewById(R.id.text);
        text.setText("Et cette fois, ça fonctionne !");
        setContentView(layout);
    }
}
