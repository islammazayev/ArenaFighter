
import java.util.Scanner;

public class Player {


	protected String name; // this is all what have player general
	protected int character = 0; // 1 = Warrior, 2 = Mage, 3 = Rogue, 4 = Elf, 5 = Orcs,
	protected int strength = 5;
	protected int agility = 5; 
	protected int magic = 5;
	protected int vitality = 5;
	protected int health = 100;
	protected int damage = 5;
	protected int accuracy = 20;
	protected String statistisc;
	protected int round = 0;

	public Player() {
		
	}

	public Player(String name, int character) {
		this.name = name;
		this.character = character; // 1 = Warrior, 2 = Mage, 3 = Rogue, 4 = Elf, 5 = Orcs,


	}

	protected void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	protected void setCharacter(int type) {
		character = type;
	}

	public String getCharacter() {

		String type;

		switch(character) {    // it's all characters which is in the game
			case 1: // Warrior
				type = "Warrior";
				break;

			case 2: // Mage
				type = "Mage";
				break;

			case 3: // Rogue
				type = "Rogue";
				break;
				
			case 4: //Elf
				type = "Elf";
				break;
				
			case 5: //Orcs
				type = "Orcs"; 
				break;

			default:
				type = "Player";
				break;
		}

		return type;
	}
	

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getMagic() {
		return magic;
	}

	public int getVitality() {
		return vitality;
	}
	
	public void updateHealth(int val) {
		health -= val;
	}
	
	public int getHealth() {
		return health;
	}

	public int getRound() {
		round++;
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getDamage() {
		return damage;
	}

	public int getAccuracy() {
		return accuracy;
	}
	
	public String getStatistisc() { // this is statistisc which coming out in the consoll
		statistisc = "----------------------------\n" +
				"*** " + getName() + " Stats *** "
				+ "ROUND: "     + getRound() + " "
				+ "HEALTH: "	+ health + " "
				+ "STRENGTH: "	+ strength + " "
				+ "AGILITY: "	+ agility + " "
				+ "MAGIC: "		+ magic + " "
				+ "VATALITY: "	+ vitality + "\n"
				+ "----------------------------\n";
		return statistisc;
	}
	
	public boolean isAlive() { // live or not
		return health > 0;
	}
	
	
	public int getAttackPower() {
		int hpdmg =  
				  agility 
				  + magic
				  + vitality
				  + damage
				  + accuracy;
				
		return	hpdmg;
	}
	
	public void receiveDamage(int hpdmg) { // minus hp 
		health -= hpdmg;
	}
	
	public int getSafePower() {
		
		int sfpwr = 
		    strength 
		  + agility 
		  + vitality
		  + accuracy;
		
		return sfpwr;
		
	}
}