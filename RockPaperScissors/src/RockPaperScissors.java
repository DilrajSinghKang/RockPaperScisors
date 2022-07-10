import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Maximum number of rounds = 10, minimum number of rounds = 1");
		System.out.println("Select how many rounds want to play between 1 to 10");
		int rounds = Integer.parseInt(scanner.nextLine());

		if(rounds>10 || rounds<1) 
		{
			System.out.println("---ERROR OUT OF RANGE---");
			System.out.println("Maximum number of rounds = 10, minimum number of rounds = 1");
			System.out.println("Select how many rounds want to play between 1 to 10");
			rounds = Integer.parseInt(scanner.nextLine());
		} else
		{
			for (int i = 0; i< rounds; i++) {
				System.out.println("Round: "+i);

				RockPaperScissors1(scanner);
				if(rounds>=i) {
					System.out.println("Total Wins "+i);
					System.out.println("Total loss "+i);
					System.out.println("Total Tie "+i);
					//System.out.println("Goodbye game is finished");
				}
			
			}
			
		}

	}
		static void RockPaperScissors1(Scanner scanner) {
			int winTotal = 0;
			int lossTotal = 0;
		System.out.println("Please make a choice :- 1=rock:2=paper:3=scissors"); // user input
		String player = scanner.nextLine(); 

		Random random = new Random(); // computer input
		int randomNumber = random.nextInt(3);

		String computer;
			if (randomNumber == 0) {
				computer = "rock";
			} else if (randomNumber == 1){
				computer = "scissors";
			} else  {
				computer = "scissors";
			}
			System.out.println("Computer has choosen " + computer + "!");
			//The program must keep track of how many rounds are ties, user wins, or computer wins.
			//Hint: Create three variables to keep track of these items and update them correctly after each round.
			//The program must print out the number of ties, user wins, and computer wins and declare the overall winner based on who won more rounds.
			//After all rounds have been played and the winner declared, the program must ask the user if he/she wants to play again.
			//If the user says No, the program prints out a message saying, “Thanks for playing!” and then exits.
			//If the user says Yes, the program starts over, asking the user how many rounds he/she would like to play.
			if (player.equals(computer)) { // results

				System.out.println("It is a Draw!");
			} else if (palyerWins(player, computer)) {
				System.out.println("Player has won!");
				winTotal ++;				
			} else {
				System.out.println("Computer has won!");
				lossTotal ++;
		}
	}

	static boolean palyerWins(String player, String computer) {
		if (player.equals("rock")) {
			return computer.equals("scissors");
		} else if (player.equals("paper")) {
			return computer.equals("rock");
		} else {
			return computer.equals("paper");
	}
	}

}
