package game;

public class Enemy {

	//reference for enemy name
	private String name;
	
	//reference for enemy hp stat
	private int hp;
	
	//reference for experience given by defeating enemy
	private int exp;
	
	//reference for item dropped by enemy
	private int itemDrop;
	
	//reference for enemy's location
	private Location location;
	
	public Enemy(String name, int hp, int exp, int itemDrop, Location location) {
		//initializes enemy state
		this.name = name;
		this.hp = hp;
		this.exp = exp;
		this.itemDrop = itemDrop;
		this.location = location;
	}
	
	public String getName() {
		//get enemy's name
		return name;
	}
	
	public int getHealth() {
		//get enemy's hp stat
		return hp;
	}
	
	public void setHealth(int health) {
		hp = health;
	}
	
	public int getExp() {
		//get experience for defeating enemy
		return exp;
	}
	
	public int getItemDrop() {
		//get item dropped by enemy
		return itemDrop;
	}
	
	public Location getLocation() {
		//get enemy's current location
		return location;
	}
	
	public void setLocation(Location loc) {
		//change enemy's current location
		location = loc;
	}
	
}
