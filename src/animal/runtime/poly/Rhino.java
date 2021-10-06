package animal.runtime.poly;

public class Rhino extends Animal{

	public Rhino(int animalSize, String animalName, String animalColor) {
		super(animalSize, animalName, animalColor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAnimalType(String type) {
		// TODO Auto-generated method stub
		System.out.println("Animal Type: " + type);
	}

}
