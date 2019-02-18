package game;

import java.util.Random;

public enum EnemyName {
	//for enemy names

	HERCULES,
	
	SQUALL,
	
	THESEUS,
	
	DANTE;
	
	public static EnemyName getRandomEnemy() {
		//get random enemy
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
	
}
