package game;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class EnemyEncounter {
	//class to represent the enemy encounters
	
	//reference for array list of enemies
	private ArrayList<Enemy> enemies;
	
	//reference for specific enemy
	private Enemy enemy;
	
	//creates random enemy encounters, but list is empty initially
	public EnemyEncounter() {
		enemies = new ArrayList<Enemy>();
	}
	
	public Enemy getEnemy(int index) {
		//gets a specific enemy
		if(index < 0 || index > 3) { //enemy needs to be in enemy array
			throw new NoSuchElementException();//if outside those bounds, there is no enemy
		}
		return enemies.get(index);
	}
	
	public int getNumEnemies() {
		//gets number of enemies
		return enemies.size();
	}

	public void populate() {
		//populates random enemy encounters
		EnemyName[] allNames = EnemyName.values();
		
		for(int i = 0; i < allNames.length; i++) {
			enemies.add(new Enemy(EnemyName.getRandomEnemy(), 100, Item.getRandomItemDrop(), Location.getRandomLocation()));
		}
	}
	
	public void removeDeadEnemy() {
		//removes enemy from encounter list when enemy dies
		for(int i = 0; i < enemies.size(); i++) {
			enemy = enemies.get(i);
			if(enemy.getHealth() == 0) {
				enemies.remove(i);
			}
		}
	}
}
