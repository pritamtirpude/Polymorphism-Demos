package animal.complie.poly;

public class Animal {
	String animalName;
	String animalColor;
	int animalSize;
	
	public Animal(String animalName, String animalColor, int animalSize) {
		super();
		this.animalName = animalName;
		this.animalColor = animalColor;
		this.animalSize = animalSize;
	}
	
	
	public void getAnimal() {
		System.out.println("Animal name: " + this.animalName + "\nAnimal Color: " + this.animalColor + 
				"\nAnimal Size: " + this.animalSize);
	} 
	
	public void getAnimal(String breed, String type) {
		System.out.println("Breed: " + breed + "\nType: " + type);
	}
}
