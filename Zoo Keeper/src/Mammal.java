
public class Mammal {
	//Create a Mammal class that has an energyLevel and displayEnergy() method. The displayEnergy() method should show the animals energy level as well as return it.
	private int energyLevel = 100;
	
	//Empty Constructor
	public Mammal() {
		
	}
	
	//Method to show mammal energy level
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
	
	//getter
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	//setter
	public void setEnergyLevel(int energy) {
		this.energyLevel = energy;
	}
}
