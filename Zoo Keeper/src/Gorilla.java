//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
public class Gorilla extends Mammal {
	
	//For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
	public void throwSomething() {
		System.out.println("The gorilla threw some poo");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	//For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
	public void eatBanana() {
		System.out.println("The gorilla seems refueled as it eats a banana");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	//For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
	public void climb() {
		System.out.println("The gorilla just climbed up a tree");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
	
}
