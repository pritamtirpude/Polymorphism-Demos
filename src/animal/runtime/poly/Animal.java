package animal.runtime.poly;

public abstract class Animal {
	int animalSize;
	String animalName;
	String animalColor;
	
	public Animal(int animalSize, String animalName, String animalColor) {
		super();
		this.animalSize = animalSize;
		this.animalName = animalName;
		this.animalColor = animalColor;
	}
	
	public void animalDisplay() {
		System.out.println("Animal Name: " + this.animalName + "\nAnimal Color: " + this.animalColor +
				"\nAnimal Size: " + this.animalSize);
	}
	
	public abstract void getAnimalType(String type);
}
