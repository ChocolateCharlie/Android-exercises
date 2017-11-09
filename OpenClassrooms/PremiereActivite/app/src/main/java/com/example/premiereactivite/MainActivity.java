package com.example.premiereactivite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String greetingMessage = getResources().getString(R.string.greeting);
        greetingMessage = greetingMessage.replace("World", "Charlie");

        TextView text = new TextView(this);
        text.setText(greetingMessage);

        setContentView(text);
    }
}
