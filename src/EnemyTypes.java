import java.util.Random;

public class EnemyTypes {
	private static String[] names1 = { "Weary", "Young", "Fierce", "Wild", "Unfathomable" };
	private static String[] names2 = {"Wolf", "Rat", "Bear", "Viper", "Spider" };
////	private int generatedName1Level;
////	private int generatedName2Level;
//	public String name;
////	public int level;
//	
//	public int getGeneratedName1Level() {
//		return generatedName1Level;
//	}
//	
//	public void setGeneratedName1Level(int val) {
//		generatedName1Level = val;
//	}
//	
//	public EnemyTypes() {
//		level = generateLevel();
//		name = generateName();
//		
//		System.out.println("Level is = " +  level);
//	}
//	
//	private int generateLevel() {
//		generatedName1Level = randInt(0, names1.length);
//		generatedName2Level = randInt(0, names2.length);
//		return generatedName1Level + generatedName2Level;
//	}
//	
//	public String generateName() {
//		return(names1[generatedName1Level] + " " + names2[generatedName2Level]);
//		
//	}
//	
//	public int getLevel() {
//		return level;
//	}
//	
//	
//	public static int randInt(int min, int max) {
//		Random rand = new Random();
//		int randomNum = rand.nextInt((max - min) - 1 ) + min;
//		return randomNum;
//		
//	}
}
