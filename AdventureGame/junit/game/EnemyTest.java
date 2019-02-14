package game;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EnemyTest {

	private Enemy enemy;
	
	@Before
	public void setUp() {
		enemy = new Enemy("Hercules", 100, 10, 1, Location.RM3);
	}
	
	@Test
	public void testGetHealth() throws Exception {
		//test getting player's health
		assertEquals(100, enemy.getHealth());
	}
	
	@Test
	public void testSetHealth() throws Exception {
		//test changing player's health status
		int initHP = enemy.getHealth();
		enemy.setHealth(50);
		assertTrue(initHP > enemy.getHealth());
	}
	
	@Test
	public void testGetLocation() throws Exception {
		//test getting player's location
		assertEquals(Location.RM3, enemy.getLocation());
	}
	
	@Test
	public void testSetLocation() throws Exception {
		//test changing the player's current location
		Location initLoc = enemy.getLocation();
		enemy.setLocation(Location.RM1);
		assertTrue(initLoc != enemy.getLocation());
		assertTrue(initLoc == Location.RM3);
		assertTrue(enemy.getLocation() == Location.RM1);
	}
}
