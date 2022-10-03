package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
    //Button q, r, s, t, u, v, w, x, y, z;

    private HangmanGame game;
    Button a;
    TextView showGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates a new game
        game = new HangmanGame(HangmanGame.def_guess);
        showGuess = findViewById(R.id.currentStatus);
    }

    public void tryLetter(View view){
        Button b = (Button) view;
        String buttonText = b.getText().toString();

        game.guess(buttonText.charAt(0));
        showGuess.setText(game.getCurrentGuessedWord());

    }




}