//Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
public class Bat extends Mammal {
	//since this mammals energy level is much higher we must set the default within the bat class
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	//For the fly() method, print the sound a bat taking off and decrease its energy by 50.
	public void fly() {
		System.out.println("Woosh! The giant bat flew off");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	
	//For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
	public void eatHumans() {
		System.out.println("The giant bat just refueled itself");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	//For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
	public void attackTown() {
		System.out.println("BOOM! Oh no! The giant bat just attacked a town!");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}
