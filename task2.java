package numberguessing;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int number = 1 + (int)(100* Math.random());

// Given n trials
int n = 5;

int i, guess;

System.out.println("******* NUMBER GUESSING GAME ********\n");
System.out.println("Guess the number between 1 to 100 ");
System.out.println("Number of trials: 5\n");


for (i = 0; i < n; i++) {

System.out.println("Guess the number:");

//Input for guessing
guess = sc.nextInt();

if (number == guess) {
  System.out.println("Congratulations!" + " You guessed the number.");
  break;
}

else if (number > guess && i != n - 1) {
  System.out.println( "The number is greater than " + guess);
}

else if (number < guess && i != n - 1) {
  System.out.println("The number is less than " + guess);
}
}

if (i == n) {
System.out.println( "You ran out of tials");
System.out.println("You lose!");
System.out.println( "The number was " + number);
}
}
 
	
}
