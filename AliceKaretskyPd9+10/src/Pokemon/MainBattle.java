package Pokemon;

public class MainBattle implements Effect{

	public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle",26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle is preparing to attack with water blast");
		 squirtle.attack(bulbasaur, new Attack() {
		 
		 public void attack(Pokemon target) {
		 int hp = target.getHP();
		 target.setHP(hp/2);
		 }
		 });
		 System.out.println("Bulbasaur is preparing to attack with poison.");
		 bulbasaur.attack(squirtle, new Attack() {
		 
		 public void attack(Pokemon target) {
		 target.setPoisoned(true);
		 }
		 });
		 squirtle.lapse();
		 bulbasaur.lapse();
		 printScore(squirtle, bulbasaur);
		 squirtle.attack(bulbasaur, new Attack() {

			@Override
			public void attack(Pokemon target) {

				int hp = target.getHP();
				target.setHP(hp - 100);
				
			}
		});
		 
		 squirtle.levelUp(new Effect() {

			public void happen() {
				
				//code goes here
				//final if you want to modify a reference outside this body
				squirtle.setHP(100);
			}
		});
		 
		 }

	private static void printScore(Pokemon p1, Pokemon p2) {
System.out.println(p1.getName()+", HP = " + p1.getHP());	
System.out.println(p2.getName()+", HP = " + p2.getHP());		

	}

	
	
	
	
	
}
