package attendance;

public class Student {

	private boolean present;
	private String firstName;
	private String lastName;
	
	
	public boolean isPresent() {
		
		if(present == true) {
			
			return true;
			
		}
		
		else {
			
			return false;
			
		}
		
	}
	
	public void setPresent(boolean present) {
		
		this.present = present;
	
	}
	
	public String getFirstName() {
		
		firstName = "Alice";
		
		return firstName;
		
	}

	public String getLastName() {
		
		lastName = "Karetsky";
		
		return lastName;
		
	}
	
	public boolean mathces(String first, String last) {
		
		if(this.firstName == first && this.lastName == last) {
			
			return true;
			
		}
		
	}
	
	boolean matches(String last) {
		
		
		
	}

	
	
}
