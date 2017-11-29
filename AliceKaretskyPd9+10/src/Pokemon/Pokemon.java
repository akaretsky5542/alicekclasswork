package Pokemon;

public class Pokemon implements Attack {
	
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	
	public Pokemon(String name, int level) {
		
		this.name = name;
		
		this.level = level;
		
		hp = 100;
		
		this.poisoned = false;
		
	}
	
	public void iChooseYou() {
		
		System.out.println(name);
		System.out.println(name);
		
	}

	
	public int getHP() {
		return hp;
		
		
	}
	
	public String getName() {
		return name;
		
		
	}
	
	public void setHP(int newHP) {
		
		hp = newHP;
	}
	
	public void setPoisoned(boolean b) {
		
		poisoned = true;
	}
	
	public void lapse() {
		
		if(poisoned) {
			
			hp = hp -15;
		}
		
	}
	
	public static void main(String[] args) {
		
		Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		
	}
	
	 public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
		 }

	@Override
	public void attack(Pokemon target) {
		// TODO Auto-generated method stub
		
	}
	
	public void levelUp(Effect e) {
		
		level++;
		e.happen();
		
	}
}
