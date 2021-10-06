package fruits.runtime.poly;

public class Strawberry extends Fruit {

	double transportcost;
	
	public Strawberry(String fruitName, String fruitSeason, String fruitVitamin, String fruitColor,
			double fruitPerTon, double transportcost) {
		super(fruitName, fruitSeason, fruitVitamin, fruitColor, fruitPerTon);
		// TODO Auto-generated constructor stub
		this.transportcost = transportcost;
	}

	@Override
	public void totalCost() {
		// TODO Auto-generated method stub
		System.out.println("Total Cost: " + (super.fruitPerTon + this.transportcost));
	}

}
