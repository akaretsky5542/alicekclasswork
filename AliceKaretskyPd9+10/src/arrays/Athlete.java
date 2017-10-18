package arrays;

public class Athlete extends Person {

	private int money;
	
	
	public Athlete(String first, String last, Borough home, int money) {

		super(first, last, home);
			
		
		
		//first line must call a super constructor 
		// Think: A person must exist before an athlete can exist
		
		this.money = money;
		
			
	}



	public String toString() {
		
		//to call superclass methods, use super.
		
		return super.toString() + " I also have $" + money + "!";
		
		
	}
	
	
}
