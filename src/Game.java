import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game  { 
	
	private static Scanner sc = new Scanner(System.in);
	static Fight battle = new Fight();
	
	private static String[] enemNanes = { "Putin",	"Elcin", "Stalin", "Ermolov", "Kadyrov", "Budanov" }; // enemy name
	
	public Game() {
		
	}
	
	public void start() {
		boolean go 				= true;
		Player your;
		Player enemy;
		
		while(go) { // game starting
			your				= genPlaer("Player", 0); // input your name and value with which character you want play
			enemy				= genPlaer(ranEnemyName(), ranEnemyType()); // enemy name and character value random
			System.out.println("The game is starting ... ");
	
			yourSets(your);
			
			Player[] players		= {your, enemy}; 
	
			System.out.println("Opponent name is: " + enemy.getName() +	" opponent type is: " + enemy.getCharacter());

			System.out.println("Press 'a' to attack. Press 'q' to Quit");

			switch(getConsole().toLowerCase())	{ 
				case "a": 
					runBattle(players);
					break;
				case "q":
					System.out.println("User has Quit!");
					go = false;
				    break;
				default:
					break;
			}
				
			say("##############################################################################\n");
			
			//finish of battle
			if(your.isAlive()) { // check who is live
				
				System.out.println( your.getName() +  " win... for " + your.round + " rounds");
				System.out.println(enemy.getName() +  " is DEAD! GAME OVER!!!");
			}
			else {
				System.out.println( enemy.getName() + " win... for " + enemy.round + " rounds");
				System.out.println(your.getName() + " is DEAD! GAME OVER!!!");

			}
				
			System.out.println("Would you like to continue (yes/no)?");
			
			go = false;
			String playAgain = sc.nextLine().toLowerCase();
			if(playAgain.equals("yes")) {
				go = true;
			} else {
				System.out.println("Program is close");
			}
			
		}
		
	}
	
	private static void runBattle(Player[] players) { // statistics for all round player and enemy and print out in console
		
		battle.fight( players );
		System.out.println("The battle is end!");
		System.out.println("Statistics ...");
		
		for(String stat : battle.getStatictiskPL1() ) { // player 1
			System.out.println(stat);
		}
		
		for(String stat : battle.getStatictiskPL2() ) { // player 2
			System.out.println(stat);
		}
	}

	private static void yourSets (Player your) { // input your name and value with which character you want play

		System.out.println("Enter your name...");
		your.setName(getConsole());

		System.out.println("Choice your character...\n 1 = Warrior:\n 2 = Mage:\n 3 = Rogue:\n 4 = Elf:\n 5 = Orcs:\n");
		your.setCharacter(Integer.parseInt(getConsole()));

		System.out.println( your.getName() + "   loading in the game....");

	}
	

	
	private static String getConsole() {
		String str 		= sc.nextLine();
		return str;
	}
	
	private static String userInput() {
		System.out.println(" ");
		String str 		= sc.nextLine();
		return "a";
	}

	private static String ranEnemyName () {
		Random rand		= new Random();
		int nameIndex	= rand.nextInt(5);
		return enemNanes[nameIndex];
	}

	private static int ranEnemyType () {
		Random rand		= new Random();
		int typeIndex	= rand.nextInt(4) + 1;
		return typeIndex;
	}

	private static Player genPlaer (String name, int type){
		Player player;

		switch(type) {
			case 1: // Warrior
				player = new Warrior();
				break;

			case 2: // Mage
				player = new Mage();
				break;

			case 3: // Rogue
				player = new Rogue();
				break;
				
			case 4: //Elf
				player = new Elf();
				break;
				
			case 5: //Orcs
				player = new Orcs();
				break;

			default:
				player = new Player();
				break;
		}

		player.setName(name);

		return player;
	}
	
	private static void say (String str) {
		System.out.println(str);
	}
}
