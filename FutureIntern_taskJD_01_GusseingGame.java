package FutureIntern_JD_02;
import java.util.Scanner;
import java.util.Random;

public class FutureIntern_taskJD_01_GusseingGame {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);	
		Random random=new Random();
		
		//generate a random number between 1 and 100
		int scretNumber = random.nextInt(100)+1;
		
		System.out.println("Guess a number between 1 and 100");
		int guess;
		int numGuesses=0;
		int secretNumber=89;
		while(true) {
			guess=scanner.nextInt();
			numGuesses++;
			
			if(guess==secretNumber) {
				System.out.println("Congratulation! You gussed the number in "+numGuesses+" tries.");
				break;
			}
			else if(guess<secretNumber) {
				System.out.println("Too low. Try again.");
			}
			else {
				System.out.println("Too high. Try again.");
			}
		}
		scanner.close();
	}

}
