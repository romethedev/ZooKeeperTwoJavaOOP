//Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.
public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat giantBat = new Bat();
		
		//have it attack three towns
		giantBat.attackTown();
		giantBat.attackTown();
		giantBat.attackTown();
		System.out.print("\n");
		
		//eat two humans
		giantBat.eatHumans();
		giantBat.eatHumans();
		System.out.print("\n");
		
		//and fly twice
		giantBat.fly();
		giantBat.fly();
		System.out.print("\n");
		
		//Show energy level:
		System.out.print("Giant Bat's enery level is currently: ");
		giantBat.displayEnergy();
		
	}

}
