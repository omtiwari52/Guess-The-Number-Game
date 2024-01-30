import java.util.*;
import java.util.Random;
// import java.util.Scanner;


public class NumberGame {
    public static void guessNumber(){
        Scanner input = new Scanner(System.in);
        Random randomm = new Random();
        System.out.println("Welcome to the Number Guessing game!!");
        System.out.print("Enter your upper range : ");
        int x = input.nextInt();
        int numberToGuess = randomm.nextInt(x);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while( win == false){
            System.out.print("Guess a number between 0 and "+x+" : ");
            guess = input.nextInt();
            numberOfTries++;

            if(guess == numberToGuess){
                win = true;
            }
            else if(guess < numberToGuess){
                System.out.println("Your Guess To Low.");
            }
            else if(guess > numberToGuess){
                System.out.println("Your Guess Is Too High.");
            }
        }
        System.out.println("You Win!!");
        System.out.println("The number was " + numberToGuess+".");
        System.out.println("It took you "+ numberOfTries +" tries to guess the number.");

        if(numberOfTries == 1){
            System.out.println("Your score is 10.");
        }
        else if(numberOfTries >= 2 && numberOfTries <= 5){
            System.out.println("Your score is 8.");
        }
        else if(numberOfTries >= 6 && numberOfTries <= 10){
            System.out.println("Your score is 5.");
        }
        else{
            System.out.println("Your score is 3.");
        }
    }
    // public static void playAgain(){
    //     if
    //     guessNumber();
    // }
    public static void main(String[] args) {
        guessNumber();
        System.out.print("Do you want to play again? (yes/no): ");
        Scanner sc = new Scanner(System.in);
        String playAgain = sc.next().toLowerCase();
        if(playAgain.equals("yes")){
            guessNumber();
        }
        System.out.println("Thank You!!");
    }
}