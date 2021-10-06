package fruits.runtime.poly;

public abstract class Fruit {
	String fruitName;
	String fruitSeason;
	String fruitVitamin;
	String fruitColor;
	double fruitPerTon;
	
	public Fruit(String fruitName, String fruitSeason, String fruitVitamin, String fruitColor, double fruitPerTon) {
		super();
		this.fruitName = fruitName;
		this.fruitSeason = fruitSeason;
		this.fruitVitamin = fruitVitamin;
		this.fruitColor = fruitColor;
		this.fruitPerTon = fruitPerTon;
	}
	
	public void fruitDisplay() {
		System.out.println("Fruit Name: " + this.fruitName + "\nFruit Color: " + this.fruitColor + 
				"\nFruit Vitamin: " + this.fruitVitamin + "\nFruit Season: " + this.fruitSeason + "\nFruit Per Ton: " + 
				this.fruitPerTon);
	}
	
	public abstract void totalCost();
}
