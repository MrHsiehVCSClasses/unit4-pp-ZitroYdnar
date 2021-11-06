package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {

    /* ANY CODE YOU NEED HERE */

    /**
     * JAVADOC HERE
     */
    public static void play(Scanner sc) {
        /* YOUR CODE HERE */
        String playerChoice;
        String computerChoice;
        String playerAgain;
        boolean t = true;
        int result;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        System.out.println("Welcome to Rock Paper Scissors");
        
        while(t){

            System.out.print("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: ");

            while(true)
            {
                playerChoice = sc.nextLine();
                if ((playerChoice.equals("R") || playerChoice.equals("r")) || ((playerChoice.equals("P") || playerChoice.equals("p"))) || ((playerChoice.equals("S") || playerChoice.equals("s"))) || ((playerChoice.equals("A") || playerChoice.equals("a"))))
                {
                  if((playerChoice.equals("A") || playerChoice.equals("a"))){
                    playerChoice = randomPick();
                    }
                  else{
                    
                  }
                    break;
                }
                else{
                    System.out.println("Invalid input, please try again");
                  System.out.print("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: ");
                }
            }
            playerChoice = playerChoice.toUpperCase();
            computerChoice = randomPick();
            result = results(playerChoice, computerChoice);
          playerChoice = changeSomething(playerChoice);
          computerChoice = changeSomething(computerChoice);
            if(result == 0){
                ties++;
                System.out.println("You both picked " + playerChoice + ". " + "Its a tie!");
                System.out.println("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
            }
            else if (result == -1){
                losses++;
                System.out.println("You picked " + playerChoice + ", and the computer picked " + computerChoice +  ". You lose!");
                System.out.println("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");  
            }
            else{
                wins++;
                System.out.println("You picked " + playerChoice + ", and the computer picked " + computerChoice +  ". You win!");
                System.out.println("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");  
            } 
            System.out.print("Would you like to play again? (Y)es or (N)o: ");
            playerAgain = sc.nextLine();
          while(true){
            if ((playerAgain.equals("Y")) || (playerAgain.equals("y"))){
                t = true;
                  break;
            }
            else if((playerAgain.equals("N")) || (playerAgain.equals("n"))){
              t = false;
                break;
            }
            else{
                System.out.println("Invalid input, please try again");
              System.out.print("Would you like to play again? (Y)es or (N)o: ");
              playerAgain = sc.nextLine();
              
            }
            }
        }

    }

    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
        /* YOUR CODE HERE */
        int winOrLose;
        if ((playerChoice.equals(computerChoice))){
            winOrLose = 0;
        }
        else if((playerChoice.equals("R") && (computerChoice.equals("P"))) || (playerChoice.equals("P") && (computerChoice.equals("S"))) || (playerChoice.equals("S") && (computerChoice.equals("R")))){
            winOrLose = -1;
        }
        else{
            winOrLose = 1;
        }
        return winOrLose;
    }

    /* any helper methods you might need */
    public static String randomPick(){
        int number;
        String pick;
        number = (int)(Math.random()*3 + 1);
        if(number == 1){
            pick = "R";
        }
        else if(number == 2){
            pick = "P";
        }
        else {
            pick = "S";
        }
        return pick;
    }
     public static String changeSomething(String playerChoice){
       if ((playerChoice.equals("R") || playerChoice.equals("r"))){
                        playerChoice = "Rock";
                    }
                    else if((playerChoice.equals("P") || playerChoice.equals("p"))){
                        playerChoice = "Paper";
                    }
                    else{
                        playerChoice = "Scissors";
                    }
       return playerChoice;
                
     }

}