import java.util.Scanner;
import java.util.Random;

 public class rock_Paper_Scissor {
	public static void main(final String[] args) {
                                   final Scanner sc = new Scanner(System.in);
		System.out.println("Let's Play Rock Paper Scissors");
		System.out.println("Enter your choice-->Rock(1) Paper(2) Scissors(3)");
		int i;
		i = sc.nextInt();
		final Random rand = new Random();
		final int computer_choice = rand.nextInt(3) + 1;
//1 - Rock
//2 - Paper
//3 - Scissors


if(computer_choice == 1) {
	System.out.println("The Computer's choice is ROCK");
	if(i == 1){
		System.out.println("Tie");
	}else if(i == 2){
		System.out.println("You Win");
                                  
	}else if(i ==3){
		System.out.println("You Loose");
	}
}else if(computer_choice == 2) {
	System.out.println("The Computer's choice is PAPER");
	if(i == 1){
		System.out.println("You Loose");
	}else if(i == 2){
		System.out.println("Tie");
	}else if(i ==3){
		System.out.println("You Win");
                                   
	}
}else if(computer_choice == 3) {
	System.out.println("The Computer's choice is SCISSOR");
	if(i == 1){
		System.out.println("You Win");
                                 
	}else if(i == 2){
		System.out.println("You Loose");
	}else if(i ==3){
		System.out.println("Tie");
	}
}

System.out.println("THANK YOU FOR PLAYING.........");
sc.close();
	}
	
}
