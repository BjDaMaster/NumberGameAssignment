/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author rbowlen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Let's play a game! I am going to think of a number "
                + "between one and ten. You will have three chances to guess"
                + " the number.");
        System.out.println("If you guess wrong three times, then you lose.\n\n");
        
        NumberGame game = new NumberGame(10);
        int random = game.randNumber;
        //System.out.println(random);
        game.userGuess();
        
        
        
        
 
    
 
    }
    
}
