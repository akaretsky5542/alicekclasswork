package caveExplorer;

public class TreasureRoom extends NPCRoom{
	
	private String Treasure;
	private int counter; 
	
	
	public TreasureRoom(String description){
		
		super(description);
		
		counter = 0;
		
	}
	

	public void enter() {
		super.enter();
	
		if(counter == 0) {
			
			CaveExplorer.inventory.setMoneyAmount(1);
			
		}
	
		counter++;
	
	}
}

	

