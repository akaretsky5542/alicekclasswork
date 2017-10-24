package caveExplorer;

public class CaveRoom {

	private String description;//tells what the room looks like
	private String directions;//tells what you can do
	private String contents;//a symbol representing what's in the room
	private String defaultContents;
	//the rooms are organize by direction, 'null' signifies no room/door in that direction
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	//private int direction;
	
	//constants
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH =2;
	public static final int WEST = 3;
	
	
	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		//difference between defaultContents and contents is "contents" becaomes an 'X' when you are
		//inside this room, when you leave, it goes back to defaultContents
		
		//note: by default, arrays will populate with 'null' meaning there are no connections
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}


	/**
	 * for every door in doors[] appends a String to "directions" describing the access.
	 * For example:
	 *  "There is a door to the north"
	 *  "There is a door to the south"...etc
	 *  
	 * If there are no doors at all, directions should say:
	 *    "There are no doors, you are trapped in here."
	 */
	public void setDirections() {
		directions = "";
		boolean doorFound = false;
		for(int i =0; i < doors.length; i++) {
			if(doors[i] != null) {
				doorFound = true;
				directions += "\n   There is a "+doors[i].getDescription() + " to " +
				toDirection(i)+". "+doors[i].getDetails();
			}
		}
		if(!doorFound) {
			directions += "There is no way out. You are trapped in here.";
		}
	}
	
	/**
	 * converts an int to a direction
	 * 	toDirection(0) -> "the North"
	 * etc
	 * @param dir
	 * @return
	 */
	public static String toDirection(int dir) {
		String[] direction = {"the North", "the East", "the South","the West"};
		return direction[dir];
	}


	public void enter() {
		contents = "X";
	}
	
	public void leave() {
		contents = defaultContents;
	}
	
	/**
	 * Gives this room access to anotherRoom (and vice-versa)
	 * and sets a door between them, updating the directions
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	public void setConnection(int direction, CaveRoom anotherRoom, Door door) {
		addRoom(direction, anotherRoom, door);
	
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
			
			
	}
	
	
	//returns the OPPOSITE DIRECTION
	// oD(0) returns 2
	//oD(1) returns 3 
	
	public static int oppositeDirection(int dir) {
		
		return (dir+2) % 4;
	}


	public void addRoom(int dir, CaveRoom caveRoom, Door door) {
		borderingRooms[dir] = caveRoom;
		doors[dir] = door;
		setDirections();
		
		
	}
	
	public void interpretInput(String input) {
		
		while(!isValid(input)) {
			
			System.out.println("You can only enter 'w', 'a', 's', or 'd'");
			input = CaveExplorer.in.nextLine();
			
			
		}
		
		
		int direction = "wdsa".indexOf(input);
		/*
		 * convert w,a,s,d to directions 0,3,2,1
		 * NO IF STATEMENT
		 */
		
	
		goToRoom(direction);
		
		
	}

//return true if w,a,s,or d is the input
	private boolean isValid(String input) {
		
		return "wasd".indexOf(input) > -1 && input.length() == 1;
		
	
		//return input.compareTo("s") >= 0 ||input.compareTo("w") >= 0 ||input.compareTo("a") >= 0 ||input.compareTo("d") >= 0 ;
		
	}
	


	private void goToRoom(int direction) {
		//first, protect against null pointer exception
		//(user cannot go through non-existent door
		if(borderingRooms[direction] != null && 
				doors[direction] != null && doors[direction].isOpen()){
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
		}
		else {
			
			//print red text
			System.err.println("You can't do that!");
			
		}
		
	}
	
	/**
	 * This will be where your group sets up all the caves 
	 * and all the connections
	 */
	public static void setUpCaves() {
		
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}
	
	

}
