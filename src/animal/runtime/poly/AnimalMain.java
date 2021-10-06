package animal.runtime.poly;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal  = new Rhino(120, "Rhinosaurus","Dark Red Brown");
		animal.animalDisplay();
		animal.getAnimalType("Sumatran Rhino");
	}

}
