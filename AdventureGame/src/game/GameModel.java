package game;

public class GameModel {
	//stores information about game state in progress
	
	//create reference for user
	private Player user;
	
	//create reference for user's inventory
	private Inventory inv;
	
	//create reference for an array of enemies
	private EnemyEncounter enemies;
	
	//create reference for an array of items that can be found in labyrinth
	private Item itemsTBF[];

	//constructor creates all required objects but does not initialize them
	public GameModel() {
		//create user state
		user = new Player(100, Location.RM0, 0);
		
		//create enemies
		enemies.populate();
		
		//create items to be found
		for(int i = 0; i < 10; i++) {
			itemsTBF[i] = Item.getRandomItem();
		}
		
		//create user's inventory
		inv.populate();
	}

	//gets user data
	public Player getUser() {
		return user;
	}

	//gets inventory data
	public Inventory getInventory() {
		return inv;
	}

	//gets enemy data
	public EnemyEncounter getEnemies() {
		return enemies;
	}

	//gets items to be found data
	public Item[] getItemsTBF() {
		return itemsTBF;
	}
	
}
