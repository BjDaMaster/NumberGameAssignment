/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rbowlen
 */
public class NumberGame {
    public int guessNumber;
    public boolean gameWon;
    public boolean gameOver;
    public int randNumber;
    
    public NumberGame(){}
    public NumberGame(int range){
        guessNumber = 0;
        gameWon = false;
        gameOver = false;
        randNumber = getRandom(range);
        
    }
   
    public int getRandom(int range){
        Random random  = new Random();
        randNumber = random.nextInt(range) + 1;
        return randNumber;
    }
    
    public void gameWon(){
        gameWon = true;
    }
    
    public void gameOver(){
        if(!gameWon){           
        System.out.println("So sorry, you lost. You used all of "
                + "your guesses. ");
        gameOver = true;
            
        }
        if(gameWon){
            System.out.println("Great job! You guessed the number!");
        }
        
    }
    
    public void userGuess(){
        if(!gameOver){
            System.out.println("Guess what number that I'm thinking of:");
            Scanner scanner = new Scanner(System.in);
            int userGuess = scanner.nextInt();
            
            if(userGuess == randNumber){
                gameWon();
                gameOver();
            }else if(guessNumber < 3){
                if (userGuess < randNumber){
                    System.out.println("Your guess is too low");
                }
                else if (userGuess > randNumber ){
                    System.out.print("Your guess is too high.");
                }
                if (guessNumber == 3){
                    gameOver();
                }else{
                    System.out.println(" Try again.\n");
                    guessNumber++;
                    userGuess();
                }
            }
        }
    }
}
