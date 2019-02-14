package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	
	private Item sword;
	private Item dagger;
	private Item shield;
	private Item grnPotion;
	
	@Before
	public void setUp() {
		sword = new Item(ItemType.SWORD, 1, 1);
		dagger = new Item(ItemType.DAGGER, 2, 0);
		shield = new Item(ItemType.SHIELD, 3, 0);
		grnPotion = new Item(ItemType.GREENPOTION, 4, 5);
	}

	@Test
	public void testGetItemType() throws Exception {
		//test getting item type
		assertEquals(ItemType.SWORD, sword.getItemType());
		assertEquals(ItemType.DAGGER, dagger.getItemType());
		assertEquals(ItemType.SHIELD, shield.getItemType());
		assertEquals(ItemType.GREENPOTION, grnPotion.getItemType());
	}
	
	@Test
	public void testGetItemRank() throws Exception {
		//test getting the item's rank
		assertEquals(1, sword.getItemRank());
		assertEquals(2, dagger.getItemRank());
		assertEquals(3, shield.getItemRank());
		assertEquals(4, grnPotion.getItemRank());
		assertTrue(sword.getItemRank() != dagger.getItemRank() &&
				sword.getItemRank() != shield.getItemRank() &&
				sword.getItemRank() != grnPotion.getItemRank());
		assertTrue(dagger.getItemRank() != shield.getItemRank() &&
				dagger.getItemRank() != grnPotion.getItemRank());
		assertTrue(shield.getItemRank() != grnPotion.getItemRank());
	}
	
	@Test
	public void testGetItemCount() throws Exception {
		//test getting the number of items held
		assertEquals(1, sword.getItemCount());
		assertEquals(0, dagger.getItemCount());
		assertEquals(0, shield.getItemCount());
		assertEquals(5, grnPotion.getItemCount());
	}

	@Test
	public void testSetItemCount() throws Exception {
		//test changing the number of items held
		int initSwordCount = sword.getItemCount();
		sword.setItemCount(2);
		assertEquals(1, initSwordCount);
		assertTrue(initSwordCount < sword.getItemCount());
		assertEquals(2, sword.getItemCount());
		
		int initDaggerCount = dagger.getItemCount();
		dagger.setItemCount(1);
		assertEquals(0, initDaggerCount);
		assertTrue(initDaggerCount < dagger.getItemCount());
		assertEquals(1, dagger.getItemCount());
		
		int initShieldCount = shield.getItemCount();
		shield.setItemCount(1);
		assertEquals(0, initShieldCount);
		assertTrue(initShieldCount < shield.getItemCount());
		assertEquals(1, shield.getItemCount());
		
		int initGPCount = grnPotion.getItemCount();
		grnPotion.setItemCount(99);
		assertEquals(5, initGPCount);
		assertTrue(initGPCount < grnPotion.getItemCount());
		assertEquals(99, grnPotion.getItemCount());
	}
	
}
