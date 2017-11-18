package com.example.topquiz.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.topquiz.R;
import com.example.topquiz.model.User;



/**         MainActivity
 * Show a welcome screen and launch the game.
 * @author ChocolateCharlie
 * @version 1.0
 * @param mUser         instance of the [User] class for the current user
 *                      @see User
 * @param mGreetngText  a [TextView] for the greeting message
 * @param mNameInput    a [EditText] where the user is supposed to type a name
 * @param mPlayButton   a [Button] which launches the [GameActivity] on click
 *                      it cannot be pressed if user has not typed at least one letter
 *                      @see GameActivity
 */
public class MainActivity extends AppCompatActivity {

    private User mUser;
    private TextView mGreetingText;
    private EditText mNameInput;
    private Button mPlayButton;

/** onCreate
 * Generate the layout.
 * @author ChcolateCharlie
 * @version 1.0
 * @param savedInstanceState
 * @return (void)
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize variables
        mUser = new User();
        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
        mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);
        mPlayButton.setEnabled(false);

        // Add a listener to mNameInput : if the user types something, it activates the mPlayButton
        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPlayButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        // Add a listener to the mPlayButton : if user presses it, the input is saved as the mUser.mFirstName and it launches GameActivity
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mUser.setFirstName(mNameInput.getText().toString());

                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivity);
            }
        });
    }
}
