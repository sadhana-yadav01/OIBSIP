package Java;
import java.util.Scanner;

public class GuessTheNumber {

	 public static void guessingNumberGame()
	    {
	        Scanner sc = new Scanner(System.in);
	        int number = 1 + (int)(100  * Math.random());
	        int lives= 5;
	        int i, guess;
	 
	        System.out.println( "Within 5 trials chose a number between 1 1o 100");
	 
	        for (i = 0; i < lives; i++)
	        {
	        System.out.println("Guess:");
	        guess = sc.nextInt();

	        if (number == guess)
	        {
	           System.out.println("Great.. .. Right number..");
	           break;
	        }
	        else if (number > guess && i != lives- 1)
	        {
	                System.out.println("The number is greater than " + guess);
	        }
	        else if (number < guess && i != lives - 1) 
	        {
	                System.out.println("The number is less than" + guess);
	        }
	        }
	        if (i == lives) 
	        {
	            System.out.println(" Sorry...No lives");
	 
	            System.out.println("Correct number was:" + number);
	        }
	    }
	    public static void main(String arg[])
	    {
	        guessingNumberGame();
	    }
	}