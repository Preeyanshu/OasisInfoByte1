import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Task2 {
    //Number guessing game
    public static void main(String[] args) {
        Random rand = new Random();

        int com = 1 + rand.nextInt(100);    // Generate random number from 0 to 100

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------WELCOME---------------");
        System.out.println("----------------TO------------------");
        System.out.println("--------Number Guessing Game--------");
        System.out.println("   The no. lies between 0 to 100");
        System.out.println("You have 5 tries to guess the number");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        int k = 5;      // No. of trials

        int temp = k;

        boolean ifGuessed = false;      // To check if the user has guessed the number or not

        for (int i = 0; i < k; i++) {
            System.out.print("Enter your guess : ");
            int guess = sc.nextInt();
            if(guess == com){
                System.out.println("You guessed the number !");
                System.out.println("------------------------");
                System.out.println("        You Win !       ");
                ifGuessed = true;
                break;
            }
            else if (guess > com) {
                System.out.println("Your guess is too high.\nYou have " + (temp - 1) + " tries left.");
            }
            else{
                System.out.println("Your guess is too low.\nYou have " + (temp - 1) + " tries left.");
            }
            temp--;
        }
        if (!ifGuessed){
            System.out.println("---------------------");
            System.out.println("You ran out of tries.");
            System.out.println("---------------------");
            System.out.println("      You Lose !     ");
        }
    }
}
