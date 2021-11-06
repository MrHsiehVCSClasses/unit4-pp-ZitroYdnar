package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     */
    

    public static void execute(Scanner sc) {
        /* YOUR CODE HERE */
        String phrase;
        boolean result;
        boolean ok = true;
        String again;
        String initPhrase;
      
      System.out.println("Welcome to Palindrome Tester");
      
        while(ok){
          
      System.out.print("Enter a phrase: ");

        while(true){

            
            phrase = sc.nextLine();
            initPhrase = phrase;
            result = isPalindrome(phrase);
            if(result == true){

                System.out.println(initPhrase + " is a palindrone");
            }
            else{

                System.out.println(initPhrase + " is not a palindrone");
            }
            break;            
        }
        System.out.print("Keep Testing? (Y)es or (N)o: ");
        again = sc.nextLine();
            while(true){
            if(again.equals("Y") || again.equals("y")){
                ok = true;
                break;
            }
            else if(again.equals("N") || again.equals("n")){
                ok = false;
                break;
            }
            else{
                System.out.println("Invalid Input, please try again");
                System.out.print("Keep Testing? (Y)es or (N)o: ");
                again = sc.nextLine();

            }
        }
    }

}

    /**
     * YOUR JAVADOC HERE
     */
    public static boolean isPalindrome(String phrase) {
        /* YOUR CODE HERE */
        String phraseReverseString = "";
        String ithLetter;
        boolean here;
        phrase = phrase.replaceAll("[^A-Za-z]+", "");
        phrase = phrase.toLowerCase();
            for(int i=0; i < phrase.length(); i++) {
                ithLetter = phrase.substring(i,i+1);
                phraseReverseString = ithLetter + phraseReverseString;
            }
            if (phrase.equals(phraseReverseString)){
                here = true;
            }
            else{
                here = false;
            }
            return here;
        }
    


    }