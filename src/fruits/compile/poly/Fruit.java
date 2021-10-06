package fruits.compile.poly;

public class Fruit {
	
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
	
	public void getFruitInfo() {
		System.out.println("Fruit Name: " + this.fruitName + "\nFruit Color: " + this.fruitColor + 
				"\nFruit Vitamin: " + this.fruitVitamin + "\nFruit Season: " + this.fruitSeason + "\nFruit Per Ton: " + 
				this.fruitPerTon);
	}
	
	public void getFruitInfo(double tranportcost) {
		System.out.println("Total Cost: " + (this.fruitPerTon + tranportcost) );
	}
}
