package game;

public class Item {
	
	//reference for item type
	private ItemType type;
	
	//reference for itemRank
	private int rank;
	
	//reference for itemCount, the # of a particular item held
	private int count;
	
	public Item(ItemType type, int rank, int count) {
		//initialize item state
		this.type = type;
		this.rank = rank;
		this.count = count;
	}
	
	public ItemType getItemType() {
		//get type of item
		return type;
	}
	
	public int getItemRank() {
		//get item's number
		return rank;
	}
	
	public int getItemCount() {
		//get # of a particular item held
		return count;
	}
	
	public void setItemCount(int num) {
		//change the # of a particular item held
		this.count = num;
	}

}
