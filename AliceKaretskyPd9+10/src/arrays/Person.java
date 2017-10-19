package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr", "Am", 
			"L" , "D" , "Th" , "Br" , "Al"};
	
	public static final String[] FIRST_MIDDLE = {"ala" , "ima" , "e",
			
			"o", "anna" , "ola" } ;
	
	public static final String[] FIRST_END = {
			
			"na" , "ck" , "n" , "rian" , "lius" , "lion" , "les",
			
			"ce" };
	
	
	public static final String[] LAST_START = {"Bl", "Sh", 
			"Ph" , "M" , "Th" , "Br" , "Al"};
	
	public static final String[] LAST_MIDDLE = {"ala" , "ima" , "e",
			
			"o", "anna" , "ola" } ;
	
	public static final String[] LAST_END = {
			
			"strom" , "son" , "stein" , "stein" , "sky" , "er" 
			, "vin", "berg" };
	
	
	private String firstName; 
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;

	public Person(String first, String last, Borough home){
		
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	
		friends = new Person[3];
		hobby = Hobby.randomHobby();
	
		
	}
	
	
	public void statYourFriends() {
	String statement = "My friends are ";
	
	for(int i = 0 ; i < friends.length - 1 ; i++) {
		statement += friends[i].firstName + " " + friends[i].lastName + ", ";
		
		
	}
		statement += "and " + friends[friends.length - 1];
		System.out.println(statement);
		
	}
	
	
	public void mingle(Person[] peers) {
		
		for(Person p: peers) {
			// you cant befriend yourself
			if(p != this) {
				setInFirstPlace(p);
						
			}
			
		}
		
	}
	
	
	public void setInFirstPlace(Person f) {
		
		// GO BACKWARD THROUGH ARRAY
		
		for(int i = friends.length- 1; i > 0; i--) {
			
			//move friend from in front, back
			
			friends[i] = friends[i-1]; //CHECK: does not got go out of bounds
			
		}
		friends[0] = f;
		
	}
	
	
	public String toString() {
		
		return "My Name is " + firstName + " " + lastName
				+ " and I am from  " + home + ".";
		
		
	}
}
