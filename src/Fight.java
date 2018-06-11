import java.util.ArrayList;

public class Fight {
	
	private ArrayList<String> statictiskPL1 = new ArrayList<>(); //it's array statistisk for player1
	private ArrayList<String> statictiskPL2 = new ArrayList<>(); //it's array statistisk for player2
	
	
	public void attack(Player players[]) { // player1 attack player2 and watch players2 result after attack
		int damageLevel = players[0].getAttackPower() - players[1].getSafePower();
		players[1].updateHealth(damageLevel);
	}
	
	
	public void fight(Player players[]) {
		
//		int round = 0; // this a round 
		while(players[0].isAlive() && players[1].isAlive()) { 
//			round++;   	// loop for round
			attack(players); // loop attack
			statictiskPL1.add(players[0].getStatistisc()); // get Statistisk player1
			statictiskPL2.add(players[1].getStatistisc()); // get Statistisk player2
			players = swap(players);
		}
			
	}
	
	public Player[] swap(Player players[]) { // change because player2 must also attack player1
		Player playerTemp = players[0];
		players[0] = players[1];
		players[1] = playerTemp;
		return players;
	}
	
	public ArrayList<String> getStatictiskPL1() { // get statistisk 
		return statictiskPL1;
	}
	
	public ArrayList<String> getStatictiskPL2() {  // get statistisk
		return statictiskPL2;
	}
	
}
