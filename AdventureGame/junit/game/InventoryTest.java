package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class InventoryTest {

	private Inventory inv;
	private Inventory remove;
	
	@Before
	public void setUp() {
		inv = new Inventory();
		inv.populate();
		remove = new Inventory();
		remove.populate();
	}
	
	@Test
	void testGetInventoryCap() {
		//test initial capacity of inventory
		assertEquals(3, inv.getInventoryCap());
	}

}
