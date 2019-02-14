package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EnemyEncounterTest {

	private EnemyEncounter enemies;
	private EnemyEncounter removingEnemies;
	
	@Before
	public void setUp() {
		enemies = new EnemyEncounter();
		removingEnemies = new EnemyEncounter();
		enemies.populate();
		removingEnemies.populate();
	}
	
	@Test
	public void testDuplicateEnemy() {
		//tests that every enemy in encounter array is only listed once
		int n = 0;
		
		while(n < enemies.getNumEnemies()) {
			Enemy e1 = enemies.getEnemy(n);
			for(int i = 0; i < enemies.getNumEnemies(); i++) {
				if(i != n) {
					assertTrue(e1 != enemies.getEnemy(i));
				} else {
					assertEquals(e1, enemies.getEnemy(i));
					assertEquals(e1, enemies.getEnemy(n));
				}
			}
			n++;
		}
	}
	
	@Test
	public void testGetNumEnemy() throws Exception {
		//tests that the number of enemies in the encounter array is equal to the number of enemies available
		assertEquals(4, enemies.getNumEnemies());
		
		//tests that the number of enemies in the encounter array is equal to the number of enemies alive
		Enemy injured = removingEnemies.getEnemy(2);
		injured.setHealth(0);
		removingEnemies.removeDeadEnemy();
		assertEquals(3, removingEnemies.getNumEnemies());
		
		injured = removingEnemies.getEnemy(1);
		injured.setHealth(0);
		removingEnemies.removeDeadEnemy();
		assertEquals(2, removingEnemies.getNumEnemies());
	}

}
