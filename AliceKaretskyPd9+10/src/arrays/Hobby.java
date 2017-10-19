package arrays;

public class Hobby extends Thing {

	public Hobby(String description) {
		super(description);
	
	}

	public static Hobby randomHobby() {
		
		Hobby[] h = {new Hobby("Sailing"), 
				new Hobby("partying"),
				new Hobby("shopping"),
				new Hobby("walking on the boardwalk")};
		
		return h[(int)(Math.random()*h.length)];
		
	}

}
