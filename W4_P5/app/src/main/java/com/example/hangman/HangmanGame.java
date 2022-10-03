package com.example.hangman;

import java.util.Arrays;

public class HangmanGame {
    public static int def_guess= 6;
    private String [] words = {"math", "app", "class"};
    private String word;
    //contains chars the user guessed correctly
    private String [] guessedLetters;
    private int guessesLeft;

    public HangmanGame(int guesses){
        guessesLeft = def_guess;
        int i = (int) (Math.random()*words.length);
        word = words[i];
        guessedLetters = new String[word.length()];
        Arrays.fill(guessedLetters, "_ ");
    }

    public int getGuessesLeft(){
        return guessesLeft;
    }

    public void guess(char c){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == c) {
                guessedLetters[i] = String.valueOf(c);
            }
        }
        guessesLeft--;
    }

    public String getCurrentGuessedWord(){
        String currentWord = "";
        for(int i = 0; i < guessedLetters.length; i++){
            currentWord = currentWord + guessedLetters[i];
        }
        return currentWord;
    }

    public boolean gameOver(){
        if(guessesLeft == 0){
            return true;
        }
        else if (getCurrentGuessedWord().equals(word)){
            return true;
        }
        else{
            return false;
        }
    }


}
